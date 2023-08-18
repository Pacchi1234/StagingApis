package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class RecipientsController extends genricUtilities {
	@Test(priority=140,groups="notification")
	public void GetAllRecipientForCampaignId() {
		response = RestAssured.given().queryParams("notificationId", notificationId, "pageSize", size)
				.get("/notification/v1/recipients/getAllRecipientsByCampaignId");
		Testcase=140;
	}

}
