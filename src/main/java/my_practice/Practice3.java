//DROPDOWN ::

package my_practice;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//Practicing drop down ::
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/home.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String text = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[5]/a/h5")).getText();
        System.out.println("Automation will be conducted on = "+text);
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img")).click();
        //Get heading :
       String h = driver.findElement(By.className("wp-heading")).getText();
       System.out.println("Subheading = " + h);//After clicking drop down::
       //To check how many drop downs available in the page ::
       List<WebElement> dd = driver.findElements(By.tagName("select"));
       System.out.println("Number of drop downs = "+dd.size());
       //Click the drop down 1::
       driver.findElement(By.id("dropdown1")).click();
       
	}

}
