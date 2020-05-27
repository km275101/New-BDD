package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginDataProvider {

	File file = new File("./TestSheet.xlsx");
	public XSSFWorkbook workbook;
	FileInputStream fis;

	public List<String> getUserDetails() {
		List<String> userDetails = new ArrayList<String>();
		try {
			System.out.println("file Path : " + file.getCanonicalPath());
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			XSSFSheet worksheet = workbook.getSheet("Login");
			for (int i = 1; i <= worksheet.getLastRowNum(); i++) {
				for (int j = 0; j < worksheet.getRow(i).getLastCellNum() - 1; j++) {
					// Import data for Email.
					// userDetails.add(worksheet.getRow(1).getCell(0).getStringCellValue().toString());
					// userDetails.add(worksheet.getRow(1).getCell(1).getStringCellValue().toString());
					userDetails.add(worksheet.getRow(i).getCell(j).getStringCellValue().toString());
					System.out.println("Values are :" + userDetails);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userDetails;
	}

	public String getUrlDetails(int row, int col) throws InvalidFormatException {
		String url = null;
		List<String> urlDetails = new ArrayList<String>();
		String NOT_EXIST = "URL is not available";
		try {
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			XSSFSheet worksheet = workbook.getSheet("URL");

			url = worksheet.getRow(row).getCell(row).getStringCellValue().toString();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return url;

	}
}
