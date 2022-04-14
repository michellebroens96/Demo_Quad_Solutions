import {CommonModule} from '@angular/common';
import {NgModule} from '@angular/core';
import {SanitizeHtml} from "./pipes/sanitizeHtml";

@NgModule({
  imports: [CommonModule],
  declarations: [SanitizeHtml],
  exports: [SanitizeHtml],
})
export class SharedModule {
}
