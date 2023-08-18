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

public class CommunityControllerPostApi extends postApiutilities {
	@Test(groups = "community-service")
	public void adminupdateuserProfile() throws IOException {
		RestAssured.baseURI=baseURI;
		Testcase = 12;
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
				.post("/community-service/community/adminUpdateProfile");

	}

	@Test(groups = "community-service")
	public void getAllUserByIds() throws IOException {
		Testcase = 13;
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
				.post("/community-service/community/getAllUsersByIds?page=" + page + "&size=" + size);

	}

	@Test(groups = "community-service")
	public void GetPeopleHeadshotInfobylistOfPersionIds() throws IOException {
		Testcase = 14;
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
				.post("/community-service/community/people/headshot/list");

	}

	@Test(groups = "community-service")
	public void GettingDetailOfUserCommunicationsByPersonIdAndEventId() throws IOException {
		Testcase = 15;
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
				.post("/community-service/community/userCommunications");
	}

	@Test(groups = "community-service")
	public void saveUserProfile() throws IOException {
		Testcase = 16;
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
				.post("/community-service/community/userProfile");
	}
	@Test(groups="community-service")
	public void getAlluserByIds() throws IOException {
		Testcase = 17;
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
				.post("/community-service/v2/community/getAllUsersByIds");
		
	}

}
