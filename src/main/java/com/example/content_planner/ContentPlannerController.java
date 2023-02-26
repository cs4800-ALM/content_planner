package com.example.content_planner;

import java.util.concurrent.atomic.AtomicLong;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentPlannerController {


    @GetMapping("/search/budget")
    public static String search_food(@RequestParam Integer budget) {

        // database using a dictionary for name and price
        Dictionary<String, Integer> food_db = new Hashtable<>();
        food_db.put("Sandwich", 5);
        food_db.put("Hamburger", 10);
        food_db.put("Hotdog", 2);
        food_db.put("Pizza", 25);

        String result[] = new String[food_db.size()];

        // Enumerating the elements of the dictionary
        Enumeration<String> keys = food_db.keys();


        int index = 0;
        while (keys.hasMoreElements()){
            String key = keys.nextElement();
            int value = food_db.get(key);

            if(value <= budget){
                result[index] = key;
                index++;
            }

        }

        // Creating Object of ObjectMapper define in Jackson
        // Api
        ObjectMapper Obj = new ObjectMapper();

        String jsonStr = null;

        // Try block to check for exceptions
        try {

            // Getting organisation object as a json string
            jsonStr = Obj.writeValueAsString(result);

            // Displaying JSON String on console
            System.out.println(jsonStr);
        }

        // Catch block to handle exceptions
        catch (IOException e) {

            // Display exception along with line number
            // using printStackTrace() method
            e.printStackTrace();
        }

        return jsonStr;
    }

//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();
//
//    @GetMapping("/greeting")
//    public ContentPlanner greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//        return new ContentPlanner(counter.incrementAndGet(), String.format(template, name));
//    }
}
