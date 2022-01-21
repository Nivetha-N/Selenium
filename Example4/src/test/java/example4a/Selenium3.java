package example4a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium3 {
	
	@Test(enabled=false)
	public void testleaf_links1(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Link.html");
		wd.findElement(By.linkText("Go to Home Page")).click();	
	}

	@Test(enabled=false)
	public void testleaf_links2(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Link.html");
		wd.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();	
	}
	
	@Test(enabled=false)
	public void testleaf_links3(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Link.html");
		wd.findElement(By.linkText("Verify am I broken?")).click();	
	}
	
	@Test
	public void testleaf_links4(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Link.html");
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a")).click();	
	}
	
	
}
