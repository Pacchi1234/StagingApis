package com.ripplestreet.FilterApis;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class SponsorControlletFiltersGetApi extends genricUtilities {
	@Test(groups = "event-campaign-manager")
	public void getAllSponsors() throws NumberFormatException, IOException {
		Testcase = 360;
		for (String booleans : booleanValues) {
			response = RestAssured.get("/event-campaign-manager/v1/sponsor/list?isActive=" + booleans + "&pageNo="
					+ page + "&pageSize=" + size);
			genricUtilities.StatusCode();
			Testcase++;
		}
		
		for (String booleans : booleanValues) {
			response = RestAssured.get("/event-campaign-manager/v1/sponsor/list?isDeleted=" + booleans + "&pageNo="
					+ page + "&pageSize=" + size);
			genricUtilities.StatusCode();
			Testcase++;
		}
		for (String booleans : booleanValues) {
			response = RestAssured.get("/event-campaign-manager/v1/sponsor/list?isDiscoverable=" + booleans + "&pageNo="
					+ page + "&pageSize=" + size);
			genricUtilities.StatusCode();
			Testcase++;
		}
		

	}

}
