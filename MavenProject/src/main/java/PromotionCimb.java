import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PromotionCimb {

	public static void main(String[] arg) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/deepi/Desktop/Lottie/chromedriver_win32/chromedriver.exe");

		// Launching Chrome
		WebDriver driver = new ChromeDriver();

		driver.get(" https://www.cimbbank.com.sg/en/personal/index.html");
		driver.manage().window().maximize();
		// BurgerMenu
		driver.findElement(By.xpath("//div[@class=\"main-global-header\"]/div[1]/div/div[1]/div[1]")).click();
		//GoTools
		driver.findElement(By.xpath("//*[@class=\"main-global-header\"]/div[2]/div[1]/div/nav[6]/a[1]")).click();
		//*[@id="rken2m4de"]/div/div/div/article[5]/a/h3
		driver.findElement(By.xpath("//*[@class=\"tool-listing          \"]/div/div/div/article[5]/a/h3")).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(0));
	    driver.close();
	    driver.switchTo().window(tabs2.get(1));
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/section/div/div[1]/div/div/div/div[1]/div/div/div/div/h3/div/input")).sendKeys("50000");
	    driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/section/div/div[1]/div/div/div/div[2]/div/div/div/div/h3/div/input")).sendKeys("8");
	  String EffectiveInterestRate = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/section/div/div[2]/div/div/div[2]/h3/span[1]")).getText();
	  String TotalInterestPayable = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/section/div/div[2]/div/div/div[3]/h3/span[2]")).getText();
	  String TotalAmountPayable = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/section/div/div[2]/div/div/div[4]/h3/span[2]")).getText();
	  System.out.println(EffectiveInterestRate);
	//*[@id="table-content ignoreMobileRightPadding"]/div[1]/table
	  List<WebElement> rows = driver.findElements(By.xpath("//*[@class=\"table-content ignoreMobileRightPadding\"]/div[1]/table/tbody/tr"));
	  int count = rows.size();
	  System.out.println("ROW COUNT : "+count);
	  if ( count == 9 ) {
		  System.out.println("Number of rows matching input tenure");
	  }
	  
	
	}
}
