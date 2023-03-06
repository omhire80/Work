package sample;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Radio_Button {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "./src\\\\main\\\\resources\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		
		
		
		//Practice .isSelected(); method 
		//Practice .findElements(); method
			
		WebElement YesButton= driver.findElement(By.xpath("//label[text()='Yes']"));
		YesButton.click();

		if(YesButton.isEnabled()) {
			System.out.println("Test case is pass");
		}else {
			System.out.println("Test case is fail");
		}
		
	
		WebElement ImpButton=driver.findElement(By.xpath("//label[text()='Impressive']"));
		ImpButton.click();
		
		if(ImpButton.isEnabled()) {
			System.out.println("Test case is pass");
		}else {
			System.out.println("Test case is fail");
		}
		
		
		
		
	}

}
