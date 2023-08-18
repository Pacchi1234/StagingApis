package com.ripplestreet.FilterApis;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class RewardAllocationControllerFilterApi extends genricUtilities {
	@Test(groups="reward-service")
	public void getRewradAllocation() throws NumberFormatException, IOException {
		RestAssured.baseURI=baseURI;
		Testcase = 298;
		for (String rewardTypes : rewardType) {
			for (String statuse : RewardStatus) {
				response = RestAssured.get("/reward-service/v1/event/" + eventId + "/allocation/list?pageNo=" + page
						+ "&pageSize=" + size + "&rewardType=" + rewardTypes + "&status=" + statuse);
			
				genricUtilities.StatusCode();
				Testcase++;

			}
		}
	}
}  
