package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class AssetControllerGetApi extends genricUtilities{
	@Test(priority=143,groups="event-campaign-manager")
	public void getAssetById() {
		response=RestAssured.get("/event-campaign-manager/v1/asset/"+assetId);
		Testcase=143;
	}

}
