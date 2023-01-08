package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapsLogin {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kripa");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
		
		WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source = new Select(dropDown);
		source.selectByIndex(1);
		
		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingCampaignSource = new Select(marketingCampaign);
		marketingCampaignSource.selectByIndex(3);
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industrySource = new Select(industry);
		industrySource.selectByValue("IND_INSURANCE");
		
		WebElement preferredCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select preferredCurrencySource = new Select(preferredCurrency);
		preferredCurrencySource.selectByVisibleText("USD - American Dollar");
		
		//Submit button
		driver.findElement(By.name("submitButton")).click();
		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(name);
		if (name.equalsIgnoreCase("Kripa")) {
			System.out.println("Successful");
		}

	}
}
