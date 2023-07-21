package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class SegmentationFolderControllerGetApi extends genricUtilities {
	@Test(priority=85,groups="segmentation")
	public void getAllSegmentFolder() {
		response=RestAssured.get("/segmentation/v2/segmentFolder/list");
		Testcase=85;
		
	}
	@Test(priority=86,groups="segmentation")
	public void GetSegmentFolderFromCampaignSegment() {
		response=RestAssured.given().param("eventId", eventId).get("/segmentation/v2/campaignSegmentFolder/list");
		Testcase=86;
		
	}

}
