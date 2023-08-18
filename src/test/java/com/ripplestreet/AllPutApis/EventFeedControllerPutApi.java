package com.ripplestreet.AllPutApis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class EventFeedControllerPutApi extends genricUtilities {

	@Test(priority = 194, groups = "event")
	public void likeAfeedById() throws InterruptedException, IOException, ParseException {

		try {
			Testcase = 194;
			File file = new File(devApiPath);
			FileInputStream fis = new FileInputStream(file);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName);
			XSSFRow row2 = sheet.getRow(Testcase);
			XSSFCell cell2 = row2.getCell(4);
			PutBody = cell2.getStringCellValue();
			System.out.println(PutBody);
			response = RestAssured.given().contentType(ContentType.JSON).body(PutBody).when()
					.put("/event/events-feed/likeFeed");

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
