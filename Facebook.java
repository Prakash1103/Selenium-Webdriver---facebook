package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create New Account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Prakash");
	    driver.findElement(By.name("lastname")).sendKeys("R");
	    driver.findElement(By.name("reg_email__")).sendKeys("6282363879");
	    driver.findElement(By.id("password_step_input")).sendKeys("Prakash@123");
	    
	    WebElement dropdown1 = driver.findElement(By.id("day"));
	    Select d1=new Select(dropdown1);
	    d1.selectByValue("3");
	    
	    WebElement dropdown2 = driver.findElement(By.id("month"));
	    Select d2=new Select(dropdown2);
	    d2.selectByIndex(8);
	   
	    WebElement dropdown3 = driver.findElement(By.id("year"));
	    Select d3=new Select(dropdown3);
	    d3.selectByValue("1999");
	    
	    driver.findElement(By.xpath("//label[text()='Male']")).click();
	    driver.findElement(By.name("websubmit")).click();
	    
	    }

}
