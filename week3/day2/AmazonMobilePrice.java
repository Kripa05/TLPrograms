package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobilePrice {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles", Keys.ENTER);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		List<WebElement> mobilePrices = driver.findElements(By.className("a-price-whole"));
		System.out.println(mobilePrices.size());
		
		//create a list for ints
		List<Integer> lisfOfPrices = new ArrayList<Integer>();
		
		System.out.println("Prices of the mobiles:");
		
		//create a HashSet to remove duplicates
		Set<Integer> uniqueValues = new TreeSet();
		
		for(WebElement each:mobilePrices) {
			String price = each.getText();
			//To remove comma
			String finalPrice = price.replace(",", "");
			
			if(!finalPrice.isEmpty()) {
				int priceInInt = Integer.parseInt(finalPrice);
				lisfOfPrices.add(priceInInt);
				
			}
			
			Collections.sort(lisfOfPrices);
			
		}
		
		System.out.println(lisfOfPrices);
		System.out.println("Minimum Price: " + lisfOfPrices.get(0));
		
		//To find duplicates in list using if condition
		
		uniqueValues.addAll(lisfOfPrices);
		System.out.println(uniqueValues);
		
		if(lisfOfPrices.size() > uniqueValues.size()) {
			System.out.println("Duplicate values are present in the List");
			
		}
		
		
		driver.close();
		
	}

}
