import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {QuestionService} from "../../services/question/question.service";
import {Question} from "../../models/Question";
import {Json} from "../../models/Json";
import {FormBuilder} from "@angular/forms";
import {QA} from "../../models/QA";

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.css']
})
export class QuestionComponent implements OnInit {

  response: Json;
  questions: Question[] = [];
  answers: string[] = [];
  selectedAnswer: string = "";
  qa: QA;

  constructor(private router: Router,
              private questionService: QuestionService) {
  }

  ngOnInit(): void {
    this.qa = new QA();
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

  onSubmit() {

  }

  saveAnswer(question: string, answer: string) {
    if (answer != "") {
      this.qa.question = question;
      this.qa.answer = answer;
      this.qa.questions = this.questions
      this.questionService.checkAnswer(this.qa).subscribe(
        data => {
          console.log(data)
          if (data == true) {
            alert("good answer")
          }
        }
      )
    }
  }

}
