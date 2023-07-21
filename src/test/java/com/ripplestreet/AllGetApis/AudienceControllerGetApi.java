package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class AudienceControllerGetApi extends genricUtilities {
	@Test(priority=20,groups="community-service")
	public void getParticipantsWithApplicationsForEvent() {
		response=RestAssured.given().queryParams("pageNo", page, "pageSize", size).when().get("/community-service/v1/event/participant/list?"+eventId+"&participantType=All");
		Testcase=20;
		
	}

}
