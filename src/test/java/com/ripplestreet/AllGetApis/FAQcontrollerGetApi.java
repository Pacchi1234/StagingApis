package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class FAQcontrollerGetApi extends genricUtilities {
	@Test(priority=163,groups="event-campaign-manager")
	public void getFAQbyEventId() {
		response = RestAssured.get("/event-campaign-manager/v1/event/" + eventId + "/faqByEventId/Event");
		Testcase = 163;
	}

	@Test(priority=164,groups="event-campaign-manager")
	public void getFAQById() {
		response = RestAssured.get("/event-campaign-manager/v1/event/faq/" + faqId);
		Testcase = 164;
	}

	@Test(priority=165,groups="event-campaign-manager")
	public void GetFAQDetailByEventIdforCommunity() {
		response = RestAssured.given().param("eventId", eventId)
				.get("/event-campaign-manager/v1/event/faqByType/Event");
		Testcase=165;

	}
	@Test(priority=166,groups="event-campaign-manager")
	public void getlistofFaqTopicbyFaqId() {
		response = RestAssured.get("/event-campaign-manager/v1/faq/"+faqId+"/faqTopic/list");
		Testcase = 166;
		
	}
	@Test(priority=167,groups="event-campaign-manager")
	public void FAQTopicByID() {
		response = RestAssured.get("/event-campaign-manager/v1/faq/faqTopic/"+faqtopicId);
		Testcase = 167;
		
	}
	@Test(priority=168,groups="event-campaign-manager")
	public void GetlistofFaqTopicItemsbyFaqTopicId() {
		response = RestAssured.get("/event-campaign-manager/v1/faqTopic/"+faqtopicId+"/faqTopicItems/list");
		Testcase = 168;
		
	}
	@Test(priority=169,groups="event-campaign-manager")
	public void getFAQTopicitemsById() {
		response = RestAssured.get("/event-campaign-manager/v1/faqTopic/faqTopicItem/3824");
		Testcase = 169;
		
	}

}
