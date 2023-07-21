package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class ReservationControllerGetApi extends genricUtilities
{
	@Test(priority=41,groups="community-service")
	public void GetUserStatusCountbyEventId() {
		response = RestAssured.given().when().get("/community-service/v1/getStatusCount/" + eventId);
		Testcase=41;

	}

}
