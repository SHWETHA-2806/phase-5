package Testing1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
  @Test
  public void test() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHWETHA M\\Downloads\\chromedriver_win32/chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 WebElement upload= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
	 upload.click();
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File scr=ts.getScreenshotAs(OutputType.FILE);
	 try {
		 FileUtils.copyFile(scr,new File("test.png"));
		 
	 }catch(IOException e) {
		 e.printStackTrace();
	 }
  }
}