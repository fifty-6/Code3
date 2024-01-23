package basicMaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TiraTest {

	@Test
	public void PerfumeTest() {
		
		WebDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		c.get("https://www.tirabeauty.com/");
		WebElement stf=c.findElement(By.id("search"));
		stf.sendKeys("Perfumes");
		stf.sendKeys(Keys.ENTER);
	
	}

}
