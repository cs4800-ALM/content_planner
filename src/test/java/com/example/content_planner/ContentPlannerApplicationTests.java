package com.example.content_planner;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

@SpringBootTest
class ContentPlannerApplicationTests {

	@Test
	void contextLoads() {
	}


	// Unit test to test the length of dates being inputted into the database
	// should not be longer than 10 characters long
	// testInternalDB1 is the correct length
	// testInternalDB2 is the incorrect length
    @Test
	public void testInternalDB1(){

		ContentPlannerApplication cpa = new ContentPlannerApplication();

		ContentPlanner cp = new ContentPlanner();

		cp.setDate("03/14/2023");

		// UNIT TEST TO CHECK FOR STRING LENGTH
		assert cp.getDate().length() == 10 : "String length is CORRECT";

		cpa.internalDB(cp);

	}

	@Test
	public void testInternalDB2(){

		ContentPlannerApplication cpa = new ContentPlannerApplication();

		ContentPlanner cp = new ContentPlanner();

		cp.setDate("03/0004/2023");


		// UNIT TEST TO CHECK FOR STRING LENGTH
		assert cp.getDate().length() == 10 : "String length is INCORRECT";

		cpa.internalDB(cp);

	}

	@Test
	public void testValidateSearchDate1(){
		ContentPlannerApplication cpa = new ContentPlannerApplication();

		ContentPlanner cp = new ContentPlanner();

		cp.setDate("11/11/1111");

		assert cpa.validateSearchDate(cp) == false : "Invalid Year";
	}

	@Test
	public void testValidateSearchDate2(){
		ContentPlannerApplication cpa = new ContentPlannerApplication();

		ContentPlanner cp = new ContentPlanner();

		cp.setDate("11/43/2023");

		assert cpa.validateSearchDate(cp) == false : "Invalid Day";
	}

	@Test
	public void testValidateSearchDate3(){
		ContentPlannerApplication cpa = new ContentPlannerApplication();

		ContentPlanner cp = new ContentPlanner();

		cp.setDate("44/13/2023");

		assert cpa.validateSearchDate(cp) == false : "Invalid Month";
	}

	@Test
	public void testValidateSearchDate4(){
		ContentPlannerApplication cpa = new ContentPlannerApplication();

		ContentPlanner cp = new ContentPlanner();

		cp.setDate("12/13/2023");

		assert cpa.validateSearchDate(cp) == true : "Valid Date";
	}
}
