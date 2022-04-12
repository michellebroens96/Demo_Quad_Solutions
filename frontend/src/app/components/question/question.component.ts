import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {QuestionService} from "../../services/question/question.service";
import {Question} from "../../models/Question";
import {Json} from "../../models/Json";

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.css']
})
export class QuestionComponent implements OnInit {

  response: Json;
  questions: Question[] = [];

  constructor(private router: Router,
              private questionService: QuestionService) {
  }

  ngOnInit(): void {
    this.getQuestions();
  }


  getQuestions() {
    this.questionService.getQuestions().subscribe(
      data => {
        this.response = data;
        this.questions = this.response.results;
      }
    )
  }

  getAnswersAndRandomize() {

  }
}
