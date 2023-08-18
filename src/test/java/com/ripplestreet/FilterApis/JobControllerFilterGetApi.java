package com.ripplestreet.FilterApis;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class JobControllerFilterGetApi extends genricUtilities {
	@Test(groups="common-service")
	public void getListofJobsOfSourecType() throws NumberFormatException, IOException {
		Testcase = 380;
		for (String source : SourceType) {
			response = RestAssured.given().queryParams("eventId", eventId, "size", size)
					.get("/common-service/v1/job/list/" + source);
			genricUtilities.StatusCode();
			Testcase++;

		}
	}

}
