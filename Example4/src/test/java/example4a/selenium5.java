package example4a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium5 {
	
	@Test
	public void radio_buttons() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/");
		wd.findElement(By.linkText("Radio Button")).click();
		wd.findElement(By.id("yes")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]")).click();
		wd.close();
		
	}
	
	@Test(priority=1)
	public void checkbox() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.get("http://www.leafground.com/");
		wd.findElement(By.linkText("Checkbox")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[2]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[4]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[5]/input")).click();	
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input")).click();		
		wd.close();
			
	}
	
	

}
