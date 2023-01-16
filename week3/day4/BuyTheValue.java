package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyTheValue {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://buythevalue.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@href=\"/products/urban-fit-x-smart-watch\"]")).click();
		
		
		driver.findElement(By.xpath("//div[@id='com-hextom-smartpushmarketing-modal-close-modal']")).click();
		
		//Handling chat (inside a frame)
		driver.switchTo().frame("hubspot-conversations-iframe");
		driver.findElement(By.xpath("//button[@class= 'InitialMessageBubble__CloseButton-sc-1sz7s3c-2 fVrRGD']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@ name = 'wk_zipcode']")).sendKeys("600100");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='wk_zipfinder_btn']")).click();
		
		
		WebElement checkButton = driver.findElement(By.xpath("//div[@class='wk_zipfinder_btn']"));
		driver.executeScript("arguments[0].click();", checkButton);
		 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Add to Cart']/parent::button)[1]")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='View Cart']")).click();
		
		
		WebElement viewCartButton = driver.findElement(By.xpath("//span[text()='View Cart']"));
		driver.executeScript("arguments[0].click();", viewCartButton);
		Thread.sleep(1000);
		  
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	
	}

}
