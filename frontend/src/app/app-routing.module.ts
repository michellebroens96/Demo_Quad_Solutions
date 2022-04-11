import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {QuestionComponent} from "./components/question/question.component";

const routes: Routes = [
  {
  path: '',
  redirectTo: 'home',
  pathMatch: 'full'
  },
  {
    path: 'home',
    component: QuestionComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
