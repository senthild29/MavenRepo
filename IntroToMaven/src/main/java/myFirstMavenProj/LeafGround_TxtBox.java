package myFirstMavenProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround_TxtBox {
	
	WebDriver driver;
	
	public void Open_Brow() {
		System.setProperty("webdriver.chrome.driver", "F:\\Senthil\\Testing\\Selenium_Setup\\Drivers\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	public void Handle_TxtBox() {
		driver.navigate().to("https://www.leafground.com/input.xhtml");
		WebElement TxtBox1 = driver.findElement(By.id("j_idt88:name"));
		TxtBox1.clear();
		TxtBox1.sendKeys("Hi There");
	}

	public void Close_Brow() {
		driver.close();
	}
	public static void main(String[] args) {
		
		LeafGround_TxtBox act = new LeafGround_TxtBox();
		act.Open_Brow();
		act.Handle_TxtBox();
		act.Close_Brow();

	}

}
