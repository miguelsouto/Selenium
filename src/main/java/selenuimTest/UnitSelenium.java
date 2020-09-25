package selenuimTest;

import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnitSelenium {
	private static ChromeDriver driver;
	private static final String SEARCH_BOX_NAME = "q";
	
	@BeforeClass
	public static void before() {
		System.setProperty("webdriver.chrome.driver", "/home/miguel/SelenuimDrivers/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void test() {
		driver.get("https://google.com");
		WebElement searchBoxName = driver.findElement(By.name(SEARCH_BOX_NAME));
		assertNotNull(searchBoxName);
	}
	
	@AfterClass
	public static void after() {
		driver.close();
	}
}
