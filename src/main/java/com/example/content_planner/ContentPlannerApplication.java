package com.example.content_planner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

@SpringBootApplication
public class ContentPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentPlannerApplication.class, args);

// Linda - testing out Jsoup lib for A4
		// This example shows you how to use jsoup to get page’s title and grabs all links from “google.com”.
		Document doc;
		try {

			// need http protocol
			doc = Jsoup.connect("http://google.com").get();

			// get page title
			String title = doc.title();
			System.out.println("title : " + title);

			// get all links
			Elements links = doc.select("a[href]");
			for (Element link : links) {

				// get the value from href attribute
				System.out.println("\nlink : " + link.attr("href"));
				System.out.println("text : " + link.text());

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}