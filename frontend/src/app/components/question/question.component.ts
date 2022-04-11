import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {QuestionService} from "../../services/question/question.service";

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.css']
})
export class QuestionComponent implements OnInit {

  questions: any;

  constructor(private router: Router,
              private questionService: QuestionService) { }

  ngOnInit(): void {
    this.getQuestions();
  }


  getQuestions(){
    this.questionService.getQuestions().subscribe(
      data =>{
        this.questions = data;
      }
    )
  }
}
