package org.example;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import javax.tools.StandardJavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import java.net.URI;
import java.io.IOException;

public class DynamicCompiler {
    public static void main(String[] args) {
        String sourceCode = "public class Test { public static void main(String[] args) { System.out.println(\"Hello, World\"); } }";

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        try (StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null)) {

            class JavaSourceFromString extends SimpleJavaFileObject {
                final String code;

                JavaSourceFromString(String name, String code) {
                    super(URI.create("string:///" + name.replace('.', '/') + JavaFileObject.Kind.SOURCE.extension), JavaFileObject.Kind.SOURCE);
                    this.code = code;
                }

                @Override
                public CharSequence getCharContent(boolean ignoreEncodingErrors) {
                    return code;
                }
            }

            JavaFileObject file = new JavaSourceFromString("Test", sourceCode);

            compiler.getTask(null, fileManager, null, null, null, java.util.Collections.singletonList(file)).call();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}