import { Component, OnInit } from '@angular/core';
import { NgModule} from '@angular/core';
import { User } from './user';
import { UserService } from './user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  user: User = new User();
  constructor(private userService: UserService, private router: Router) { }

  ngOnInit(): void {
//     this.getUser();
  }

  saveUser(){
      this.userService.createUser(this.user).subscribe( data =>{
        console.log(data);
        this.goToUserList();
      },
      error => console.log(error));
    }

  goToUserList(){
      this.router.navigate(['/insta']);
    }


//  private getUser(){
//        this.userService.getUsersList().subscribe(data => {
//          this.user = data;
//        });
//    }

  updateUser(id: number){
        this.router.navigate(['user', id]);
      }

    onSubmit(){
      console.log(this.user);
      this.saveUser();
    }


}
