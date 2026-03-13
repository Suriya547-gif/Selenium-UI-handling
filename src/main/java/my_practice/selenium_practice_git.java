package my_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium_practice_git {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.qaplayground.com/practice?utm_source=chatgpt.com");//To open the application
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize(); //Maximizing the window
		//Finding drop down button
		WebElement drop_down_button = driver.findElement(By.xpath("/html/body/main/div/div/div/div/section[2]/div[4]/div[3]/a/span"));
		drop_down_button.click(); //Click the drop down button
		Thread.sleep(3000);
		//Finding first_drop_down
		WebElement first_drop_down = driver.findElement(By.xpath("/html/body/main/div/div/div/div/section/div/div/div[1]/div/div/div[1]/button"));
		first_drop_down.selectByVisibleText();

		
		
		
		
		
		
	}

}
