package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class userFamilyControllerGetApi extends genricUtilities {
	@Test(priority=42,groups="community-service")
	public void getUserChildern() {
		response=RestAssured.given().when().get("/community-service/v1/userFamily/children/"+pid);
		Testcase=42;
	}
	@Test(priority=43,groups="community-service")
	public void getAllPetTypes() {
		response=RestAssured.given().when().get("/community-service/v1/userFamily/petType/list");
		Testcase=43;
		
	}
	@Test(priority=44,groups="community-service")
	public void getAllPetsForUser() {
		response=RestAssured.given().when().get("/community-service/v1/userFamily/pets/"+pid);
		Testcase=44;
		
	}

}
