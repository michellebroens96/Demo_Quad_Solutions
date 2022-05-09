package com.example.demo.controllers.interfaces;

import com.example.demo.models.QA;
import com.example.demo.models.Question;

public interface IQuestionController {
    String getQuestions();
    boolean checkAnswer(QA qa);
}
