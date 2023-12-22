package org.example;


import lombok.Getter;

@Getter
public class Task {
    private String description;
    private String solution;
    private boolean isCorrect;

    public Task(String description, String solution, boolean isCorrect) {
        this.description = description;
        this.solution = solution;
        this.isCorrect = isCorrect;
    }
}

