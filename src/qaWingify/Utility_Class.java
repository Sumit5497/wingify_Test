package qaWingify;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Utility_Class 
{
	//Automation TE: Sumit Gohatre
		//Date: 17/01/2023
		//Fetch data from property file
		@Test
		public static String getDatafromPF(String key) throws IOException
		{
			//Reach upto properties file 
			FileInputStream file=new FileInputStream("C:\\Users\\sumit\\eclipse-workspace\\6Aug_A_Selenium\\propertyfile.properties");	
		    
			//create object of properties class
			Properties prop=new Properties();
			
			//To open property file
			prop.load(file);
			
			//To fetch data from Property file
			String value1=prop.getProperty(key);
			return value1;
		}
		
		@Test
		public static String getDatafromExcelsheet(int Row,int Cell) throws EncryptedDocumentException, IOException
		{
			//To reach upto excel sheet
			FileInputStream file=new FileInputStream("C:\\excelsheet\\6aug_a.xlsx");
			Sheet sh=WorkbookFactory.create(file).getSheet("Sheet10");
			
			String value2=sh.getRow(Row).getCell(Cell).getStringCellValue();
			return value2;
		}

}
