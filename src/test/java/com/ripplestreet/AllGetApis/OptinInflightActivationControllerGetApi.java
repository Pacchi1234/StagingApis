package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class OptinInflightActivationControllerGetApi  extends genricUtilities{
	@Test(priority=38,groups = "community-service")
	public void getListOfAllocationTransientRecordByEventId() {
		response=RestAssured.given().when().get("/community-service/v1/reward-allocation-jobs/list/"+eventId);
		Testcase=38;
		
	}
	@Test(priority=39,groups = "community-service")
	public void getAllocationTransientRecordByEventIdAndPersonId() {
		response=RestAssured.given().when().get("/community-service/v1/reward-allocation-jobs/"+eventId+"/"+pid);
		Testcase=39;
	}

}
