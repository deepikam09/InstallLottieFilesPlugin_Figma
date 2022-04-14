import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class InstallLottieFilesPlugin {

	public static void main(String[] arg) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/deepi/Desktop/Lottie/chromedriver_win32/chromedriver.exe");

		// Launching Chrome
		WebDriver driver = new ChromeDriver();

		// Launching Figma url for LottieFiles Plugin
		driver.get("https://www.figma.com/community/plugin/809860933081065308/LottieFiles");
		driver.manage().window().maximize();

		// Find Log In button and Click
		driver.findElement(By.xpath("//*[@id=\"react-page\"]/div/div[1]/div[2]/div[1]/div")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"react-page\"]/div/div[5]/div/iframe")));

		// Enter Username and password
		driver.findElement(By.id("email")).sendKeys("deepika.muthuramalingam@gmail.com");
		driver.findElement(By.id("current-password")).sendKeys("$Miruma18");

		// Click on LogIn Button
		String bt = "//*[@id=\"auth-view-page\"]/button[2]";
		driver.findElement(By.xpath(bt)).click();

		// Login Successful
		System.out.println("Login Successful");

		// Goto Comunity Page
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"react-page\"]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/a"))
				.click();

		// Goto Plugins tab
		String plugtab = "//*[@id=\"react-page\"]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/a[2]";
		driver.findElement(By.xpath(plugtab)).click();

		// search for LottieFiles Plugin
		String searchfld = "//*[@id=\"react-page\"]/div/div/div[1]/div[1]/div[1]/div[2]/div/div/div/form/div/input";
		driver.findElement(By.xpath(searchfld)).sendKeys("LottieFiles");

		// Install LottieFiles Plugin
		String Instalpulgin = "//*[@id=\"react-page\"]/div/div/div[1]/div[2]/div[2]/div/div/div/div[4]/div/div[1]/div/div/div/div[4]/div";
		driver.findElement(By.xpath(Instalpulgin)).click();
		driver.close();
	}
}
