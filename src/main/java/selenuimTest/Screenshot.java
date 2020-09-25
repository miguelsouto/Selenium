package selenuimTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/home/miguel/SelenuimDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		File fileSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//select the path of yout project to generate the file
		FileUtils.copyFile(fileSrc, new File("/home/miguel/workspace/demos/seleniumTest/img.png"));
	}
}
