package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AgencyControllerGetApi extends genricUtilities{
	@Test(priority=141,groups="event-campaign-manager")
	public void findAllAgencies() {
		response=RestAssured.get("/event-campaign-manager/v1/agency/list");
		Testcase=141;
	}
	@Test(priority=142,groups="event-campaign-manager")
	public void getAgencyById() {
		response=RestAssured.get("/event-campaign-manager/v1/agency/"+agencyId);
		Testcase=142;
	}

}
