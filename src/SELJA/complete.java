package SELJA;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class complete {
	
	/**
	 * @author Admin
	 *
	 */
	
	
		WebDriver driver;
		WebDriverWait wait;
		HSSFWorkbook workbook;
		HSSFSheet sheet;
		HSSFCell cell;

	 @BeforeTest
	 public void TestSetup()
	{
		// Set the path of the Firefox driver.
		 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//lib//geckodriver.exe");
		driver = new FirefoxDriver();
		
		// Enter url.
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		wait = new WebDriverWait(driver,30);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	 
	 @Test
	 public void ReadData() throws IOException
	 {
		 // Import excel sheet.
		 File src=new File("E:\\test\\SELJA\\lib\\Testdata.xls");
		 
		 // Load the file.
		 FileInputStream finput = new FileInputStream(src);
		 
		 // Load he workbook.
		workbook = new HSSFWorkbook(finput);
		 
	     // Load the sheet in which data is stored.
		 sheet= workbook.getSheetAt(0);
		 
		 
		 
			 // Import data for Email.
		 System.out.println(sheet.getRow(1).getCell(1));
			 //System.out.println(sheet.getCellData("LoginTest", "password", 1))
			//cell.setCellType(Cell.CELL_TYPE_STRING);
			// driver.findElement(By.id("login-email")).sendKeys(cell.getStringCellValue());
			// driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div[2]/form/div/div[1]/input")).sendKeys(cell.getStringCellValue());
			 // Import data for password.
			// cell = sheet.getRow(1).getCell(2);
			// cell.setCellType(Cell.CELL_TYPE_STRING);
			// driver.findElement(By.id("login-password")).sendKeys(cell.getStringCellValue());
			   		
	        

	}

}
