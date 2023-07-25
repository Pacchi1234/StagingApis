import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RippleStreetWebsiteAutomation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ripplestreet.com/discover/events");
		driver.findElement(By.xpath("//*[@id=\"mainContainer\"]/header/div/p[2]/button")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(
				"body > div:nth-child(12) > div > div:nth-child(1) > div > div > div > div > div > div:nth-child(3) > button:nth-child(3)"))
				.click();
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("sanathgudasi1@gmail.com");
	
		//driver.findElement(By.xpath("//a[text()='privacy policy']")).click();
		Thread.sleep(2000);

		driver.quit();
	}

}
