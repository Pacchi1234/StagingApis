package com.ripplestreet.genricUtilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetApiFilters extends genricUtilities {

	@SuppressWarnings("unchecked")
	@Test
	public void test() throws NumberFormatException, IOException {
		List ls = new ArrayList();
		ls.add(evnetTypeUpcomingEvents);
		ls.add(eventTypeOpenEvents);
		ls.add(eventTypeCurrentEvents);
		ls.add(eventTypePastEvents);
	
		Testcase=31;
		    for (int i=0;i<=ls.size();i++) 
		    {
		    	
		        response = RestAssured.given().queryParams("page", page, "size", size, "eventType", ls.get(i))
		                .get("/event/events/discover/events/list");
		        
		        genricUtilities.StatusCode();
		        Testcase=Testcase+1;
		       // break;
		       
		    }
		}

	}


