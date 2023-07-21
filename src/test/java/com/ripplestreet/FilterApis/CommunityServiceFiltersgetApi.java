package com.ripplestreet.FilterApis;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class CommunityServiceFiltersgetApi extends genricUtilities {
	@Test
	public void getAllAdressEntriesByPersonId() throws NumberFormatException, IOException {
		Testcase = 269;
		List<String> participantType = Arrays.asList("All", "Host", "Chatterbox", "Applicant", "Reserved", "Reject",
				"Finalist");

		for (String participantType1 : participantType) {
			response = RestAssured.given().get("/community-service/community/getAllEventsByUserAndParticipantType/"
					+ pid + "/" + participantType1);
			genricUtilities.StatusCode();
			Testcase++;
		}

	}

	@Test
	public void getAllUsersByEventAndParticipantType() throws NumberFormatException, IOException {
		Testcase = 277;
		List<String> participantType = Arrays.asList("All", "Host", "Chatterbox", "Applicant", "Reserved", "Reject",
				"Finalist");
		for (String participantType1 : participantType) {
			response = RestAssured.given().get("/community-service/community/getAllUsersByEventAndParticipantType/"
					+ eventId + "/" + participantType1);
			genricUtilities.StatusCode();
			Testcase++;
		}

	}

}
