package gitnew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                driver.get("http://newtours.demoaut.com/");
                driver.close();
		
	}
		
		
		

	}


