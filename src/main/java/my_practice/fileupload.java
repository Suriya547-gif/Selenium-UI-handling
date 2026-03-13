package my_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/upload"); //Open the app
		driver.findElement(By.id("fileSubmit")).click(); //Locating + clicking file upload button
		

	}

}
