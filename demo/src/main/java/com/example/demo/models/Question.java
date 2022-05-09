package com.example.demo.models;

public class Question {
private final String question;
private final String category;
private final String type;
private final String difficulty;
private final String correct_answer;
private final String[] incorrect_answers;

    public Question(String question, String category, String type, String difficulty, String correct_answer, String[] incorrect_answers) {
        this.question = question;
        this.category = category;
        this.type = type;
        this.difficulty = difficulty;
        this.correct_answer = correct_answer;
        this.incorrect_answers = incorrect_answers;
    }

    public String getQuestion() {
        return question;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public String[] getIncorrect_answers() {
        return incorrect_answers;
    }
}
