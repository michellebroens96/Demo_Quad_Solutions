package com.example.demo.controllers;

import com.example.demo.controllers.interfaces.IQuestionController;
import com.example.demo.models.Question;
import com.example.demo.repositories.interfaces.IQuestionRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/questions")
@RestController
public class QuestionController implements IQuestionController {

    private final IQuestionRepository repository;

    public QuestionController(IQuestionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String getQuestions() {
        String getOpenTDBQ = "https://opentdb.com/api.php?amount=5";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(getOpenTDBQ, String.class);
    }

    @PostMapping("/checkAnswer")
    public boolean checkAnswer(String answer, String question) {
        return repository.checkAnswer(answer, question);
    }
}
