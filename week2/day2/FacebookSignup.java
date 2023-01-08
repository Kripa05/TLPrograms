package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains (text(), 'Create New Account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Kripa");
		driver.findElement(By.name("lastname")).sendKeys("D");
		driver.findElement(By.name("reg_email__")).sendKeys("nd.kripa@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Testleaf@123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select dayDropDown = new Select(day);
		dayDropDown.selectByIndex(15);
		
		WebElement month = driver.findElement(By.id("month"));
		Select monthDropDown = new Select(month);
		monthDropDown.selectByVisibleText("Aug");
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearDropDown = new Select(year);
		yearDropDown.selectByValue("2012");
		
		driver.findElement(By.name("sex")).click();
	}
}
