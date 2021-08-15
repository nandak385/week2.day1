package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.name("UserFirstName")).sendKeys("Nanda");
	    driver.findElement(By.name("UserLastName")).sendKeys("K");
	    driver.findElement(By.name("UserEmail")).sendKeys("123@gmail.com");
	    
	    WebElement dropdown1 = driver.findElement(By.name("UserTitle"));
	    Select drDown1 = new Select(dropdown1);
	    drDown1.selectByValue("Developer");
	    
	    
	    driver.findElement(By.name("CompanyName")).sendKeys("WTS");

	    WebElement dropdown2 = driver.findElement(By.name("CompanyEmployees"));
	    Select drDown2 = new Select(dropdown2);
	    drDown2.selectByValue("9");

	    driver.findElement(By.name("UserPhone")).sendKeys("9566077380");
	    
	    
	    WebElement dropdown3 = driver.findElement(By.name("CompanyCountry"));
	    Select drDown3 = new Select(dropdown3);
	    drDown3.selectByValue("IN");
	    
	    driver.findElement(By.className("checkbox-ui")).click();
	    
	    driver.close();

		
	}

}
