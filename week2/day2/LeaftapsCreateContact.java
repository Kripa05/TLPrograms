package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapsCreateContact {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]"));
		driver.findElement(By.xpath("//a[contains(text(), 'Create Contact')]")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Kripa");
		driver.findElement(By.id("lastNameField")).sendKeys("D");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kripa");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("D");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Engineering");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Engineering");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("nd.kripa@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateDropDown = new Select(state);
		stateDropDown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a [contains (text(), 'Edit')]")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is test data");
		driver.findElement(By.xpath("//input [@type = 'submit']")).click();
		System.out.println("Title is: " + driver.getTitle());
		
	}

}
