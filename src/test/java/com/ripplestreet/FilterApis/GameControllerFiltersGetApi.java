package com.ripplestreet.FilterApis;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class GameControllerFiltersGetApi extends genricUtilities {

	@SuppressWarnings("unchecked")
	@Test
	public void getAllgames() throws IOException {
		Testcase = 370;
		map1.put("eventId", "2128");
		map1.put("gameId", "106");
		map1.put("name", "Automation_Game_1");
		map1.put("goalCount", "1000");
		map1.put("isActive", "true");

		ArrayList<String> key = new ArrayList<>(map1.keySet());
		for (int i = 0; i < map1.size(); i++) {
			String keys = key.get(i);
			Object Value = map1.get(keys);
			response = RestAssured.given().param(keys, Value).get("/gamification/v1/games/getAllGames");
			genricUtilities.StatusCode();
			Testcase++;
		}
	}

}
