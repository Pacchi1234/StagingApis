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

public class SegmentationDefinitionVersion2ControllerPutApi extends genricUtilities{
	@Test(priority=205,groups="segmentation")
	public void UpdateASegment() throws Throwable {
		RestAssured.baseURI=baseURI;
		Testcase = 205;
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
				.put("/segmentation/v2/folder/"+folderId+"/segment/"+segmentId);
		}
	@Test(priority=206,groups="segmentation")
	public void refreshUserCountBySgment() throws Throwable {
		Testcase = 206;
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
				.put("/segmentation/v2/segment/refreshCount/"+segmentId);
		
	}
	

}
