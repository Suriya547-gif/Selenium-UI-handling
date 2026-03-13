package my_practice;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.dynamic.ClassFileLocator.ForUrl;


public class Revision {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/home.html");
		String parent_id = driver.getWindowHandle();
		System.out.println("parent_id = "+parent_id); //user is in the home page
		//Clicking main window button 
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a/img")).click();
		driver.findElement(By.id("home")).click(); //1st window button
	/*	Set<String> all_ids = driver.getWindowHandles();
		int count = 0;
		for(String all : all_ids) {
			System.out.println("id = "+all);
			count = count+1;
		}
		System.out.println("count of opened window = "+count); */
		
		driver.findElement(By.id("color")).click();
		Set<String> all = driver.getWindowHandles();
		for(String a : all) {
			if(!a.equals(parent_id)) {
				driver.switchTo().window(a).close();
			}
		}
		
		
		
		
		
		
		
	 }
}





