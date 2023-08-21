package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class NewLead {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//input[@id='ext-gen255']")).sendKeys("tharsh");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])//a")).click();
	String companyname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(companyname);
	driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[text()='Edit']")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("cts");
	driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	
	String companyname2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(companyname2);
	
	
	
	
	}


}
