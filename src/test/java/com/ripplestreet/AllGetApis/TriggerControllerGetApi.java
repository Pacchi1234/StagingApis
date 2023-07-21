package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class TriggerControllerGetApi extends genricUtilities {
	@Test(priority=88,groups="segmentation")
	public void GetAllTriggers() {
		response=RestAssured.given().param("size", size).get("/segmentation/v1/trigger/list");
		Testcase=88;
	}
	@Test(priority=189,groups="segmentation")
	public void getTriggerDefinition() {
		response=RestAssured.get("/segmentation/v1/trigger/"+segmentationtriggerId);
		Testcase=89;
		
	}
	@Test(priority=90,groups="segmentation")
	public void getTriggerInfoByTableNameAndOperation() {
		response=RestAssured.get("/segmentation/v1/trigger/"+tableName+"/"+operation);
		Testcase=90;
		
	}

}
