package com.ripplestreet.AllPostApis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.postApiutilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class AudiencepromationControllerPostApi extends postApiutilities {
	@Test(groups="community-service")
	public void addAndPromoteAudience() throws IOException {
		Testcase = 8;
		File file = new File(postApipath);
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("postApi");
		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(4);
		PutBody = cell2.getStringCellValue();
		System.out.println(PutBody);

		response = RestAssured.given().contentType(ContentType.JSON).body(PutBody).when()
				.post("/community-service/v1/pid/list/" + eventId + "?auidenceType=APPLICANT");

	}

	@Test(groups="community-service")
	public void audienceAddPromoteFileProcess() throws IOException {
		Testcase = 9;
		File file = new File(postApipath);
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("postApi");
		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(4);
		PutBody = cell2.getStringCellValue();
		System.out.println(PutBody);
		response = RestAssured.given().contentType(ContentType.JSON).body(PutBody).when()
				.post("/community-service/v1/process/file/2128?auidenceType=APPLICANT&fileName=audience 2128.csv");
	}
	@Test
	public void handleRejects() throws IOException {
		Testcase = 41;
		File file = new File(postApipath);
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("postApi");
		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(4);
		PutBody = cell2.getStringCellValue();
		System.out.println(PutBody);

		response = RestAssured.given().contentType(ContentType.JSON).body(PutBody).when()
				.post("/community-service/v1/reject/list/"+eventId);
		
	}

}
