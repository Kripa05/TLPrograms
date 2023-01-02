package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumLaunchPage {

	public static void main(String[] args) {
		
		//Launch the browser
		//EdgeDriver driver = new EdgeDriver();
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//To verify the Title
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
