import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CustomerInfomation } from './customer-infomation';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UpdateuserprofileserviceService {

  constructor(private http:HttpClient) { }
  customer:CustomerInfomation;
  customerid:number;
  showcustomerinfo:boolean;
  getcustomerinfo(customerid:number):Observable<any>
  {
    return this.http.get("http://localhost:1079/updateprofile/"+customerid);
  }
  updatecustomerinfo(customer:CustomerInfomation):Observable<any>
  {
    return this.http.put("http://localhost:1079/updateprofile/update/"+this.customerid+"/",customer,{responseType:'text'});
  }
}
