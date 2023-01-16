package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {

	public static void main(String[] args) {
		
		//To disable browser alerts
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
		
		if(text.equalsIgnoreCase("You pressed OK!")) {
			System.out.println("Successfully clicked the button and alert");
		} else {
			System.out.println("Unable to click the button and alert");
		}
	}
}
