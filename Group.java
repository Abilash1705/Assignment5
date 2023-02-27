package own;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Group {
public static void main(String[] args) throws InterruptedException {
	//
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();

	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://dev140572.service-now.com");
	driver.switchTo().frame(0);
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
	driver.findElement(By.id("sysverb_login")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.id("filter")).sendKeys("my service categories");
	driver.findElement(By.xpath("//div[text()='My Service Categories']")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//button[@class='selected_action action_context btn btn-primary']")).click();
	driver.findElement(By.xpath("//label[text()='Group']")).click();
	
	driver.findElement(By.xpath("//input[@id='sys_display.IO:aefb68015f212100a9ad2572f2b47702']")).sendKeys("IT Securities");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='submit_button']")).click();
	

}
}
