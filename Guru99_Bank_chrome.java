package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_Bank_chrome 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		Thread.sleep(2000);
		driver.findElement(By.name("uid")).sendKeys("mngr525975");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("nAredEj");
		Thread.sleep(2000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[.='New Customer']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Close");
		Thread.sleep(3000);
		driver.findElement(By.name("name")).sendKeys("Vishal");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@checked='']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("dob")).sendKeys("01/05/1996");
		Thread.sleep(2000);
		driver.findElement(By.name("addr")).sendKeys("Shriram Vatika, Shanivar Peth");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("Miraj");
		Thread.sleep(2000);
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		Thread.sleep(2000);
		driver.findElement(By.name("pinno")).sendKeys("416410");
		Thread.sleep(2000);
		driver.findElement(By.name("telephoneno")).sendKeys("8275379085");
		Thread.sleep(2000);
		driver.findElement(By.name("emailid")).sendKeys("bhatvishal30609@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Vishal30609");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Managerhomepage.php")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout.php")).click();
				
		
	}

}

