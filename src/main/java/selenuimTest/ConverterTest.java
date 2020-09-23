package selenuimTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConverterTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/miguel/SelenuimDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.metric-conversions.org/length/centimeters-to-meters.htm");
		
		WebElement inputField = driver.findElement(By.id("argumentConv"));
		inputField.sendKeys("100");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		WebElement outputField = driver.findElement(By.id("answer"));
		
		if(inputField != null && outputField.getText().contains("= 1.000000m")) {
			System.out.println("Sucess!");
		} else {
			System.out.println("Nice try.");
		}
	}
}
