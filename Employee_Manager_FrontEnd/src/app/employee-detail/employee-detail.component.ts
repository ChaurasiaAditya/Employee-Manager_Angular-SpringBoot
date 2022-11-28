import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../model/employee';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-employee-detail',
  templateUrl: './employee-detail.component.html',
  styleUrls: ['./employee-detail.component.css']
})
export class EmployeeDetailComponent implements OnInit {

  employee:Employee = {};

  constructor(private employeeService: EmployeeService, private activateRoute:ActivatedRoute) { }

  email:String = "";
  password:String = "";

  login() {
    this.employeeService.loginEmployee(this.email,this.password).subscribe({
      next: (data)=> this.employee = data })
    }



  ngOnInit(): void {
    this.activateRoute.paramMap.subscribe(params=>{
      let email = params.get("email")??"";
      let password = params.get("employeePassword")??"";
      this.employeeService.loginEmployee(email,password).subscribe(
        data => {this.employee = data;}
      )
    })
  }

}
