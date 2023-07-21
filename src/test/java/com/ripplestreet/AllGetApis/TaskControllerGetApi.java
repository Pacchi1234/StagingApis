package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class TaskControllerGetApi  extends genricUtilities{
	@Test(priority=73,groups="activity-hub")
	public void getListOfTasks() {
		RestAssured.baseURI=baseURI;
		response=RestAssured.get("/activity-hub/v1/task/list");
		Testcase=73;
	}
	@Test(priority=74,groups="activity-hub")
	public void getTask() {
		response=RestAssured.get("/activity-hub/v1/task/"+taskId);
		Testcase=74;
	}

	

}
