package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class ApplicationControllerGetApi extends genricUtilities {
	@Test(priority=19,groups="community-service")
	public void getAllApplications() {
		RestAssured.baseURI=baseURI;
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size).when()
				.get("/community-service/v1/event/" + eventId + "/application/list");
		Testcase = 19;
	}
}
