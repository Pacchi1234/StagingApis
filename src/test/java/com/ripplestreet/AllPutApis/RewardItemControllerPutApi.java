package com.ripplestreet.AllPutApis;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RewardItemControllerPutApi  extends genricUtilities{
	@Test(priority=221,groups="reward-service")
	public void UpdateRewardIteams() throws Throwable {
		Testcase = 221;
		File file = new File(devApiPath);
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName);
		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(4);
		PutBody = cell2.getStringCellValue();
		System.out.println(PutBody);

		response = RestAssured.given().header("Authorization", Authorization).contentType(ContentType.JSON).body(PutBody).when()
				.put("/reward-service/v1/reward/"+rewardId+"/item/"+rewardItemId);
		
	}
	@Test(priority=222,groups="reward-service")
	public void UpdateRewardItemsSkuAlliases() throws Throwable {
		Testcase = 222;
		File file = new File(devApiPath);
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName);
		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(4);
		PutBody = cell2.getStringCellValue();
		System.out.println(PutBody);

		response = RestAssured.given().header("Authorization", Authorization).contentType(ContentType.JSON).body(PutBody).when()
				.put("/reward-service/v1/reward/"+rewardId+"/item/"+rewardItemId+"/skuAliases");
		
	}

}
