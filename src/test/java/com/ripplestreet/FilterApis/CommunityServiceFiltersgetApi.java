package com.ripplestreet.FilterApis;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class CommunityServiceFiltersgetApi extends genricUtilities {
	@Test(groups="community-service")
	public void getAllAdressEntriesByPersonId() throws NumberFormatException, IOException {
		RestAssured.baseURI=baseURI;
		Testcase = 269;
		for (String participantType1 : participantType) {
			response = RestAssured.given().get("/community-service/community/getAllEventsByUserAndParticipantType/"
					+ pid + "/" + participantType1);
			genricUtilities.StatusCode();
			Testcase++;
		}

	}

	@Test(groups="community-service")
	public void getAllUsersByEventAndParticipantType() throws NumberFormatException, IOException {
		Testcase = 277;
		for (String participantType1 : participantType) {
			response = RestAssured.given().get("/community-service/community/getAllUsersByEventAndParticipantType/"
					+ eventId + "/" + participantType1);
			genricUtilities.StatusCode();
			Testcase++;
		}

	}

}
