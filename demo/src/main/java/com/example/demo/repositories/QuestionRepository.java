package com.example.demo.repositories;

import com.example.demo.repositories.interfaces.IQuestionRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class QuestionRepository implements IQuestionRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void getQuestions() {

    }

    @Override
    public void checkAnswer(String answer) {
        //TODO check if the answer is correct
    }
}
