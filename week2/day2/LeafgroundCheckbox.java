package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundCheckbox {
	
	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Basic']/preceding::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		//driver.findElement(By.xpath("(//label[text()='Java']/preceding::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]")).click();
		driver.findElement(By.xpath("//label[text()='Java']/preceding::div[@class='ui-chkbox ui-widget']")).click();
		
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[@class='ui-chkbox ui-widget']")).click();
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		boolean isEnabled = driver.findElement(By.xpath("//span[text()='Disabled']/preceding::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']")).isEnabled();
		System.out.println("Is the checkbox Enabled?: " + isEnabled);
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::ul")).click();
	}

}
