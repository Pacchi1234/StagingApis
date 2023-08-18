package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class RewardAllocationcontrollerGetApi extends genricUtilities {
	@Test(priority=108,groups = "reward-service")
	public void getRewardAllocation() {
	RestAssured.baseURI=baseURI;
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size)
				.get("/reward-service/v1/event/" + eventId + "/allocation/list");
		Testcase = 108;
	}
	@Test(groups="reward-service")
	public void getRewardAllocations() {
		response=RestAssured.get("/reward-service/v1/reward/"+rewardId+"/allocation/"+rewardAllocationId);
		Testcase=109;
		
	}
}
