package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("Nandak385");
		driver.findElement(By.name("firstname")).sendKeys("Nanda");
		driver.findElement(By.name("lastname")).sendKeys("K");
		driver.findElement(By.name("email")).sendKeys("123@gmail.com");
		
		WebElement dropdown1 = driver.findElement(By.name("country_id"));
		Select drDown1 = new Select(dropdown1);
		drDown1.selectByValue("99");
		 
		driver.findElement(By.name("password")).sendKeys("123@");

	
	}

}
