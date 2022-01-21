package example4a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium4 {

	@Test(enabled=false)
	public void testleaf_image1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Image.html");
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img")).click();
	}
	
	@Test(enabled=false)
	public void testleaf_image2() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Image.html");
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img")).click();
	}
	
	@Test
	public void testleaf_image3() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/pages/Image.html");
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img")).click();
	}
}
