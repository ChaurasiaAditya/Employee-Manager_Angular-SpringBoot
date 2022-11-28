import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { DashBoardComponent } from "./dash-board/dash-board.component";
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    DashBoardComponent
  ],
  providers: [],
  bootstrap: [AppComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    FormsModule

  ]
})
export class AppModule { }
