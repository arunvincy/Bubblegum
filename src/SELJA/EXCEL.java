package SELJA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import SELJA.exceldat;

public class EXCEL {

	public static void main(String[] args) throws Exception{
		
		
		
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//lib//geckodriver.exe");
		WebDriver ffdriver = new FirefoxDriver();
		ffdriver.get("https://www.facebook.com/login/");
	ffdriver.manage().window().maximize();
	//ffdriver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div[2]/form/div/div[1]/input")).sendKeys(System.out.println(excelreader.getCellData("SignUpTest", "lastname", 3)));
		//ffdriver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[3]/center/input[1]")).click();
		
		

	}

}
