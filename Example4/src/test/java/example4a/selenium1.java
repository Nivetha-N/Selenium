package example4a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium1 {

	@Test
	public void amazon() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver wd;
		wd=new ChromeDriver();
		wd.navigate().to("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Flog%2Fs%2F%3F_encoding%3DUTF8%26k%3Dlog%2520in%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		wd.findElement(By.id("ap_customer_name")).sendKeys("Nivetha");
		wd.findElement(By.id("ap_email")).sendKeys("nivethan@hcl.com");
		wd.findElement(By.id("ap_password")).sendKeys("P@ssword");
		wd.findElement(By.id("ap_password_check")).sendKeys("P@ssword");
	}
}
