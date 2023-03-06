package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		
	//Register Driver
		System.setProperty("webdriver.chromedriver.driver", "./src\\main\\resources\\chromedriver.exe");
		ChromeDriver chrome =new ChromeDriver();
	//Open the Testing WebSite
		chrome.get("https://demoqa.com/text-box");
		chrome.manage().window().maximize();
	//Operations
		WebElement FullName= chrome.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']/input[@id='userName']"));
		FullName.sendKeys("Om Hire");
		
		WebElement Email= chrome.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']/input[@id='userEmail']"));
		Email.sendKeys("omhire89@gmail.com");
		
        WebElement CurrentAdress =chrome.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        CurrentAdress.sendKeys("A-1, Yogeshwar Ro-house,Bhansali Mala,Panchavati,Nashik 422 003");
        
        
        WebElement PermanatAdress =chrome.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        PermanatAdress.sendKeys("A-1, Yogeshwar Ro-house,Bhansali Mala,Panchavati,Nashik 422 003");
        
// Xpath Method to cretae locator by using text = //button[text()='Submit']
        WebElement Submit=chrome.findElement(By.xpath("//button[text()='Submit']"));
        Submit.click();
		
		
     
		
		
		
		
	}

}
