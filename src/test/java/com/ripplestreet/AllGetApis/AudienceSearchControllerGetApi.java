package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class AudienceSearchControllerGetApi extends genricUtilities {

	@Test(priority=76,groups="segmentation")
	public void searchableFields() {
		RestAssured.baseURI=baseURI;
		response = RestAssured.get("/segmentation/v1/audience/searchableFields");
		Testcase = 76;

	}

}
