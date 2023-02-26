package com.example.content_planner;

import java.util.concurrent.atomic.AtomicLong;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentPlannerController {

    @GetMapping("/search/date")
    public static String search_content(@RequestParam String date) {

        // simple search bar to search through Key: title for the draft of content Value: date mm/dd/yyyy
        // if date == dateEntered, then list all titles
        Dictionary<String, String> search_content = new Hashtable<>();
        search_content.put("Test content title 1", "02/26/2023");  // one
        search_content.put("Test content title 2", "02/28/2023");
        search_content.put("Test content title 3", "03/01/2023");
        search_content.put("Test content title 4", "03/02/2023");
        search_content.put("Test content title 5", "03/03/2023");
        search_content.put("Test content title 6", "02/26/2023"); // two
        search_content.put("Test content title 7", "03/05/2023");
        search_content.put("Test content title 8", "03/06/2023");
        search_content.put("Test content title 9", "03/07/2023");
        search_content.put("Test content title 10","02/26/2023"); // three    - if the user enters the date of 2/26/2023, then 3 different titles should populate

        // arrayList to hold the result that will display
        ArrayList<String> result = new ArrayList<String>();

        // Enumerating the elements of the dictionary
        Enumeration<String> keys = search_content.keys();

        // search the dictionary to see if the date that the user entered matches anything in the database
        while (keys.hasMoreElements()){
            String key = keys.nextElement();
            String value = search_content.get(key);

            // if the date in the db matches the date that the user entered, then add this to the array list
            if(value.contentEquals(date)){
                result.add("Title: " + key + " | " + "Date to Post: " + value);
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
}
