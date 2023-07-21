package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class OptinInflightActivationControllerGetApi  extends genricUtilities{
	@Test(priority=38,groups = "reward-service")
	public void getListOfAllocationTransientRecordByEventId() {
		response=RestAssured.given().when().get("/community-service/v1/reward-allocation-jobs/list/"+eventId);
		Testcase=38;
		
	}
	///community-service/v1/reward-allocation-jobs/2128/9593101
	@Test(priority=39,groups = "reward-service")
	public void getAllocationTransientRecordByEventIdAndPersonId() {
		response=RestAssured.given().when().get("/community-service/v1/reward-allocation-jobs/"+eventId+"/"+pid);
		Testcase=39;
	}

}
