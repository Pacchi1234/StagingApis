package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class UserAchievementControllerGetApi extends genricUtilities{
	@Test(priority=66,groups="benefits-platform")
	public void getUserAchivmentsDetails() {
		response=RestAssured.get("/benefits-platform/v1/user/achievement/"+pid);
		Testcase=66;
		
	}
	@Test(priority=67,groups="benefits-platform")
	public void getUserProgramsDetailes() {
		response=RestAssured.get("/benefits-platform/v1/user/program/achievement/"+pid);
		Testcase=67;
	}

}
