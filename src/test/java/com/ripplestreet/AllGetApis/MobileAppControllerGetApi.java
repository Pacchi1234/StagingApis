package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class MobileAppControllerGetApi extends genricUtilities {
	@Test(priority=75,groups = "activity-hub")
	public void GetListOfMyActivities() {
		response=RestAssured.get("/activity-hub/v1/app/myActivity/list/"+pid+"?status="+status);
		Testcase=75;
		
	}


}
