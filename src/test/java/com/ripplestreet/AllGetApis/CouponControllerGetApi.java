package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class CouponControllerGetApi extends genricUtilities {
	@Test(priority=91,groups = "gamification")
	public void getCouponsByActivityId() {
		RestAssured.baseURI=baseURI;
		response = RestAssured.get("/gamification/v1/coupons/getCouponsByActivityId/" + gamificationActivityId);
		Testcase = 91;
	}

}
