package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class LegalControllerGetApi extends genricUtilities{
	@Test(priority=170,groups="event-campaign-manager")
	public void getLegalDesclaimer() {
		response=RestAssured.get("/event-campaign-manager/v1/event/"+eventId+"/getLegal");
		Testcase=170;
		
	}

}
