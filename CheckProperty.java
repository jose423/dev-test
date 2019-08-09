package selenium_automation_web;

import java.awt.Label;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckProperty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/josegonzalez/Downloads/chromedriver_linux64/chromedriver");
		Properties map = System.getProperties();
		
		System.out.println(map.getProperty("webdriver.chrome.driver"));
		

	}

}
