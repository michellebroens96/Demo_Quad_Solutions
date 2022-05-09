package com.example.demo.repositories;

import com.example.demo.models.QA;
import com.example.demo.models.Question;
import com.example.demo.repositories.interfaces.IQuestionRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.List;

@Repository
public class QuestionRepository implements IQuestionRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Question getQuestionByName(QA qa) {
        List<Question> questions = Arrays.asList(qa.getQuestions());
        for (Question q: questions){
            if (q.getQuestion() == qa.getQuestion()){
                return q;
            }
        }
        return null;
    }

    @Override
    public boolean checkAnswer(QA qa) {
        Question newQuestion = getQuestionByName(qa);
        if (qa.getAnswer() == newQuestion.getCorrect_answer()){
            return true;
        }
        return false;
    }
}
