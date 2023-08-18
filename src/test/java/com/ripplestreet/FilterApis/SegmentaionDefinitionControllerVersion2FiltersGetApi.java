package com.ripplestreet.FilterApis;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class SegmentaionDefinitionControllerVersion2FiltersGetApi extends genricUtilities {
	@Test(groups="segmentation")
	public void getAllSegments() throws NumberFormatException, IOException {
		RestAssured.baseURI=baseURI;
		Testcase = 289;	
		for (String statusType : segmentStatus) {
			response = RestAssured
					.get("/segmentation/v2/folder/" + folderId + "/segment/list?statusTypeEnum=" + statusType);
			genricUtilities.StatusCode();
			Testcase++;
		}

	}

}
