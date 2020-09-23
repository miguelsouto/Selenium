package selenuimTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiNavigate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/miguel/SelenuimDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pt.wikipedia.org/");
		
		WebElement searchInput = driver.findElement(By.id("searchInput"));
		searchInput.sendKeys("Docker");
		searchInput.submit();
		WebElement headerPage = driver.findElement(By.id("firstHeading"));
		
		if(searchInput != null && headerPage.getText().contains("Docker")) {
			System.out.println(headerPage.getText());
			driver.close();
		} else {
			System.out.println("Failed");
		}
	}
}
