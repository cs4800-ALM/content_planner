// import { Component } from '@angular/core';
//
// @Component({
//   selector: 'app-root',
//   templateUrl: './app.component.html',
//   styleUrls: ['./app.component.css']
// })
// export class AppComponent {
//   title = 'content-planner-ui';
// }

import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ContentPlannerService } from './content-planner.service';
import { ContentPost } from './ContentPost';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'content-planner-ui';


  public contentPosts: ContentPost[] = [];

  constructor(private contentPlannerService: ContentPlannerService){ }

  ngOnInit(): void {
      this.getContentPosts();
  }

  public getContentPosts(): void{
    this.contentPlannerService.getContentPosts().subscribe(
      (response: ContentPost[]) => {
        this.contentPosts = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public onAddContentPost(addForm: NgForm): void{

    this.contentPlannerService.addContentPost(addForm.value).subscribe(
      (response: ContentPost) => {
        console.log(response);
        this.getContentPosts();
      },
      (error: HttpErrorResponse) => {
        alert(error.message)
      }
    );
  }


}


