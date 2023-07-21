package com.ripplestreet.FilterApis;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class BenefitControllerFiltersGetApi extends genricUtilities {
	@Test
	public void getListOfBenefit() throws NumberFormatException, IOException {
		Testcase = 285;
		List<String> type = Arrays.asList("ALL", "BADGE", "STATUS");
		for (String types : type) {
			response = RestAssured.get("benefits-platform/v1/benefit/list?type=" + types);
			genricUtilities.StatusCode();
			Testcase++;

		}

	}

}
