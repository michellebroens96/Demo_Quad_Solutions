package com.example.demo.controllers;

import com.example.demo.controllers.interfaces.IQuestionController;
import com.example.demo.repositories.interfaces.IQuestionRepository;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/questions")
@RestController
public class QuestionController implements IQuestionController {

    private final IQuestionRepository repository;

    public QuestionController(IQuestionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public void getQuestions() {

    }

    @PostMapping("/checkAnswer")
    public void checkAnswer() {

    }
}
