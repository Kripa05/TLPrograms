package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafgroundSelect {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement tool = driver.findElement(By.xpath("//h5[text()='Which is your favorite UI Automation tool?']/following::select"));
		Select toolDropDown = new Select(tool);
		toolDropDown.selectByVisibleText("Selenium");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		
		 driver.findElement(By.xpath("//h5[text()='Choose your preferred country.']/following::div")).click();
		// Thread.sleep(2000);
		 driver.findElement(By.xpath("(//div[@id='j_idt87:country_panel']/div/ul/li)[4]")).click();
		 
		// Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//h5[text()='Confirm Cities belongs to Country is loaded']/following::div")).click();
		 driver.findElement(By.xpath("(//div[@id='j_idt87:city_panel']/div/ul/li)[3]")).click();
		 
		 
		driver.findElement(By.xpath("//h5[text()='Choose the Course']/following::button")).click();
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click(); //span[@id='j_idt87:auto-complete_panel']  //span[@id='j_idt87:auto-complete_panel']/ul/li[3]
		
		 driver.findElement(By.xpath("//h5[text()='Choose language randomly']/following::div[@id='j_idt87:lang']")).click();
		 driver.findElement(By.xpath("//div[@id=\"j_idt87:lang_panel\"]/div/ul/li[2]")).click();
		 
		 driver.findElement(By.xpath("//h5[contains(text() , 'irrespective of the language chosen')]/following::div")).click();
		 driver.findElement(By.xpath("//ul[@id='j_idt87:value_items']/li[4]")).click();
		 
		
	}

}
