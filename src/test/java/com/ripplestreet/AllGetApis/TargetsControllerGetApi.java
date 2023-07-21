package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class TargetsControllerGetApi  extends genricUtilities{
	@Test(priority=182,groups="event-campaign-manager")
	public void getAlltargets() {
		RestAssured.baseURI=baseURI;
		response=RestAssured.get("/event-campaign-manager/v1/targets");
		Testcase=182;
	}

}
