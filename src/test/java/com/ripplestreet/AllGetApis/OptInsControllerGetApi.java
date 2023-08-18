package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class OptInsControllerGetApi extends genricUtilities {
	@Test(priority=105,groups = "reward-service")
	public void GetRewardCountByEventIdAndPreferenceforPerson() {
		RestAssured.baseURI=baseURI;
		response = RestAssured.get("/reward-service/v1/optIn/" + eventId + "/" + pid);
		Testcase = 105;
	}

	@Test(priority=106,groups = "reward-service")
	public void getOptInById() {
		response = RestAssured.get("/reward-service/v1/optIn/getOptIn/" + optInId);
		Testcase = 106;

	}

	@Test(groups = "reward-service")
	public void getListOptInByEventId() {
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size)
				.get("/reward-service/v1/optIns/" + eventId);
		Testcase = 107;
	}
}
