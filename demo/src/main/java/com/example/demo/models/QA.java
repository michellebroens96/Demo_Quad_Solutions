package com.example.demo.models;

public class QA {
    private final String question;
    private final String answer;
    private final Question[] questions;

    public QA(String question, String answer, Question[] questions) {
        this.question = question;
        this.answer = answer;
        this.questions = questions;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public Question[] getQuestions() {
        return questions;
    }

}
