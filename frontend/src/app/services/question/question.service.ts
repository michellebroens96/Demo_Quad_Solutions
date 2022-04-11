import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Router} from "@angular/router";
import {environment} from "../../../environments/environment";

const httpOptions = {
headers: new HttpHeaders({
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': '*',
    'Access-Control-Allow-Methods': 'GET, POST, OPTIONS'
  })
}

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  constructor(private router: Router,
              private http: HttpClient) { }

  getQuestions(){
    return this.http.get(`${environment.apiUrl}/questions`, httpOptions);
  }

  checkAnswer(answer: string){
      //TODO checks if string == answer from gotten question
  }
}


