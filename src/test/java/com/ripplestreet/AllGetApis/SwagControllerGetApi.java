package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class SwagControllerGetApi extends genricUtilities {
	@Test(priority=123,groups = "reward-service")
	public void getSwag() {
		response = RestAssured.get("/reward-service/v1/swag/" + swagId);
		Testcase = 123;
	}

	@Test(priority=124,groups = "reward-service")
	public void getSwagList() {
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size)
				.get("/reward-service/v1/swag/list");
		Testcase=124;

	}

}
