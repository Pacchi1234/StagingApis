package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class GameControllerGetApi extends genricUtilities {
	@Test(priority=92,groups = "gamification")
	public void getAllgames() {
		response=RestAssured.given().queryParams("columnName",columnName,"direction",directionDESC,"eventI",eventId,"pageNo",page,"pageSize",size).get("/gamification/v1/games/getAllGames");
		
		Testcase = 92;

	}

	@Test(priority=93,groups = "gamification")
	public void getGameBygameId() {
		response = RestAssured.given().param("gameId", gameId).get("/gamification/v1/games/getGameById");
		Testcase = 93;
	}

	@Test(priority=94,groups = "gamification")
	public void GetGameTrackerRedisObjByGameId() {
		response = RestAssured.get("/gamification/v1/games/getGameTrackerRedisObj/" + gameId);
		Testcase = 94;
	}

	@Test(priority=95,groups = "gamification")
	public void getWinningoptionBasedOnTheProbability() {
		response = RestAssured.given().queryParams("eventId", eventId, "gameId", gameId, "userId", pid)
				.get("/gamification/v1/games/getWinningProbability");
		Testcase = 95;

	}

}
