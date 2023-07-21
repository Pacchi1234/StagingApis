package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class SegmentationDataControllerGetApi extends genricUtilities {
	@Test(priority=77,groups="segmentation")
	public void FindIfUserExistInGivenSegment() {
		response=RestAssured.get("/segmentation/v1/segmentData/"+pid+"/"+segmentId);
		Testcase=77;
	}
	@Test(priority=78,groups="segmentation")
	public void GetSegmentIdBySegmentName() {
		response=RestAssured.get("/segmentation/v1/segmentData/"+segmentId+"/"+segmentName);
		Testcase=78;
		
	}
	@Test(priority=79,groups="segmentation")
	public void GetSegmentsOfaUser() {
		response=RestAssured.get("/segmentation/v1/segmentData/segments/"+pid);
		Testcase=79;
	}
	@Test(priority=80,groups="segmentation")
	public void GetUsersOfaSegment() {
		response=RestAssured.given().param("size", size).get("/segmentation/v1/segmentData/users/"+segmentName);
		Testcase=80;
		
	}
	@Test(priority=81,groups="segmentation")
	public void GetUserDetailsOfaSegment() {
		response=RestAssured.given().param("size", size).get("/segmentation/v1/segmentData/users/details/"+segmentId);
		Testcase=81;
		
		
	}

}
