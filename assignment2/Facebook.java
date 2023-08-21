package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kavinaya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("udhayakumar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kavinaya@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kavinaya@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("KAthar@123");
		//driver.findElement(By.name("birthday_age")).sendKeys("32");
		
		WebElement drop1 = driver.findElement(By.id("day"));
		Select day =new Select(drop1);
		day.selectByValue("3");
		
		WebElement drop2 = driver.findElement(By.id("month"));
		Select month = new Select(drop2);
		month.selectByIndex(5);
		
		WebElement drop3 = driver.findElement(By.id("year"));
		Select year = new Select(drop3);
		year.selectByVisibleText("1992");
		
	driver.findElement(By.xpath("//input[@name='sex']")).click();
	
	
		
		
		
		
		
		
		
				}
}