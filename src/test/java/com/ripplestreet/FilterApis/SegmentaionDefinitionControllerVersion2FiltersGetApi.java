package com.ripplestreet.FilterApis;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class SegmentaionDefinitionControllerVersion2FiltersGetApi extends genricUtilities {
	@Test
	public void getAllSegments() throws NumberFormatException, IOException {
		Testcase = 289;
		List<String> statusTypeEnum = Arrays.asList("DRAFT", "PUBLISH", "UNPUBLISH");
		for (String statusType : statusTypeEnum) {
			response = RestAssured
					.get("/segmentation/v2/folder/" + folderId + "/segment/list?statusTypeEnum=" + statusType);
			genricUtilities.StatusCode();
			Testcase++;
		}

	}

}
