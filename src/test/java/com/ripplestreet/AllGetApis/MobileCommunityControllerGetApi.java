package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class MobileCommunityControllerGetApi extends genricUtilities {
	/// community-service/community/getAllEventsByUser/9593101?page=1&size=10
	@Test(priority=36,groups="community-service")
	public void getAllEventsByUserAndParticipantTypeApplicant() {
		response = RestAssured.given().queryParams("page", page, "size", size).when()
				.get("/community-service/community/getAllEventsByUser/" + pid);
		Testcase = 36;

	}

	@Test(priority=37,groups="community-service")
	public void getActiveEventsDetailForUser() {
		response = RestAssured.given().when().get("/community-service/community/user/" + pid + "/activeEvent/list");
		Testcase = 37;

	}

}
