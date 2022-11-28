import { Component, OnInit } from '@angular/core';
import { Employee } from '../model/employee';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  constructor(private emplyeeService: EmployeeService) { }

  addEmployee: Employee = {};

  addEmloyee() {
    this.emplyeeService.addEmployees(this.addEmployee).subscribe({
      next: () => alert("employee Added successfully")
    });
  }

  ngOnInit(): void {
  }

}
