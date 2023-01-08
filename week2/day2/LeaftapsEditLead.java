package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsEditLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("babu");
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		String leadName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]")).getText();
		System.out.println("Lead Name " + leadName);
		System.out.println("Title " + driver.getTitle());
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]")).click();
		driver.findElement(By.xpath("//a[contains (text(), 'Edit')]")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf123");
		driver.findElement(By.xpath("//input [@name='submitButton'][1]")).click();
		String updatedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Company NAme is changed from " + leadName +"to" + updatedCompanyName);
		
	}
}
