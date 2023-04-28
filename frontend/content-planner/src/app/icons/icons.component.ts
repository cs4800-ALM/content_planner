import { Component, OnInit } from '@angular/core';
import { Post } from '../post'
import { PostService } from '../post.service'

@Component({
  selector: 'app-icons',
  templateUrl: './icons.component.html',
  styleUrls: ['./icons.component.css']
})
export class IconsComponent implements OnInit {

  posts: Post[];

  constructor(private postService: PostService ) { }

  ngOnInit() {
    this.getPosts();
  }

  private getPosts(){
      this.postService.getPostsList().subscribe(data => {
        this.posts = data;
      });
  }

}
