import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UpdateUserProfileComponent } from './update-user-profile/update-user-profile.component';
import { ViewCustomerdetailsComponent } from './view-customerdetails/view-customerdetails.component';


const routes: Routes = [
  {path:'',component:ViewCustomerdetailsComponent},
  {path:'aupdateuserprofile',component:UpdateUserProfileComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
