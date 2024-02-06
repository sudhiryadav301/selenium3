package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo8 {

	public static void script1(WebDriver driver)
	{
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		script1(driver);

	}

}
