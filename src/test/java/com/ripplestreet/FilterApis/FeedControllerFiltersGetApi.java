package com.ripplestreet.FilterApis;

import java.io.IOException;
import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class FeedControllerFiltersGetApi extends genricUtilities {
	@Test
	public void getAllfeedForEvents() throws NumberFormatException, IOException {
		Testcase = 376;
		
		for (String feedControllerType : FeedControllerTypes) {
			response = RestAssured.get("/common-service/v1/feeds/" + eventId + "?pageNo=" + page + "&size=" + size
					+ "&types=" + feedControllerType);
			genricUtilities.StatusCode();
			Testcase++;

		}

	}

}
