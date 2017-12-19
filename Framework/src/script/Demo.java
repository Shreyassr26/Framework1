package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;

public class Demo extends BaseTest {

	@Test	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = Lib.getPpt(CONFIG_PATH, "URL");
		driver.get(url);
		
		
	}
}
