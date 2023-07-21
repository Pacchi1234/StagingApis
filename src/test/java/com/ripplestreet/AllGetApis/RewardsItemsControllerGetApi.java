package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class RewardsItemsControllerGetApi extends genricUtilities{
	@Test(priority=121,groups = "reward-service")
	public void getRewarditems() {
		response=RestAssured.get("/reward-service/v1/reward/"+rewardId+"/items/list");
		Testcase=121;
		
	}

}
