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



  ngOnInit(): void {
    this.activateRoute.paramMap.subscribe(params=>{
      let id = params.get("id")??0;
      this.employeeService.getEmployeeById(+id).subscribe(
        data => {this.employee = data;}
      )
    })
  }

}
