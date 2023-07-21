package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class jobControllerGetApi extends genricUtilities {
	@Test(priority=99,groups = "common-service")
	public void getAllJobByTypeAndId() {
		response = RestAssured.given().get("/common-service/v1/job/" + sourceType + "/" + jobId);
		Testcase = 99;
	}

	@Test(priority=100,groups = "common-service")
	public void getAllListOfJobsBySourcetype() {
		response = RestAssured.given().queryParams("eventId", eventId, "size", size)
				.get("/common-service/v1/job/list/" + sourceType);
		Testcase = 100;

	}

}
