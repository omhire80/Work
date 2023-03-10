package com.TCS.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.asynchttpclient.filter.FilterException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_Launch {

	public static void main(String[] args) throws IOException, FileNotFoundException {
	
	//Condional Appproch-1
		String BrowserName= "Chrome";

	//Condional Appproch-2= to launch Browser With INput
		Properties obj =new Properties();
		FileInputStream input=new FileInputStream("./src\\main\\resources\\Launch.properties");
		obj.load(input);
		
		String key= obj.getProperty("BrowserName");
		System.out.println(key);
		
		
		if(key.equalsIgnoreCase("chrome")) {
	//Launch The Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./src\\main\\resources\\chromedriver.exe");
		ChromeDriver chromedriver = new ChromeDriver();
		
		}else if(key.equalsIgnoreCase("chrome")){
			
	//Launch The Edge Browser
		System.setProperty("webdriver.edge.driver", "./src\\main\\resources\\msedgedriver.exe");
		EdgeDriver edgedriver= new EdgeDriver();
	
		}
	
	
	
	
	
	}

}
