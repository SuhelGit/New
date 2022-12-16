package seleniumRevision;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\16 July A evening\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/alerts");
	    
	    driver.findElement(By.id("alertButton")).click();
	    Thread.sleep(1000);
	    
	    Alert alt = driver.switchTo().alert();
	    
	    alt.accept();
	    alt.accept();

	}

}
