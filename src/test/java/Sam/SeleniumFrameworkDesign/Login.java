package Sam.SeleniumFrameworkDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login {
	@Test
	public void verifyLoginWithValidCredentials() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/status_codes");
		// driver.findElement(By.xpath("//a[text()='200']")).click();
		for (int i = 1; i < driver.findElements(By.xpath("//*[@id=\"content\"]/div/ul/li")).size(); i++) {
			String clickonlinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			driver.findElements(By.xpath("//*[@id=\"content\"]/div/ul/li")).get(i).sendKeys(clickonlinks);
		}
	}
}
