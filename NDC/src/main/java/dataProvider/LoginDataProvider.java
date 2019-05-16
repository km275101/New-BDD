package dataProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
			System.out.println("file Path : "+file.getCanonicalPath());
			fis =  new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			XSSFSheet worksheet = workbook.getSheet("Login");
			 for( int i=1; i<=worksheet.getLastRowNum(); i++)
			 {
				 for( int j=1; j<=worksheet.getRow(i).getLastCellNum()-1; j++) {
				 // Import data for Email.
			//userDetails.add(worksheet.getRow(1).getCell(0).getStringCellValue().toString());
			//userDetails.add(worksheet.getRow(1).getCell(1).getStringCellValue().toString());
				  userDetails.add(worksheet.getRow(i).getCell(j).getStringCellValue().toString()); 
			System.out.println("Values are :"+userDetails);
			 }
			     }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userDetails;
	}
	
	
public List<String> getUrlDetails() throws InvalidFormatException{
		
		List<String> urlDetails = new ArrayList<String>();
		
		try{
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			XSSFSheet worksheet = workbook.getSheet("Login");
			int n = worksheet.getLastRowNum();
			System.out.println("Total number of rows :"+n);
			urlDetails.add(worksheet.getRow(1).getCell(0).getStringCellValue());
			//urlDetails.add(worksheet.getRow(1).getCell(1).getStringCellValue());
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return urlDetails;
		
	}
}
