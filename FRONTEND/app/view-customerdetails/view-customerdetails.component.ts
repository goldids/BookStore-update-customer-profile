import { Component, OnInit } from '@angular/core';
import { CustomerInfomation } from '../customer-infomation';
import { UpdateuserprofileserviceService } from '../updateuserprofileservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-customerdetails',
  templateUrl: './view-customerdetails.component.html',
  styleUrls: ['./view-customerdetails.component.css']
})
export class ViewCustomerdetailsComponent implements OnInit {


  ngOnInit(): void {
    if(this.eser.showcustomerinfo==true)
    {
      this.eser.getcustomerinfo(this.customerid).subscribe(data=>
        {
        this.customerinfo=data;
        console.log(data);
       this.showcustomerinfo=true;
        alert(data);
      },
        error=>
        {
          console.log("error occured",error);
          this.errormsg=JSON.parse(error.error).message;
          console.log(error);
          this.msg=undefined;
        }
      );
    }
  }
  title = 'updateUserProfile';
  constructor(private eser:UpdateuserprofileserviceService,private router: Router) { }
  customerinfo:CustomerInfomation;
  showcustomerinfo:boolean;
  customerid:number;
  errormsg:string;
  msg:String;
  getuserinfo()
  {
    this.eser.getcustomerinfo(this.customerid).subscribe(data=>
      {
      this.customerinfo=data;
      console.log(data);
      this.eser.customer=this.customerinfo;
        this.eser.customerid=this.customerid;
      this.showcustomerinfo=true;
      this.eser.showcustomerinfo=this.showcustomerinfo;
    },
      error=>
      {
        console.log("error occured",error);
        this.errormsg=JSON.parse(error.error).message;
        console.log(error);
        this.msg=undefined;
      }
    );
  }
  gotoupdate(page:string){
    this.router.navigate([`${page}`]);
  }
}
