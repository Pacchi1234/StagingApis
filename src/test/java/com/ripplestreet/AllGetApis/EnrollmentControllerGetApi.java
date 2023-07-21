package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class EnrollmentControllerGetApi extends genricUtilities {
	@Test(priority=32,groups="community-service")
	public void EnrollmentList() {
		response=RestAssured.given().when().get("/community-service/enrollment/list");
		Testcase=32;
	}
	@Test(priority=33,groups="community-service")
	public void GetUserEnrollments() {
		response=RestAssured.given().when().get("/community-service/enrollments/"+pid);
		Testcase=33;
		
	}

}
