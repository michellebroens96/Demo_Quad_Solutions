package com.example.demo.repositories;

import com.example.demo.models.Question;
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
    public Question getQuestionByName(String question) {
        return null;
    }

    @Override
    public boolean checkAnswer(String answer, String question) {
        //TODO get question by name
        Question newQuestion = getQuestionByName(question);
        if (answer == newQuestion.getCorrect_answer()){
            return true;
        }
        return false;
    }
}
