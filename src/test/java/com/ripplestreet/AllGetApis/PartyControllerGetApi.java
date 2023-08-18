package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class PartyControllerGetApi extends genricUtilities {
	@Test(priority=40,groups="community-service")
	public void getlistofparties() {
		response = RestAssured.given().param("eventId", eventId).queryParam("pageNo", page).queryParam("pageSize", size).when()
				.get("/community-service/v1/event/"+eventId+"/party/list");
		Testcase = 40;

	}
	
}
