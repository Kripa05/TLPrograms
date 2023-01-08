package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundRadioButtons {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[contains(text(), 'Chrome')]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label [contains(text(), 'Chennai')]/preceding-sibling::div")).click();
		
		
		//To complete - default browser selected
		List<WebElement> defaultBrowser = driver.findElements(By.xpath("//input[@name='j_idt87:console2']"));
		for (WebElement each:defaultBrowser) {
			String colour = each.getCssValue("background-color");
			if (colour.equalsIgnoreCase("#ffffff")) {
				System.out.println("Default Browser is: " + each.getText());
			}
		}
	}
}
