package pages;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegPage extends HomePage{
	
public void regPage() throws InterruptedException{
	


	 navigateToRegister();
	 
	 
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.cssSelector("#header > div.container.modified-container.notranslate > div > div.col-2.custome-width.header_align.web-display > li > a > button")).click(); 
	
	WebElement ancer=driver.findElement(By.xpath("//*[@id=\"createAccount\"]"));
	ancer.click();		
	
//  Fill registration form  
	
	driver.findElement(By.id("UserId")).sendKeys("ayyanar123");
	
	driver.findElement(By.id("newPassword")).sendKeys("TestCase@123");
	
	driver.findElement(By.id("reenterPassword")).sendKeys("TestCase@123");
	
	driver.findElement(By.id("email")).sendKeys("ayyanarmadasamy07@gmail.com");
	
	driver.findElement(By.xpath("//*[@id=\"email_ver_but_send\"]")).click();
	
	
	
	WebElement verificationCodeElement = driver.findElement(By.xpath("//input[@id='email_ver_input']"));
	
//   Now, use Scanner to read verification code
	
	Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the verification code: ");
    String verificationCode = scanner.nextLine();

    // Send the verification code to verify
	verificationCodeElement.sendKeys(verificationCode);

   	scanner.close();
	
	
	driver.findElement(By.xpath("//*[@id=\"email_ver_but_verify\"]")).click();
	
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("//button[@id='continue']")).click();

	
	
//	driver.close();
}
}
