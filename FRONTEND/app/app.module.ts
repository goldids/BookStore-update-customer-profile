import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UpdateUserProfileComponent } from './update-user-profile/update-user-profile.component';
import { HttpClientModule } from '@angular/common/http';
import { ViewCustomerdetailsComponent } from './view-customerdetails/view-customerdetails.component';



@NgModule({
  declarations: [
    AppComponent,
    UpdateUserProfileComponent,
    ViewCustomerdetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
