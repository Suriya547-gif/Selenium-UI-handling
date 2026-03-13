package my_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
		driver.findElement(By.id("my-alert")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

	}

}
