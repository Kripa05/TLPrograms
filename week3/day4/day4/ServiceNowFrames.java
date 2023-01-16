package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNowFrames {
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev110326.service-now.com/");
		
		WebElement element = driver.findElement(By.xpath("//iframe [@id='gsft_main']"));
		driver.switchTo().frame(element);
		
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("India@123");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

}
