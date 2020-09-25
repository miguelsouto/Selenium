package selenuimTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/miguel/SelenuimDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		String inputBoxName = "q";
		WebElement inputBox = driver.findElement(By.name(inputBoxName));

		if(inputBox != null) {
			inputBox.sendKeys("GitHub");
			inputBox.submit();
		}
	}
}
