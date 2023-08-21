package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager"); 
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		 String title = driver.getTitle();         //print the title      
        System.out.println(title);  
        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("wipro");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("kavi");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("udhaya");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kavi@wipro.com");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9632587410");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        String text1  = driver.findElement(By.id("viewLead_companyName_sp")).getText();
    	System.out.println(text1);
        
        


	}

}
