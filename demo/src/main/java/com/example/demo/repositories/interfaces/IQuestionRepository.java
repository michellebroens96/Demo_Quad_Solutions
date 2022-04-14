package com.example.demo.repositories.interfaces;

import com.example.demo.models.Question;

public interface IQuestionRepository {
    void getQuestions();
    boolean checkAnswer(String answer, Question question);
}
