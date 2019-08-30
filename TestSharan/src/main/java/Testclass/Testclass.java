package Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testclass {
	
	 public static void main(String[] args) {
		
		 
		 System.out.println("hello world");
		 
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://login.eloqua.com/?CheckFrame=false");

		 
		 
	}

}
