package actionsOnBrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod_1 {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		Dimension d = new Dimension(400, 800);
		driver.manage().window().setSize(d);
		Thread.sleep(10000);
		Point p = new Point(500, -300);
		driver.manage().window().setPosition(p);
		Thread.sleep(10000);
		Point p1 = new Point(-500, -300);
		driver.manage().window().setPosition(p1);
		Thread.sleep(10000);
		Point p2 = new Point(500, -300);
		driver.manage().window().setPosition(p2);
		Thread.sleep(10000);
		Point p3 = new Point(500, 300);
		driver.manage().window().setPosition(p3);
		
	}

}
