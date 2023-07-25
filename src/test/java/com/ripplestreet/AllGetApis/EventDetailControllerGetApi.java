package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class EventDetailControllerGetApi extends genricUtilities {
	@Test(priority=157,groups="event-campaign-manager")
	public void getBasicEventDetailByEventID() {
		RestAssured.baseURI=baseURI;
		response = RestAssured.get("/event-campaign-manager/v1/basicDetail/" + eventId);
		Testcase = 157;
	}

	@Test(priority=158,groups="event-campaign-manager")
	public void findAllmileStonesByEvent() {
		response = RestAssured.given().queryParams("pageSize", size)
				.get("event-campaign-manager/v1/event/" + eventId + "/listMilestonesByEvent");
		Testcase = 158;

	}

	@Test(priority=159,groups="event-campaign-manager")
	public void findMileStoneById() {
		response = RestAssured.get("/event-campaign-manager/v1/event/" + eventId + "/milestone/" + milestoneId);
		Testcase = 159;

	}

	@Test(priority=160,groups="event-campaign-manager")
	public void getListoftargetsByEventId() {
		response = RestAssured.get("/event-campaign-manager/v1/event/" + eventId + "/target/list");
		Testcase = 160;

	}

	@Test(priority=161,groups="event-campaign-manager")
	public void findAllMilestonesTypeByEventtypes() {
		response= RestAssured.given().param("eventType", eventType)
				.get("/event-campaign-manager/v1/milestoneTypes/list");
		Testcase = 161;

	}
}
