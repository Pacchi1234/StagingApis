package com.ripplestreet.FilterApis;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class NotificationControllerFiltersGetApi extends genricUtilities {
	@SuppressWarnings("unchecked")
	@Test(groups="notification")
	public void getAllNotification() throws NumberFormatException, IOException {
		Testcase = 367;
		map1.put("campaignName", "Event Based 1");
		map1.put("eventId", "2128");
		ArrayList<String> keys = new ArrayList<String>(map1.keySet());
		for (int i = 0; i < map1.size(); i++) {
			String key = keys.get(i);
			Object value = map1.get(key);
			response = RestAssured.given().param(key, value).get("/notification/v1/notifications/all/");
			genricUtilities.StatusCode();
			Testcase++;

		}

	}

}
