package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class MobileAppEventControllerGetApi extends genricUtilities {
	@Test
	public void discovermobileEvents() {
		response = RestAssured.given().get("/event/v1/discover/events/list?page=&size=10&eventType=APPLY");
		System.out.println(eventType);
		Testcase=405;

	}

}
