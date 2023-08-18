package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class DiscussionControllerGetApi extends  genricUtilities {
	@Test(priority=55,groups = "event")
	public void getDiscussionListByFilters() {
		RestAssured.baseURI=baseURI;
		
		response=RestAssured.given().queryParams("pageNo", page, "pageSize",size).when().get("https://devapi-ecs.ripplestreet.com/activityugcreview/v1/discussions/getDiscussionListByFilters?eventId="+eventId);
		Testcase=55;
		
	}
	@Test(priority=56,groups = "event")
	public void getDiscussion() {
		//RestAssured.basePath=baseURI;
		response=RestAssured.given().when().get("/activityugcreview/v1/discussions/"+discussion_id);
		Testcase=56;
		
	}

}
