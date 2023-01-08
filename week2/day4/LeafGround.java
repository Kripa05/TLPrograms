package week2.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		Select toolDropDown = new Select(tool);
		
		List<WebElement> toolOptions = toolDropDown.getOptions();
		
		for(WebElement each:toolOptions) {
			if (each.getText().equalsIgnoreCase("PlayWright") || (each.getText().equalsIgnoreCase("Cypress"))) {
				each.click();
				System.out.println(each.getText());
			} 
		}
		
		//using normal for loop
		
		System.out.println("Printing values using alternate loop");
		for (int i = 0; i < toolOptions.size(); i++) {
			
			System.out.println(toolOptions.get(i).getText());
			
		}
	}
}
