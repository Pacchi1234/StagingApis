package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class AudiencePromotionControllerGetApi extends genricUtilities {
	@Test(priority=21,groups="community-service")
	public void getListOfAudiencePromotionJobsByEventId() {
		response=RestAssured.given().when().get("/community-service/v1/audience-promotion-jobs/list/"+eventId);
		Testcase=21;
	}
	@Test(priority=22,groups="community-service")
	public void getListOfInviteOnlyUsersByEventId() {
		response=RestAssured.given().when().get("/community-service/v1/inviteOnlyUsers/list/"+eventId);
		Testcase=22;
	}

}
