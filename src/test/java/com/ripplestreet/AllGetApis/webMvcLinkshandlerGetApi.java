package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class webMvcLinkshandlerGetApi  extends genricUtilities{
	@Test(groups="community-service")
	public void links() {
		response=RestAssured.get("/community-service/actuator");
		Testcase=417;
	}

}
