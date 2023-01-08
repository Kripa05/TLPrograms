package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		System.out.println("CUrrent Title: " + driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println("Title After clicking the Button: " + driver.getTitle());
		
		driver.navigate().back();
		
		boolean isButtonDisabled = driver.findElement(By.xpath("//span [text() = 'Disabled']")).isEnabled();
		System.out.println(driver.findElement(By.xpath("//span [text() = 'Disabled']")).isEnabled());
		
		if(isButtonDisabled ) {
			System.out.println("The button is disabled");
		} else {
			System.out.println("The button is not disabled");
		}
		
		driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).click();
		
		
		System.out.println("Save Button Colour: " + driver.findElement(By.name("j_idt88:j_idt96")).getCssValue("background-color"));
		
		int height = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize().getHeight();
		int width = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize().getWidth();
		
		System.out.println("Height " + height);
		System.out.println("Width " + width);
		
		System.out.println("Success Button Colour: " + driver.findElement(By.name("j_idt88:j_idt100")).getCssValue("background-color"));
		
		
		//TO DO -- Mousehover and colour change
		
		driver.findElement(By.xpath("//span[text()='Image']")).click();
		driver.findElement(By.className("ui-overlaypanel-content")).click();
		driver.findElement(By.xpath("//h5[text()='How many rounded buttons are there?']"));
		
		//WebElement buttons = driver.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']/following::button"));
		List <WebElement> buttons = driver.findElements(By.xpath("(//div[@class='col-12 md:col-6'])[2]/div[4]/button"));
		System.out.println("Number of Buttons: " + buttons.size());
		
	}
}
