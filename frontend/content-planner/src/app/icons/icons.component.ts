import { Component, OnInit } from '@angular/core';
import { Post } from '../post'
import { PostService } from '../post.service'
import { Router } from '@angular/router';
import {Subject} from 'rxjs';

@Component({
  selector: 'app-icons',
  templateUrl: './icons.component.html',
  styleUrls: ['./icons.component.css']
})
export class IconsComponent implements OnInit {

// added
  dtOptions: DataTables.Settings = {};
  dtTrigger: Subject<any> = new Subject<any>();

  posts: Post[];


  constructor(private postService: PostService,
      private router: Router) {}

  ngOnInit() {
    this.getPosts();
    this.searchPost();
  }

    // added code
    ngOnDestroy(): void {
      this.dtTrigger.unsubscribe();
    }

  searchPost(): void {
    this.postService
        .getPostsList()
        .subscribe((response: any) => {
          this.posts = response;
          // initiate our data table
          this.dtTrigger.next(null);
        });
  }


  private getPosts(){
      this.postService.getPostsList().subscribe(data => {
        this.posts = data;
      });
  }

//    postDetails(id: number){
//       this.router.navigate(['post-details', id]);
//     }

    updatePost(id: number){
      this.router.navigate(['update-insta', id]);
    }

    deletePost(id: number){
      this.postService.deletePost(id).subscribe( data => {
        console.log(data);
        this.getPosts();
      })
    }

}
