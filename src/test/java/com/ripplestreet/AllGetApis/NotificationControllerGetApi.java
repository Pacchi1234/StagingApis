package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class NotificationControllerGetApi extends genricUtilities {
	@Test(priority=127,groups="notification")
	public void getAllNotification() {
		response = RestAssured.given().queryParams("eventId", eventId, "page", page, "size", size)
				.get("/notification/v1/notifications/all/");
		Testcase = 127;
	}

	@Test(priority=128,groups="notification")
	public void GetCampaignByNotificationId() {
		response = RestAssured.get("/notification/v1/notifications/get/" + notificationId + "/");
		Testcase = 128;

	}

	@Test(priority=129,groups="notification")
	public void GetStatusByNotificationId() {
		response = RestAssured.given().params("notificationId", notificationId)
				.get("/notification/v1/notifications/getstatus");
		Testcase = 129;

	}

	@Test(priority=130,groups="notification")
	public void SearchCampaignforNotification() {
		response = RestAssured.get("/notification/v1/notifications/search/" + campaignName + "/");
		Testcase = 130;

	}

	@Test(groups="notification")
	public void isEmailExistInSuppressionList() {
		response = RestAssured.get("/notification/v1/notifications/suppressionList/" + email + "/isExists");
		Testcase = 131;
	}

	@Test(priority=132,groups="notification")
	public void GetKPIMatrixByCampaignId() {
		response = RestAssured
				.get("/notification/v1/notifications/getKpiMatrixByCampaignId?notificationId="+matrixNotificationId);
		Testcase = 132;
	}

}
