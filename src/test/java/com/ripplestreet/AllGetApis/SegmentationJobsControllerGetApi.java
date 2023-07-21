package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class SegmentationJobsControllerGetApi extends genricUtilities  {
	@Test(priority=87,groups="segmentation")
	public void getAllSegmentJobsForSegmentId() {
		response=RestAssured.given().param("size", size).get("/segmentation/v2/segmentJobs/"+segmentId);
		Testcase=87;
		
	}

}
