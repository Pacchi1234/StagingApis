import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebAutomation {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		try {
			
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.atlassian.com/software/jira");
		driver.findElement(By.cssSelector(
				"#imkt-jsx--529f8848 > div > div > div > div > div:nth-child(1) > div > div > div > button")).click();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("prashanthmessi757@gmail.com");
		driver.findElement(By.cssSelector("button[id='login-submit']")).submit();

		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Messi@2000");
		driver.findElement(By.cssSelector("button[id='login-submit']")).click();
		// wait.until(null);
		driver.findElement(By.cssSelector("span[class='css-ob4lje']")).click();
		driver.findElement(By.xpath("//span[text()='Log out']")).click();
		/**
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 **/
		driver.findElement(By.cssSelector("span[class='css-178ag6o']")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
