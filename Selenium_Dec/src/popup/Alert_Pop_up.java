package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Pop_up {
	public static void mai(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		Alert alert =driver.switchTo().alert();
		alert.accept();
		//alert.dismiss();
		//Or
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}

}
