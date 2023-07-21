package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class CommunityControllerGetApi extends genricUtilities {
	@Test(priority=23,groups="community-service")
	public void getAllAddressEntriesByPersonId() {
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size).when()
				.get("/community-service/community/getAllAddressEntriesByPersonId/" + pid);
		Testcase=23;
	}

	@Test(priority=24,groups="community-service")
	public void getAllEventsByUserAndParticipantType() {
		response = RestAssured.given().when()
				.get("/community-service/community/getAllEventsByUserAndParticipantType/" + pid + "/Host");
		Testcase=24;
	}

	@Test(priority=25,groups="community-service")
	public void getAllUsersByEventAndParticipantType() {
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size).when()
				.get("/community-service/community/getAllUsersByEventAndParticipantType/" + eventId + "/Host");
		Testcase=25;

	}

	@Test(priority=26,groups="community-service")
	public void GettingDetailOfHeadHostByPersonId() {
		response = RestAssured.given().when().get("/community-service/community/getHeadShotByPersonId?personId=" + pid);
		Testcase=26;

	}

	@Test(priority=27,groups="community-service")
	public void getUserEventParticipationBit() {
		response = RestAssured.given().queryParams( "userId", pid, "eventId", eventId).when()
				.get("/community-service/community/getUserEventParticipationBit");
		Testcase=27;

	}

	@Test(priority=28,groups="community-service")
	public void getUserListByFilters() {
		response = RestAssured.given().queryParams("personId",pid, "pageNo", page, "pageSize", size).when()
				.get("/community-service/community/getUserListByFilters?personIds");
		Testcase=28;
	}
	@Test(priority=29,groups="community-service")
	public void getUserParticipationBits() {
		response = RestAssured.given().queryParams( "userId", pid, "eventId", eventId).when()
				.get("/community-service/community/getUserParticipationBits");
		Testcase=29;
		
		
	}
	@Test(priority=30,groups="community-service")
	public void getUserProfile() {
		response = RestAssured.given().when()
				.get("/community-service/community/userProfile/"+pid);
		Testcase=30;
		
	}
	@Test(priority=31,groups="community-service")
	public void getUserDetails() {
		response = RestAssured.given().when()
				.get("/community-service/community/users/"+eventId+"?eventInfo=true");
		Testcase=31;
		
	}

}
