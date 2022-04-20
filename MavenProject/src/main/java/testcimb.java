import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.DOM;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.*;
import javax.xml.parsers.*;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;
import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;



public class testcimb {

	
	public static void main(String[] arg) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/deepi/Desktop/Lottie/chromedriver_win32/chromedriver.exe");

		// Launching Chrome
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cimb.com.my/en/personal/home.html");
		driver.manage().window().maximize();
		//driver.get("https://deals.cimb.com/");
		Actions action = new Actions(driver);
		action.doubleClick().perform();
		//BurgerMenu
		driver.findElement(By.xpath("//*[@class=\"main-global-header\"]/div[1]/div/div[1]/div[1]")).click();
		//CLick on CIMB Deals
		driver.findElement(By.xpath("//*[@class=\"main-global-header\"]/div[2]/div[1]/div/nav[6]/a[3]")).click();
		//Click On Travel&Lifestyles
		driver.findElement(By.xpath("/html/body/app/main/home-page/div/app-header/header/div[2]/category-menu/div/ul/li[5]/div")).click();
		//search for travel
		driver.findElement(By.xpath("/html/body/app/main/home-page/div/app-header/header/div[2]/category-menu/div[3]/div[3]/div/div[4]/div[1]")).click();
		
		//driver.findElement(By.xpath("//*[@class='container-fuild']/*[@class='col-6 col-md-3 align-items-center width-minimum']/div[@class='alp-cimbd-deal card']/img[@class='card-img-top' and @src='https://deals.cimb.com/deals_assets//my-cimb-deals…2021-12/AirAsia%20Ride%20Logo%20%28432x320%29.jpg']")).click();
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//List<WebElement> allElements = driver.findElements(By.tagName("DEAL-ITEM"));
		List<WebElement> allElements = driver.findElements(By.xpath("//img[@class=\"card-img-top\"]"));
		
		//driver.get("https://deals.cimb.com/my/travel%20&%20lifestyle/Traveloka/092d9b0d-4d08-44c4-90ab-8e0e2ea19efa");
		int cr = allElements.size();
	System.out.println(cr);
	for (int i = 0; i < cr; i++)

		{
		WebElement Contest_Name = allElements.get(i);
		if (i == 1)
		{
			Contest_Name.click();
		}
		
		System.out.println("Contest_Name:"+Contest_Name.getText());
		}
			//}
		}
			
			
		
		
	}

	
	
	
	

