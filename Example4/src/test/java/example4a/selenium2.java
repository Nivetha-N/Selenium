package example4a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium2 {

	@Test
	public void testleaf_button1(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Button.html");
		wd.findElement(By.id("home")).click();
		wd.close();
	}
	
	@Test(enabled=false)
	public void testleaf_button2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Button.html");
		wd.findElement(By.id("position")).click();
		wd.close();
		
	}
	
	@Test(enabled=false)
	public void testleaf_button3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Button.html");
		wd.findElement(By.id("color")).click();
		wd.close();
		
	}
	@Test(enabled=false)
	public void testleaf_button4() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Button.html");
		wd.findElement(By.id("size")).click();
		wd.close();
		
	}
	
	
}
