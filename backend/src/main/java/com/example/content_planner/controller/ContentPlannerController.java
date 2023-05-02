package com.example.content_planner.controller;
import com.example.content_planner.model.ContentPost;
import com.example.content_planner.service.ContentPostService;
import com.example.content_planner.repo.PostsRepo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class ContentPlannerController {

    private final ContentPostService contentPostService;

    @Autowired
    private PostsRepo postRepository;

    public ContentPlannerController(ContentPostService contentPostService) {
        this.contentPostService = contentPostService;
    }

    // return all posts
    @GetMapping("/all")
    public ResponseEntity<List<ContentPost>> getAllContentPosts() {
        List<ContentPost> contentPosts = contentPostService.findAllContentPosts();
        return new ResponseEntity<>(contentPosts, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<ContentPost> getContentPostsByID(@PathVariable("id") Long id) {
        ContentPost contentPosts = contentPostService.findContentPostByID(id);
        return new ResponseEntity<>(contentPosts, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ContentPost> addContentPost(@RequestBody ContentPost contentPost) {
        ContentPost newContentPosts = contentPostService.addContentPost(contentPost);
        return new ResponseEntity<>(newContentPosts, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<ContentPost> updateContentPost(@RequestBody ContentPost contentPost) {
        ContentPost updateContentPosts = contentPostService.updateContentPost(contentPost);
        return new ResponseEntity<>(updateContentPosts, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteContentPost(@PathVariable("id") Long id) {
        contentPostService.deleteContentPost(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/search")
    public List<ContentPost> searchPosts(@RequestParam String query) {
        List<ContentPost> posts = postRepository.searchPostsByTitle(query);
        return posts;
    }

//}

    //    @RequestMapping(method = RequestMethod.GET, value = "/demo")
    @GetMapping("/")
    public String aName() {
        return "index-original.html";
    }
}
//
//    @PostMapping("/register")
//    public String contentSearch(@ModelAttribute ContentPlanner contentPlanner, Model model) {
//
//        System.out.println(contentPlanner.toString());
//
//        // validate
//        System.out.println(contentPlanner.getTitle());
//        System.out.println(contentPlanner.getDate());
//
//        String tempDate = contentPlanner.getDate();
//
//        // simple search bar to search through Key: title for the draft of content Value: date mm/dd/yyyy
//        // if date == dateEntered, then list all titles
//        Dictionary<String, String> search_content = new Hashtable<>();
//        search_content.put("Test content title 1", "02/26/2023");  // one
//        search_content.put("Test content title 2", "02/28/2023");
//        search_content.put("Test content title 3", "03/01/2023");
//        search_content.put("Test content title 4", "03/02/2023");
//        search_content.put("Test content title 5", "03/03/2023");
//        search_content.put("Test content title 6", "02/26/2023"); // two
//        search_content.put("Test content title 7", "03/05/2023");
//        search_content.put("Test content title 8", "03/06/2023");
//        search_content.put("Test content title 9", "03/07/2023");
//        search_content.put("Test content title 10","02/26/2023"); // three    - if the user enters the date of 2/26/2023, then 3 different titles should populate
//
//        // arrayList to hold the result that will display
//        ArrayList<String> result = new ArrayList<String>();
//
//        // Enumerating the elements of the dictionary
//        Enumeration<String> keys = search_content.keys();
//
//        // search the dictionary to see if the date that the user entered matches anything in the database
//        while (keys.hasMoreElements()){
//            String key = keys.nextElement();
//            String value = search_content.get(key);
//
//            // if the date in the db matches the date that the user entered, then add this to the array list
//            if(value.contentEquals(tempDate)){
//                result.add("Title: " + key + " | " + "Date to Post: " + value);
//            }
//        }
//
//        // Creating Object of ObjectMapper define in Jackson
//        // Api
//        ObjectMapper Obj = new ObjectMapper();
//
//        String jsonStr = null;
//
//        // Try block to check for exceptions
//        try {
//
//            // Getting organisation object as a json string
//            jsonStr = Obj.writeValueAsString(result);
//
//            // Displaying JSON String on console
//            System.out.println(jsonStr);
//        }
//
//        // Catch block to handle exceptions
//        catch (IOException e) {
//
//            // Display exception along with line number
//            // using printStackTrace() method
//            e.printStackTrace();
//        }
//
//
//        model.addAttribute("title", jsonStr);
////        model.addAttribute("date", contentPlanner.getDate());
//
//        return "index2";
//    }
