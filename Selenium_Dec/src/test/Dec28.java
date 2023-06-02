package test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec28 {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(03000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(03000);
		Dimension d = new Dimension(200, 300);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p = new Point(300, 500);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
	}

}
