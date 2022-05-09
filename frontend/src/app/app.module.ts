import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {QuestionComponent} from "./components/question/question.component";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {SharedModule} from "./app.sharemodule";

@NgModule({
  declarations: [
    AppComponent,
    QuestionComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    SharedModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
