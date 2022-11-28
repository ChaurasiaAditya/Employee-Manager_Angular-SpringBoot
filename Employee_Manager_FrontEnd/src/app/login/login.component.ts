import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private loginservice: LoginService, private router: Router) { }


  username: string = ""
  password: string = ""

  loginfun() {
    if (this.username == "admin" && this.password == "admin") {
      this.loginservice.allowlogin = true;
      alert("login success")
      this.router.navigateByUrl("admin")
    } else {
      this.loginservice.allowlogin = false;
      alert("login failed")
      this.router.navigateByUrl("home")
    }
  }
  ngOnInit(): void {
  }

}
