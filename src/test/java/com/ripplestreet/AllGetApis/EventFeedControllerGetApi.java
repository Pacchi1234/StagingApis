package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class EventFeedControllerGetApi extends genricUtilities {

	@Test(priority=14,groups = "event")
	public void getFeedInfoById() {
		response = RestAssured.given().when().get("/event/events-feed/feed/" + feedItemId);
		Testcase = 14;

	}

	@Test(priority=15,groups = "event")
	public void getCommentFeedByEventId() {
		response =RestAssured.given().queryParams("pageNo", page, "pageSize", size).when().get("/event/events-feed/"+eventId+"/comments");
		Testcase = 15;
	}

	@Test(priority=16,groups = "event")
	public void getAllFeedsForEvent() {
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size).when()
				.get("/event/events-feed/" + eventId + "/feeds");
		Testcase = 16;
		

	}

	@Test(priority=17,groups = "event")
	public void getPhotoFeedByEventId() {
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size).when()
				.get("/event/events-feed/" + eventId + "/photos");
		Testcase = 17;
	}

	@Test(priority=18,groups = "event")
	public void getReviewFeedByEventId() {
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size).when()
				.get("/event/events-feed/" + eventId + "/reviews");
		Testcase = 18;
	}

}
