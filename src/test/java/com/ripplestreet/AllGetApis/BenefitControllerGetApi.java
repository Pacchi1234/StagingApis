package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class BenefitControllerGetApi extends genricUtilities {
	@Test(priority=65,groups="benefits-platform")
	public  void GetListofBenefit() {
		RestAssured.baseURI = baseURI;
		response=RestAssured.given().queryParams("size",size,"type",benifitType).get("/benefits-platform/v1/benefit/list");
		Testcase=65;
		
	}

}
