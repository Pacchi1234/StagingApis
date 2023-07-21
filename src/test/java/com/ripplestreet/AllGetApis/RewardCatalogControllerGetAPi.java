package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class RewardCatalogControllerGetAPi extends genricUtilities {
	@Test(priority=110,groups = "reward-service")
	public void getAllRewardCatalogItems() {
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size)
				.get("/reward-service/v1/rewardCatalog/list");
		Testcase=110;
	}
}
