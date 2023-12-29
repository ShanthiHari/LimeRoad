package com.base;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions act;
	static JavascriptExecutor js;
	
	// 1 Launch Browser
	public static WebDriver launchBrowser(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
		
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver();
			}
		else if (browsername.equalsIgnoreCase("firefox")) {
		
			WebDriverManager.firefoxdriver();
			driver = new FirefoxDriver();
			
		}
		else if (browsername.equals("edge")){
		
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
		}
	// Get
	public static WebDriver launchUrl(String url) {
		driver.get(url);
		return driver;
	}
	// ImplicitWait 
	public static void  implicitwait(int a) {
		driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);
		
	}

	//Wait
	
public static void threadsleep(int minutes) throws InterruptedException {
	Thread.sleep(minutes);
}
	
	//Click
	public static void clickonelement(WebElement element) {
		element.click();
	}
	
	//SendKeys
	public static void inputvalues(WebElement element , String value) {
		element.sendKeys(value);
	}
	
	//Screenshot 
	public static void Screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File store = new File("C:\\Users\\shanthi\\Desktop\\DEC_PROJECT\\LimeRoadCucumber\\ScreenShot\\"+name+".png");
		FileHandler.copy(source, store);	
	}
	
	//Dropdown
	public static void dropdown(WebElement element , String ref , String value) {
		Select sel = new Select(element);
		if (ref.equals("value")) {
			sel.selectByValue(value);
		}
		else if (ref.equals("test")) {
			sel.selectByVisibleText(value);
		}
		else if (ref.equals("index")) {
			sel.selectByIndex(0);
		}
	}
	
	// Actiondoubleclick
	public static void actionclick(WebElement element) {
		act = new Actions(driver);
		act.contextClick(element).build().perform();
	}
	// Actions Move To Element
		public static void moveCursorActions(WebElement target) {
			act = new Actions(driver);
			act.moveToElement(target).perform();
		}
	//Actions drag and drop
    public static void dragdrop(WebElement source , WebElement store) {
    	act = new Actions(driver);
    	act.dragAndDrop(source, store);
    }
    
    //Javascript executor 
    public static void scrollbyvalue(int xaxis , int yaxis) {
    	js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy("+xaxis+", "+yaxis+")");
    	}
	//Windowhandles
   public static void windowhandles(int index) {
	   Set<String> set = driver.getWindowHandles();
	   List<String> list = new LinkedList<String>(set);
	   String id = list.get(index);
	   driver.switchTo().window(id);
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	//
}
