package seleniumRevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class ChromeOptionClass {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","D:\\16 July A evening\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-popup-blocking");
		
		
		
		driver.get("https://www.justdial.com/");

	}

}
