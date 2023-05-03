import { Component, OnInit } from '@angular/core';
import { Post } from '../post';
import { PostService } from '../post.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-insta',
  templateUrl: './update-insta.component.html',
  styleUrls: ['./update-insta.component.scss']
})
export class UpdateInstaComponent implements OnInit {


  id: number;
  post: Post = new Post();

  constructor(private postService: PostService,
                  private route: ActivatedRoute,
                  private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

        this.postService.getPostById(this.id).subscribe(data => {
          this.post = data;
        }, error => console.log(error));
  }

  onSubmit(){
      this.postService.updatePost(this.id, this.post).subscribe( data =>{
        this.goToPostsList();
      }
      , error => console.log(error));
  }

    goToPostsList(){
      this.router.navigate(['/icons']);
    }

}


