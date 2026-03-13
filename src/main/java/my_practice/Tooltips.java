package my_practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Tooltips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/home.html"); //Open the application
		WebElement t = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[20]/a/img")); //Tool tip button
		Actions a = new Actions(driver); //Using action class
		a.moveToElement(t).perform(); //Mouse hovering
		
		

	}

}
