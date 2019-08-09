package selenium_automation_web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAmazonCheck {

	public static void main() {
		System.setProperty("webdriver.chrome.driver", "/home/josegonzalez/Downloads/chromedriver_linux64/chromedriver");
		System.out.println("Chrome Driver location: " + System.getProperty("webdriver.chrome.driver"));
		WebDriver driver = new ChromeDriver();
		System.out.println("Hi, Welcome to Jenkins automated testing");
		
		driver.navigate().to("https://amazon.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nike Shoes");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println("Page Title is:-" + title);
		
		driver.navigate().to("https://facebook.com");
		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.id("loginbutton")).click();
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		driver.quit();

	}

}
