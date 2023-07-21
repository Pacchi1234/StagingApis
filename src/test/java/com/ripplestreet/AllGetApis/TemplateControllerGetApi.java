package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class TemplateControllerGetApi extends genricUtilities {
	@Test(priority=133,groups="notification")
	public void template() {
		RestAssured.baseURI=baseURI;
		response = RestAssured.get("/notification/v1/templates/" + templateName);
		Testcase = 133;
	}

	@Test(priority=134,groups="notification")
	public void AllEmailList() {
		response = RestAssured.get("/notification/v1/templates/all/" + templateType + "/" + templateTypeEnum + "/");
		Testcase = 134;
	}

	@Test(priority=135,groups="notification")
	public void PreviewTemplateContent() {
		response = RestAssured
				.get("/notification/v1/templates/preview/" + notificationId + "/" + pid + "/" + templateName);
		Testcase = 135;
	}
	@Test(priority=136,groups="notification")
	public void GettemplateByTrasactionalType() {
		response=RestAssured.get("/notification/v1/templates/templateByTrasactionalType/"+transactionlType);
		Testcase=136;
	}
	@Test(priority=137,groups="notification")
	public void DownloadCSVLoader() {
		response=RestAssured.get("/notification/v1/templates/download/"+eventId+"/"+notificationId+"/"+fileName);
		Testcase=137;
		
	}
	@Test(priority=138,groups="notification")
	public void GetTemplateListByTransactionalTypeAndEventId() {
		response=RestAssured.get("/notification/v1/templates/templateListByTrasactionalType/"+transactionlType);
		Testcase=138;
		
	}
	@Test(priority=139,groups="notification")
	public void getTransactionalTemplateById() {
		response=RestAssured.get("/notification/v1/templates/TransactionTemplate/"+transactionTemplateId);
		Testcase=139;
	}
}
