import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Employee } from './model/employee';
import { EmployeeService } from './services/employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'EmployeeManager';

  employees: Employee[] = [];
  
  

  constructor(private emplyeeService: EmployeeService) { }

  ngOnInit(): void {
    // console.log(this.employees);
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
