import { Component, OnInit } from '@angular/core';
import { Post } from '../post'
import { PostService } from '../post.service'
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-icons',
  templateUrl: './icons.component.html',
  styleUrls: ['./icons.component.css']
})
export class IconsComponent implements OnInit {

  searchQuery: string;
  searchResults$: Observable<any>;
  posts: Post[];

  constructor(private postService: PostService,
      private router: Router, private route: ActivatedRoute, 
      private http: HttpClient) { }

  ngOnInit() {
  //  this.getPosts();
    this.route.queryParamMap.subscribe(params => {
      this.searchQuery = params.get('query');
      this.searchResults$ = this.getSearchResults(this.searchQuery);
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

    getSearchResults(query: string): Observable<any> {
      const url = `https://something.com/posts/search?query=${query}`;
      return this.http.get<any>(url);
    }
  

    deletePost(id: number){
      this.postService.deletePost(id).subscribe( data => {
        console.log(data);
        this.getPosts();
      })
    }

}
