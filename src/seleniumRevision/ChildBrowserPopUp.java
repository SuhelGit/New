package seleniumRevision;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) {
               
		
		System.setProperty("webdriver.chrome.driver","D:\\16 July A evening\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
		Set<String> ID = driver.getWindowHandles();
		
		           Iterator<String> IT = ID.iterator();
		           
		           String FirstID = IT.next();
		           String SecondID = IT.next();
		           
		           System.out.println(FirstID);
		           
		           driver.switchTo().window(SecondID);
		           
		           driver.findElement(By.xpath("//a[text()='About Us']")).click();
		           
		           driver.switchTo().defaultContent();
		           driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
	}

}
