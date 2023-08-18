package com.ripplestreet.AllPutApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class ApplicationsControllerPutApi extends genricUtilities {
	@Test(groups = "community-service")
	public void updateApplications() {
		response = RestAssured.put("/community-service/v1/event/2128/application/" + applicationId
				+ "?isSponsorSubscribed=" + isSponsorSubscribed);
		Testcase = 411;
	}

	@Test
	public void deactivateFinalist() {
		response = RestAssured.put("/community-service/v1/finalists/deactivate/" + eventId
				+ "?isNotificationSendRequired=" + isNotificationSendRequired);
		Testcase = 412;
	}

	@Test
	public void MarkApplicationCompleteOrInCompletebyeventIdandpersonId() {
		response = RestAssured.given().header("Authorization", AccessToken)
				.put("/community-service/v1/updateApplicationCompletion/" + eventId + "?reserved=" + reserved);
		Testcase = 413;

	}
}
