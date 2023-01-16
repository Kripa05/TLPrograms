package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//Simple alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Simple Alert: " + alert.getText());
		alert.accept();
		
		//Confirm alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();	
		System.out.println("Confirm Alert: " + alert.getText());
		//alert.accept();
		alert.dismiss();
		
		//Prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		System.out.println("Prompt Alert: " + alert.getText());
		alert.sendKeys("Kripa Durairaj");
		alert.accept();
		String text = driver.findElement(By.id("confirm_result")).getText();
		
		if(text.contains("entered")) {
			System.out.println("Successfully entered the message and accepted the alert");
		} else {
			System.out.println("Alert not accepted");
		}
	}

}
