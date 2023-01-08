package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsDuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Email')]")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("kajal@testleaf.com");
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		Thread.sleep(2500);

		String leadName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]"))
				.getText();
		System.out.println(leadName);

		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Duplicate Lead')]")).click();
		driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2500);
		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (leadName.equalsIgnoreCase(name)) {
			System.out.println("Duplicate Name is the same as the captured Name");
		} else {
			System.out.println("Duplicate Name is not same as the captured Name");
		}

		//driver.close();
	}

}
