package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

    public class RewardControllerGetApi extends genricUtilities {
	@Test(priority=111,groups = "reward-service")
	public void getRewardByName() {
		response = RestAssured.given().queryParams("eventId", eventId, "rewardName", rewardName)
				.get("/reward-service/v1/reward");
		Testcase = 111;

	}

	@Test(priority=112,groups = "reward-service")
	public void getReward() {
		response = RestAssured.get("/reward-service/v1/reward/" + rewardAllocationId);
		Testcase = 112;
	}

	@Test(priority=113,groups = "reward-service")
	public void getAllReward() {
		response = RestAssured.get("/reward-service/v1/reward/list/" + eventId);
		Testcase = 113;
	}

	@Test(priority=114,groups = "reward-service")
	public void searchItems() {
		response = RestAssured.get("/reward-service/v1/reward/searchItems/" + eventId);
		Testcase = 114;
	}

	@Test(priority=115,groups = "reward-service")
	public void getRewardSummaryByEventId() {
		response = RestAssured.get("/reward-service/v1/reward/summary/" + eventId);
		Testcase = 115;
	}

	@Test(priority=116,groups = "reward-service")
	public void getRewardCount() {
		response = RestAssured.get("/reward-service/v1/rewardCount/" + eventId);
		Testcase = 116;
	}
}
