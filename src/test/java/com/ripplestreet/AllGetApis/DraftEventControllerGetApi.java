package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class DraftEventControllerGetApi extends genricUtilities {
	@Test(priority=155,groups="event-campaign-manager")
	public void getListOfEventsBycampaignId() {
		response=RestAssured.get("/event-campaign-manager/v1/campaign/"+campaignId+"/event/list");
		Testcase=155;
		
	}
	@Test(priority=156,groups="event-campaign-manager")
	public void getDraftEventByEventId() {
		response=RestAssured.get("/event-campaign-manager/v1/campaign/event/"+eventId);
		Testcase=156;
		
	}

}
