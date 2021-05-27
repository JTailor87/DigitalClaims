package Pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.driverFactory;
import Util.configReader;
import Util.elementUtil;

public class loginPage {

	private WebDriver driver;
	private WebDriverWait wait = new WebDriverWait(driverFactory.getDriver(), 20);
	private configReader ConfigReader;
	Properties prop;
	private elementUtil util = new elementUtil(driverFactory.getDriver());

// 1. By Locators: OR
	private By Username = By.xpath("//input[@id='username']");
	private By Password = By.xpath("//input[@id='password']");
	private By Login = By.xpath("//button[contains(text(),'Login')]");

//2. Constructor of the page class:

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

// 3. page actions: features(behavior) of the page the form of methods:
	
	public void OpenApplicationUrl() {
		driverFactory.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    	ConfigReader = new configReader();
		prop = ConfigReader.init_prop();
		
		  String ENV = prop.getProperty("Environment"); 
		 
        if (ENV.equalsIgnoreCase("QA")){
        	
        	System.out.println("Environment: " + prop.getProperty("Environment"));
    		driverFactory.getDriver().get(prop.getProperty("qaURL"));
    		
        } else if (ENV.equalsIgnoreCase("DEV")){
        	
        	System.out.println("Environment: " + prop.getProperty("Environment"));
    		driverFactory.getDriver().get(prop.getProperty("devURL"));
    		
        } else if (ENV.equalsIgnoreCase("STG")){
        	
        	System.out.println("Environment: " + prop.getProperty("Environment"));
    		driverFactory.getDriver().get(prop.getProperty("stgURL"));
    		
        }
	}
	
	public void EnterUsernameandPassword(String username) {
		
        driverFactory.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Username).sendKeys(username);
		/*
		 * ConfigReader = new configReader(); prop = ConfigReader.init_prop();
		 * 
		 * String ENV = prop.getProperty("Environment");
		 * 
		 * if (ENV.equalsIgnoreCase("QA")){
		 * 
		 * driver.findElement(Username).sendKeys(prop.getProperty("QAUsername"));
		 * driver.findElement(Password).sendKeys(prop.getProperty("QAPassword"));
		 * 
		 * } else if (ENV.equalsIgnoreCase("DEV")){
		 * 
		 * driver.findElement(Username).sendKeys(prop.getProperty("DEVUsername"));
		 * driver.findElement(Password).sendKeys(prop.getProperty("DEVPassword"));
		 * 
		 * } else if (ENV.equalsIgnoreCase("STG")){
		 * 
		 * driver.findElement(Username).sendKeys(prop.getProperty("STGUsername"));
		 * driver.findElement(Password).sendKeys(prop.getProperty("STGPassword"));
		 * 
		 * }
		 */
	}
	
	public void EnterPassword(String password) {
		
        driverFactory.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(Password).sendKeys(password);
	}
	
	public void ClickOnLoginButton() {
		driver.findElement(Login).click();
	}
}
