package com.example.demo.contollers;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class QuestionControllerTests {

    @Test
    public void getQuestions() throws IOException {
        //Arrange
        HttpUriRequest request = new HttpGet("http://localhost:8080/questions");

        //Act
        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        //Assert
        Assert.assertEquals("200 OK", response);
    }

    @Test
    public void checkAnswer() throws IOException {
        //Arrange
        HttpUriRequest request = new HttpPost("http://localhost:8080/questions/checkAnswer");

        //Act
        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        //Assert
        Assert.assertEquals("200 OK", response);
    }
}
