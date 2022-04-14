package com.example.demo.controllers.interfaces;

import com.example.demo.models.Question;

public interface IQuestionController {
    String getQuestions();
    void checkAnswer(String answer, Question question);
}
