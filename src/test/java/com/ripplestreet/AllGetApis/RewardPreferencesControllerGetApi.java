package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class RewardPreferencesControllerGetApi extends genricUtilities {
	@Test(priority=122,groups = "reward-service")
	public void getRewardPreferences() {
		RestAssured.baseURI=baseURI;
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size)
				.get("/reward-service/v1/" + eventId + "/preferences/list");
		Testcase=122;
	}

}
