package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class ReceiptControllerGetApi extends genricUtilities{
	@Test(priority=101,groups = "common-service")
	public void getReceiptRecordWithData() {
		response=RestAssured.get("/common-service/v1/event/"+eventId+"/receipt/"+receiptId);
		Testcase=101;
		
	}
	@Test(priority=102,groups = "common-service")
	public void getReceiptList() {
		response=RestAssured.given().queryParams("eventId",eventId,"size",size).get("/common-service/v1/receipt/list");
		Testcase=102;
	}
	

}
