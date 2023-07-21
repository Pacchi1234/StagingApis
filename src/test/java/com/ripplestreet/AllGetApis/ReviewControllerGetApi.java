package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class ReviewControllerGetApi extends genricUtilities{
	@Test(priority=46,groups="activityugcreview")
	public void getExternalReview() {
		RestAssured.baseURI=baseURI;
		response=RestAssured.given().queryParams("page", page, "size",size).when().get("/activityugcreview/review/getExternalReview?eventId="+eventId);
		Testcase=46;
		}
	@Test(priority=47,groups="activityugcreview")
	public void getReviewsByTaskId() {
		response=RestAssured.given().when().get("/activityugcreview/review/getReviewByTaskId/"+taskId);
		Testcase=47;
		
	}
	@Test(priority=48,groups="activityugcreview")
	public void getReview() {
		response=RestAssured.given().when().get("/activityugcreview/review/"+reviewId);
		Testcase=48;
		
	}

}
