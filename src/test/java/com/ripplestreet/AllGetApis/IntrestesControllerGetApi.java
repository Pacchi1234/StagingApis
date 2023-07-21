package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class IntrestesControllerGetApi extends genricUtilities {
	@Test(priority=34,groups="community-service")
	public void Allcategorieslist() {
		response=RestAssured.given().when().get("/community-service/interests");
		Testcase=34;

	}
	@Test(priority=35,groups="community-service")
	public void getUserInterestByPersonId() {
		response=RestAssured.given().when().get("/community-service/interests/"+pid);
		Testcase=35;
	
	}

}
