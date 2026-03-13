package my_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//LEARNING SELECTBYINDEX() METHOD ::
	/*	driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/home.html");//opening the app
		//Locating and clicking the main drop down button
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img")).click();
		WebElement drop_down_one = driver.findElement(By.id("dropdown1")); //Locating drop down one
		drop_down_one.click();//Clicking drop down one
		Select o = new Select(drop_down_one);
		o.selectByIndex(1); */
		
		//LEARNING SELECTBYVALUE ::
	/*	driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/home.html");//opening the app
		//Locating and clicking the main drop down button
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img")).click();
		WebElement sec_dd = driver.findElement(By.name("dropdown2")); //Locating 2nd drop down
		sec_dd.click(); //Clicking second dropdown
		Select o = new Select(sec_dd); //using select class for second drop down
		o.selectByValue("2"); //selecting second value */
		
		//LEARNING TO TEST WHETHER A DROPDOWN IS SINGLE SELECT OR MULTISELECT ::
	/*	driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/home.html");//opening the app
		//Locating and clicking the main drop down button
	    driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img")).click();
		WebElement drop_down_three = driver.findElement(By.id("dropdown3")); //Locating third drop down
		drop_down_three.click(); //Clicking 3rd drop down
		Select o = new Select(drop_down_three );
		boolean ans = o.isMultiple();
		System.out.println(ans); */
		
		//LEARNING TO GET SELECTED OPTION FROM THE DROPDOWN (SINGLE SELECT)::
	/*	driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/home.html");//opening the app
		//Locating and clicking the main drop down button
	    driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img")).click();
	  //Locating drop_down_four
	    WebElement drop_down_four = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
	    drop_down_four.click(); //Clicking drop_down_four
	    Select o = new Select(drop_down_four);
	    o.selectByValue("3"); //Selecting a value from dropdown
	    WebElement ans = o.getFirstSelectedOption();
	    String r = ans.getText();
	    System.out.println(r); */
		
		//SELECTING MULTIPLE VALUES FROM MULTISELECT DROPDOWN ::
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/java/Automation.html"); //opening the app
		
	    
	    
		 
		
		
	}

}
