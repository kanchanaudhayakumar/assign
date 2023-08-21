package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Delete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager"); 
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		 String title = driver.getTitle();         //print the title      
        System.out.println(title);  
        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
        driver.findElement(By.linkText("Leads")).click();
    	driver.findElement(By.linkText("Find Leads")).click();
    	
    	driver.findElement(By.xpath("//span[text()='Phone']")).click();
    	driver.findElement(By.name("phoneCountryCode")).clear();
    	driver.findElement(By.name("phoneCountryCode")).sendKeys("+91");
    	driver.findElement(By.name("phoneNumber")).sendKeys("9789471345");
    	
    	
    	Thread.sleep(3000);

    	driver.findElement(By.xpath("//button[@class='x-btn-text']")).click();
    	String result = driver.findElement(By.xpath("x-grid3-hd-inner x-grid3-hd-partyId")).getText();
    	System.out.println(result);
    	driver.findElement(By.className("linktext")).click();
    	String viewlead = driver.findElement(By.id("viewLead_companyName_sp")).getText();
    	System.out.println(viewlead);
    	
    	
    	driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
    	
    	driver.findElement(By.xpath("//a[text()='Find Leads']")).click(); 
    driver.findElement(By.xpath("//input[@name='id']")).sendKeys("12960");
    	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    	
    	String expectedRecords="No records to display";
    	String actualRecords=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
    	if(expectedRecords.equals(actualRecords)) {
    		System.out.println("Passed. No records to display");
    	}
    	

}

}

	