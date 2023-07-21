package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class SocialShareControllerGetApi  extends genricUtilities{
	@Test(priority=57,groups="activityugcreview")
	public void getReview() {
		response=RestAssured.given().when().get("/activityugcreview/socialshare/"+eventId);
		Testcase=57;
		
	}
	@Test(priority=58,groups="activityugcreview")
	public void getAllReviews() {
		response=RestAssured.given().queryParams("page",page,"size",size).when().get("/activityugcreview/socialshare/getSocialShareList/"+pid);
		Testcase=58;
		
	}

}
