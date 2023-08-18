package com.ripplestreet.AllPutApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class AudiencePromotionControllerPutApi extends genricUtilities {
	@Test
	public void updateAudiencePromotionJobRecordStatusAndParsingCount() {
		Testcase = 414;
		response = RestAssured.put("/community-service/v1/audience-promotion-jobs/updateJob/" + AudiencePromotionJobID
				+ "?column=" + AudiencePromotionColumnName + "&failedPidsCount=" + AudiencePromotionJobfailedPidsCount
				+ "&processedPidsCount=" + AudiencePromotionJobprocessedPidsCount);
	}

}
