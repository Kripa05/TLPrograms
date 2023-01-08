package week2.day2;

import javax.swing.text.TabableView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundInput {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[text()='Type your name']/following::input")).sendKeys("KripaDurairaj");
		driver.findElement(By.xpath("//h5[text()='Append Country to this City.']/following::input")).sendKeys("Coimbatore");
		boolean isButtonEnabled = driver.findElement(By.xpath("//h5[text()='Verify if text box is disabled']/following::input")).isEnabled();
		if (isButtonEnabled) {
			System.out.println("The button is disabled");
		
		} else {
			System.out.println("The button is disabled");
		}
		
		driver.findElement(By.xpath("//h5[text()='Clear the typed text.']/following::input")).clear();
		String text = driver.findElement(By.xpath("//h5[text()='Retrieve the typed text.']/following::input")).getText();
		System.out.println(text);
		
		WebElement email = driver.findElement(By.xpath("//h5[contains(text(),'Type email')]/following::input"));
		email.sendKeys("nd.kripa@gmail.com");
		email.sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//h5[contains(text(),'Type about yourself')]/following::textarea")).sendKeys("This text area is to tell about oneself");
//		driver.findElement(By.xpath("(//input[@name='j_idt88:j_idt103_input']")).sendKeys("This is Text Editor");
		driver.findElement(By.xpath("//input[@name='j_idt106:thisform:age']")).sendKeys(Keys.RETURN);
		System.out.println("Error Message: " + driver.findElement(By.xpath("//span[text()='Age is mandatory']")));
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Username']")).getLocation());
		driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).click();
		System.out.println("After clciking the textbox");
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Username']")).getLocation());
		
		driver.findElement(By.xpath("//input[@name='j_idt106:auto-complete_input']")).sendKeys("Kripa");
		//driver.findElement(By.xpath("//li[@role='option'][3]")).gett
		
		
		
	
	}
	
	
	
	

}
