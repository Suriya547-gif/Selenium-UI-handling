package my_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteWebDriver driver = new ChromeDriver();
		//To open the app:
	driver.get("https://practicetestautomation.com/practice-test-login/");
	//Entering user name::
	WebElement un = driver.findElement(By.name("username"));
	un.click();
	un.sendKeys("student");
	//Entering password::
	WebElement pass = driver.findElement(By.name("password"));
	pass.click();
	pass.sendKeys("Password123");
	//Clicking on submit button ::
	driver.findElement(By.id("submit")).click();
	//To get the title once the page successfully logged in ::
	String t = driver.getTitle();
	System.out.println("Title = "+t);

	}

}
