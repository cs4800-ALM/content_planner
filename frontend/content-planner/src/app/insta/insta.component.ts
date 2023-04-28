import { Component, OnInit } from '@angular/core';
// import { NgModule} from '@angular/core';
import { Post } from '../post';
import { PostService } from '../post.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-insta',
  templateUrl: './insta.component.html',
  styleUrls: ['./insta.component.scss']
})
export class InstaComponent implements OnInit {

  post: Post = new Post();
  constructor(private postService: PostService,  private router: Router) { }

  ngOnInit(): void {
  }

  savePost(){
      this.postService.createPost(this.post).subscribe( data =>{
        console.log(data);
        this.goToPostList();
      },
      error => console.log(error));
    }

  goToPostList(){
      this.router.navigate(['/#/insta']);
    }

  onSubmit(){
    console.log(this.post);
    this.savePost();
  }

}
