package com.ripplestreet.FilterApis;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class RewardDeliveryControllerFiltersGetApi extends genricUtilities {
	@Test(groups="reward-service")
	public void getRewardDeleviries() throws NumberFormatException, IOException {
		Testcase = 329;
		for (String rewardTypes : rewardType) {
			for (String statuse : RewardStatus) {
				response = RestAssured.get("/reward-service/v1/reward/deliveries?pageNo=" + page + "&pageSize=" + size
						+ "&rewardType=" + rewardTypes + "&status=" + statuse);
				genricUtilities.StatusCode();
				Testcase++;

			}
		}

	}

}
