package com.example.demo.repositories.interfaces;

import com.example.demo.models.QA;
import com.example.demo.models.Question;

public interface IQuestionRepository {
    Question getQuestionByName(QA qa);
    boolean checkAnswer(QA qa);
}
