package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class gameOptionControllerGetApi extends genricUtilities {
	@Test(priority=96,groups = "gamification")
	public void getGameOptionBySlug() {
		response=RestAssured.get("/gamification/v1/game/"+gameId+"/option/"+gameSlug);
		Testcase=96;
		
	}
	@Test(priority=97,groups = "gamification")
	public void getListOfOptionsByGameId(){
		response=RestAssured.get("/gamification/v1/game/"+gameId+"/options/list");
		Testcase=97;
		
	}

}
