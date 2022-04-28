package com.example.demo.repositories.interfaces;

import com.example.demo.models.Question;

public interface IQuestionRepository {
    void getQuestions();
    Question getQuestionByName(String question);
    boolean checkAnswer(String answer, String question);
}
