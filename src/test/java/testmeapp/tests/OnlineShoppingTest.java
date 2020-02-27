package testmeapp.tests;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


//registration
public class OnlineShoppingTest {
	WebDriver driver=null;
		@Test(priority=1)
	public void testRegistration() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4a.04.27\\Desktop\\browser drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://10.232.237.143:443/TestMeApp/fetchcat.htm");
		Thread.sleep(5000);
		driver.findElement(By.id("details-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(text(),'SignUp')]")).click();
		driver.findElement(By.id("userName")).sendKeys("salman5761");
		driver.findElement(By.id("firstName")).sendKeys("salman");
		driver.findElement(By.id("lastName")).sendKeys("salman");
		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.id("pass_confirmation")).sendKeys("password123");
		WebElement radio=driver.findElement(By.id("gender"));
		radio.click();
		driver.findElement(By.id("emailAddress")).sendKeys("dskhan5757@gmail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("9000695757");
		driver.findElement(By.id("dob")).sendKeys("02/02/1997");
		driver.findElement(By.id("address")).sendKeys("Bangalore");
		Select bp=new Select(driver.findElement(By.id("securityQuestion")));
		bp.selectByIndex(3);
		driver.findElement(By.id("answer")).sendKeys("baby");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(5000);
	}
	//LOGIN
	@Test(priority=2)
	public void testLogIn() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("salman5761");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[contains(text(),'SignOut')]")).click();
		driver.close();

	}
}
	




