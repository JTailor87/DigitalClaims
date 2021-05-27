package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementUtil {
	
	private WebDriver driver;
	
	public elementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ImplicitlyWait(long Time)
    {
		driver.manage().timeouts().implicitlyWait(Time, TimeUnit.SECONDS);
    }
	
	public void PageLoadTimeOut(long Time)
    {
		driver.manage().timeouts().pageLoadTimeout(Time, TimeUnit.SECONDS);
    }
	
	public void HardWait(long Time)
    {
		try {
			Thread.sleep(Time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
	
	public void ClickTheKeyboardKey(String key)
    {
        /*Please carry on adding as require a key*/
        if (key == "Enter")
        {
            Actions clickAction = new Actions(driver).sendKeys(Keys.ENTER);
            clickAction.build().perform();
        } else if (key == "Delete")
        {
            Actions clickAction = new Actions(driver).sendKeys(Keys.DELETE);
            clickAction.build().perform();
        }
    }
	
	public void WaitTillElementToClickable(By by, long TimeOut) {
		WebDriverWait wait = new WebDriverWait(driver, TimeOut);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public void ScrolldownTheEntirePage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void ScrolldownByPixel(int Pixel) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This  will scroll down the page by pixel vertical		
        js.executeScript("window.scrollBy(0,"+ Pixel + ")", "");
	}
	
	public void ScrolldownTillElementVisible(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void JavascriptExecutorElementClick(WebElement element) {
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", element); 
	}
	
	public void ZoomInOutChrome(double percentage)
    {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom = '" + percentage + "%'");
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        /*js.ExecuteScript("document.body.style.zoom = '80%'");
        Thread.Sleep(1000);
        js.ExecuteScript("document.body.style.zoom = '70%'");
        Thread.Sleep(1000);*/
    }

    public void DatePicker (String date, WebElement calender, WebElement monthmove, WebElement dateWidgetFrom) throws ParseException{
		/* Put your desired date in */
		String DateFromFeature = date;
		SimpleDateFormat sdF = new SimpleDateFormat("dd/MM/yyyy");
		Date featureDate = sdF.parse(DateFromFeature);
	
		/* Choose time zone in which you want to interpret your Date */
		Calendar calF = Calendar.getInstance(TimeZone.getTimeZone("GMT+2:00"));
		calF.setTime(featureDate);
		int yearF = calF.get(Calendar.YEAR);
		int monthF = calF.get(Calendar.MONTH) + 1;
		int dayF = calF.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("Year: " + yearF);
		System.out.println("Month: " + monthF);
		System.out.println("Day: " + dayF);
		
		/* Current date if want */
		Calendar calC = Calendar.getInstance(TimeZone.getTimeZone("GMT+2:00"));
		//calF.setTime(featureDate);
		int yearC = calC.get(Calendar.YEAR);
		int monthC = calC.get(Calendar.MONTH) + 1;
		int dayC = calC.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("Year: " + yearC);
		System.out.println("Month: " + monthC);
		System.out.println("Day: " + dayC);
		
		/* Click on calender */
		calender.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
	public void DeleteExit(String IDNumber) throws SQLException
	{
	    Connection con = DriverManager.getConnection("jdbc:sqlserver://AFJHB1AFODBQ1\\SQL01;databaseName=HrAssist;user=Resignations;password=Password@01;");
        
	    try(CallableStatement cstmt = con.prepareCall("{call dbo.DeleteExitForIdNumber(?)}");) {
	        cstmt.setString(1, IDNumber);
	        cstmt.execute();
	       
	        int count = cstmt.getUpdateCount();
	        System.out.println("ROWS AFFECTED: " + count);
	    }
	    // Handle any errors that may have occurred.
	    catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	 public void customWaitAndClickForStaleElementReferenceException(WebElement element) {
	        boolean flag = true;
	        long currentTime = System.currentTimeMillis();
	        long end = currentTime + 60000L;

	        while (!flag || System.currentTimeMillis() < end) {
	            try {
	                element.click();
	                break;
	            } catch (Exception e) {
	                flag = false;
	            }
	        }
	    }
	 
	 public int SelectRadomNumberWithinSpecificRange(int min, int max) {
			/* Generate random int value from 50 to 100 */ 
	      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			/*
			 * System.out.println("Random value in int from "+min+" to "+max+
			 * ":"+random_int);
			 */
	      return random_int;
	 }
	 
	public void AccessDropdownByIndex(WebElement element, int value) {
		Select dropdown = new Select(element);
		dropdown.selectByIndex(value);
    }
	
	public void AccessDropdownByValue(WebElement element, String value) {
		Select dropdown = new Select(element);
		dropdown.selectByValue(value);
    }
	
	public void AccessDropdownByVisibleText(WebElement element, String value) {
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(value);
    }

}
