package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWith_DateAndTime {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		 Date d = new Date();
	     String FileName = d.toString().replace(":", "_").replace(" ", "_")+ ".png";
	     TakesScreenshot take = (TakesScreenshot)driver;
	     File src = take.getScreenshotAs(OutputType.FILE);
		 File dest =new File("E:\\28th May batch 1\\Auto ScreenShot\\"+FileName);
	   	 Thread.sleep(5000);
		 FileHandler.copy(src, dest);
		
		
			
				
	}

}
