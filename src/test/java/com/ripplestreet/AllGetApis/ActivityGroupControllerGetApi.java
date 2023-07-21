package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class ActivityGroupControllerGetApi extends genricUtilities {
	@Test( priority=70,alwaysRun = true,groups = { "activity-hub" })
	public void GetListofActivityGroups() {
		RestAssured.baseURI=baseURI;
		response=RestAssured.get("/activity-hub/v1/activity/group/list");
		Testcase=70;
		
	}
	@Test(priority=71,groups = "activity-hub")
	public void GetActivityGroupsByyEventId() {
		response=RestAssured.get("/activity-hub/v1/activity/group/event/"+eventId);
		Testcase=71;
		
	}
	//https://devapi-ecs.ripplestreet.com/activity-hub/v1/activity/group/cb50dabc-953c-4a0e-b45d-7083ea07f8b8
	@Test(priority=72,groups = "activity-hub")
	public void GetActivityGroup() {
		response=RestAssured.get("/activity-hub/v1/activity/group/event/"+activitygroupId);
		Testcase=72;
	}

}
