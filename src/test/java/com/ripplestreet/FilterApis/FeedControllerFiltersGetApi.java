package com.ripplestreet.FilterApis;

import java.io.IOException;
import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class FeedControllerFiltersGetApi extends genricUtilities {
	@Test(groups="common-service")
	public void getAllfeedForEvents() throws NumberFormatException, IOException {
		Testcase = 376;
		for (String feedControllerType : FeedTypes) {
			response = RestAssured.get("/common-service/v1/feeds/" + eventId + "?pageNo=" + page + "&size=" + size
					+ "&types=" + feedControllerType);
			System.out.println(feedControllerType);
			genricUtilities.StatusCode();
			Testcase++;

		}

	}

}
