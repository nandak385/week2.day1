package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			String login = driver.getTitle();
			System.out.println(login);
			driver.manage().window().maximize();
			
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();

			
			//checking
			
			String title = "My Home | opentaps CRM";
			String homeTitle = driver.getTitle();
			
			if (title.equals(homeTitle)) {
				System.out.println("Correct Page");
			} 			
			else {
				System.out.println("Wrong Page");
			}

	        driver.findElement(By.linkText("Leads")).click();
	        driver.findElement(By.linkText("Create Lead")).click();

		    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("WTS");
		    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nanda");
		    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		    
		    WebElement countryCode=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		    countryCode.clear();
		    countryCode.sendKeys("6");
		    
		    WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		    Select drDown1 = new Select(dropdown1);
		    drDown1.selectByIndex(3);
		    
		    WebElement dropdown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		    Select drDown2 = new Select(dropdown2);
		    drDown2.selectByValue("9002");

		    
		    WebElement dropdown3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		    Select drDown3 = new Select(dropdown3);
		    drDown3.selectByVisibleText("Computer Hardware");

		    
		  
		    
		  
		    driver.findElement(By.name("submitButton")).click();
		    
		    



	}
}