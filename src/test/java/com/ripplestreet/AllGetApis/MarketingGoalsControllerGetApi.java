package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class MarketingGoalsControllerGetApi extends genricUtilities{
	@Test(priority=171,groups="event-campaign-manager")
	public void getMarketingGoalsForEvent() {
		response=RestAssured.get("/event-campaign-manager/v1/event/"+eventId+"/marketingGoal/list");
		Testcase=171;
	}

}
