package com.example.demo.repositories;

import com.example.demo.repositories.interfaces.IQuestionRepository;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionRepository implements IQuestionRepository {
    @Override
    public void getQuestions() {

    }

    @Override
    public void checkAnswer() {

    }
}
