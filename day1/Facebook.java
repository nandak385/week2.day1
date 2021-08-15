package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Nanda");
	    driver.findElement(By.name("lastname")).sendKeys("K");
	    driver.findElement(By.name("reg_email__")).sendKeys("123@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("123@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("123@");

	    
	    WebElement dropdown1 = driver.findElement(By.name("birthday_day"));
	    Select drDown1 = new Select(dropdown1);
	    drDown1.selectByIndex(2);
	    
	    WebElement dropdown2 = driver.findElement(By.name("birthday_month"));
	    Select drDown2 = new Select(dropdown2);
	    drDown2.selectByValue("12");
	    
	    WebElement dropdown3 = driver.findElement(By.name("birthday_year"));
	    Select drDown3 = new Select(dropdown3);
	    drDown3.selectByValue("1996");

	    
		driver.findElement(By.className("_58mt")).click();


	    



		

	}

}
