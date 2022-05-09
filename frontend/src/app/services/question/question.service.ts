import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Router} from "@angular/router";
import {environment} from "../../../environments/environment";
import {Question} from "../../models/Question";
import {Observable} from "rxjs";
import {Json} from "../../models/Json";
import {QA} from "../../models/QA";

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
              private http: HttpClient) {
  }

  getQuestions(): Observable<Json> {
    return this.http.get<Json>(`${environment.apiUrl}/questions`);
  }

  checkAnswer(qa: QA): Observable<boolean> {
    //TODO checks if string == answer from gotten question
    return this.http.post<boolean>(` ${environment.apiUrl}/questions/checkAnswer`, qa, httpOptions);
  }
}


