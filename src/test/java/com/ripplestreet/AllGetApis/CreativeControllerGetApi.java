package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class CreativeControllerGetApi extends genricUtilities {
	@Test(priority=147,groups="event-campaign-manager")
	public void findHeroPlaylistById() {
		response = RestAssured
				.get("/event-campaign-manager/v1/creative/" + eventId + "/Event/heroPlaylist/" + playlistId);
		Testcase = 147;
	}

	@Test(priority=148,groups="event-campaign-manager")
	public void findAllHeroPlaylistByModelId() {
		response = RestAssured
				.get("/event-campaign-manager/v1/creative/" + eventId + "/Event/listHeroPlaylistsByModelId");
		Testcase = 148;
	}

	@Test(priority=149,groups="event-campaign-manager")
	public void getBannerByEventIdandId() {
		response = RestAssured.get("/event-campaign-manager/v1/creative/event/" + eventId + "/banner/" + bannerId);
		Testcase = 149;

	}

	@Test(priority=150,groups="event-campaign-manager")
	public void getFavorByEventIdAndId() {
		response = RestAssured.get("/event-campaign-manager/v1/creative/event/" + eventId + "/favor/" + favorId);
		Testcase = 150;

	}

	@Test(priority=151,groups="event-campaign-manager")
	public void finAllBannerByEventId() {
		response = RestAssured.get("/event-campaign-manager/v1/creative/event/" + eventId + "/listAllBannerByEventId");
		Testcase = 151;

	}

	@Test(priority=152,groups="event-campaign-manager")
	public void FinfAllfavousByEventId() {
		response=RestAssured.get("/event-campaign-manager/v1/creative/event/"+eventId+"/listFavorsByEvent");
		Testcase=152;

	}
	@Test(priority=153,groups="event-campaign-manager")
	public void FindHeroplaylistitemById() {
		response=RestAssured.get("/event-campaign-manager/v1/creative/heroPlaylistItems/"+eventId);
		Testcase=153;
		
	}
	@Test(priority=154,groups="event-campaign-manager")
	public void findAllHeroPlaylistItemsByPlayListId() {
		response=RestAssured.get("/event-campaign-manager/v1/creative/listHeroPlaylistItems/"+eventId);
		Testcase=154;
		
	}
}
