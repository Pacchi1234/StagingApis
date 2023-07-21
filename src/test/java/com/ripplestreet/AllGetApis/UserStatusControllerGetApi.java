package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class UserStatusControllerGetApi extends genricUtilities{
	@Test(priority=45,groups="community-service")
	public void GetUserAndEventDataByEventIdandPersonId() {
		response=RestAssured.given().when().get("/community-service/v1/getUserAndEventData?eventId="+eventId+"&pid="+pid);
		Testcase=45;
		
	}
	

}
