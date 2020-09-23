package selenuimTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver", "/home/miguel/SelenuimDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(50, 50));
	}
}
