package com.ripplestreet.FilterApis;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class BenefitControllerFiltersGetApi extends genricUtilities {
	@Test(groups="benefits-platform")
	public void getListOfBenefit() throws NumberFormatException, IOException {
		Testcase = 285;
		for (String types : BenefitType) {
			response = RestAssured.get("benefits-platform/v1/benefit/list?type=" + types);
			genricUtilities.StatusCode();
			Testcase++;

		}

	}

}
