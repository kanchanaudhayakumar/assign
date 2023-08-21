package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	
        driver.findElement(By.id("username")).sendKeys("demosalesmanager"); 
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click(); 
       String title = driver.getTitle();       
        System.out.println(title);  
        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
        driver.findElement(By.linkText("Accounts")).click();	
        driver.findElement(By.linkText("Create Account")).click(); 
        driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("dfdff");
        driver.findElement(By.name("description")).sendKeys("account creating");
        driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("abc");
        driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("300000");
         
        WebElement drop1 = driver.findElement(By.name("industryEnumId"));
          Select industry =new Select(drop1);
          industry.selectByVisibleText("Computer Software");
          
          WebElement drop2 = driver.findElement(By.name("ownershipEnumId"));
          Select ownership = new Select(drop2);
          ownership.selectByVisibleText("S-Corporation");
          
          WebElement drop3 = driver.findElement(By.id("dataSourceId"));
          Select source = new Select(drop3);
          source.selectByValue("LEAD_EMPLOYEE");
          
          WebElement drop4 = driver.findElement(By.id("marketingCampaignId"));
          Select ecommerce = new Select(drop4);
          ecommerce.selectByIndex(4);
          
        driver.findElement(By.id("primaryEmail")).sendKeys("hg@gmail.com");
        driver.findElement(By.id("primaryPhoneNumber")).sendKeys("9874561230");
        
        
        driver.findElement(By.id("generalToName")).sendKeys("xyz");
        driver.findElement(By.id("generalAddress1")).sendKeys("balammal colony");
        driver.findElement(By.id("generalCity")).sendKeys("agra");
        driver.findElement(By.id("generalPostalCode")).sendKeys("657232");
        
        
        WebElement drop5 = driver.findElement(By.id("generalCountryGeoId"));
        Select country =new Select(drop5);
        country.selectByValue("IND");
        
        WebElement drop6 = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select state =new Select(drop6);
        state.selectByIndex(25);
        
        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
        driver.findElement(By.className("tabletext")).getClass();
        //String create = driver.findElement(By.id("viewAccount")).getText();
        
	//	System.out.println(create);
        
        
       
        
          
				
				
				
				
				
				

	}

}
