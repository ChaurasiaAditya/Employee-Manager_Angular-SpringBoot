import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Employee } from '../model/employee';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-dash-board',
  templateUrl: './dash-board.component.html',
  styleUrls: ['./dash-board.component.css']
})
export class DashBoardComponent implements OnInit {

  employees: Employee[] = [];
  
  

  constructor(private emplyeeService: EmployeeService) { }

  ngOnInit(): void {
    this.getEmployees();
  }

  public getEmployees(): void {
    this.emplyeeService.getEmployees().subscribe(
      {
        next: (data:Employee[]) => { this.employees = data; },
        error: (error: HttpErrorResponse) => { alert(error.message); }
      }
    )
  };

}
