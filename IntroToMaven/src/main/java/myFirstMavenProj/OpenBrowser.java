package myFirstMavenProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	WebDriver driver;
	public void OpenGoogle() {
		System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://google.co.in");
		WebElement TxtBox =driver.findElement(By.name("q"));
		TxtBox.sendKeys("Chennai \n");
	}

	public void CloseBrow() {
		driver.quit();
	}
	public static void main(String[] args) {
		OpenBrowser open = new OpenBrowser();
		open.OpenGoogle();
		open.CloseBrow();

	}

}
