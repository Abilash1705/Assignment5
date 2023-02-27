package own;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Article {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://dev140572.service-now.com\r\n");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		WebElement filter = driver.findElement(By.id("filter"));
		filter.sendKeys("articles");
		driver.findElement(By.xpath("(//div[text()='Create New'])[5]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys("it"+Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();
		
		
	}

}
