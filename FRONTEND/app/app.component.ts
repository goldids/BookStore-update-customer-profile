import { Component } from '@angular/core';
import { UpdateuserprofileserviceService } from './updateuserprofileservice.service';
import { Router } from '@angular/router';
import { CustomerInfomation } from './customer-infomation';
import {NgModule } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  title = 'updateUserProfile';
  constructor() { }
 
}
