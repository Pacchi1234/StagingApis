package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class SponserControllerGetApi extends genricUtilities {
	@Test(priority = 176, groups = "event-campaign-manager")
	public void findSponsorById() {
		RestAssured.baseURI = baseURI;
		response = RestAssured.get("/event-campaign-manager/v1/sponsor/" + sponsorId);
		Testcase = 176;

	}

	@Test(priority = 177, groups = "event-campaign-manager")
	public void getAllSponsors() {
		response = RestAssured.get("/event-campaign-manager/v1/sponsor/list");
		Testcase = 177;

	}

	@Test(priority = 178, groups = "event-campaign-manager")
	public void findAllsponsorAssetsbysponsorId() {
		response = RestAssured.get("/event-campaign-manager/v1/sponsor/sponsorAssets/" + sponsorId);
		Testcase = 178;

	}

}
