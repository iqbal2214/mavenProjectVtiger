package passingDataInCommantLine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginVtiger {
	
	@Test
	public void login(){
		
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		
		WebDriver driver=null;
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		}else if 
		(browser.equals("firefox")) {
	  WebDriverManager.firefoxdriver().setup();
	  	driver=new FirefoxDriver();
	  	driver.get(url);
		}else if (browser.equals("msedge")) {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  	driver.get(url);
		}else {
		System.out.println("enter valid browser detail");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		driver.close();
	}
	}

