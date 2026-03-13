package my_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     FirefoxDriver driver = new FirefoxDriver();
     driver.get("https://www.facebook.com/");
     System.out.println(driver.getTitle());
     driver.findElement(By.id("email")).sendKeys("Suriya@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("Jayan");
	}

}
