package my_practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//To check whether a single link is broken or not
	/*	driver.get("https://the-internet.herokuapp.com/status_codes"); //To open the application ::
		URL l = new URL("https://the-internet.herokuapp.com/status_codes/404"); //this is the link we will check whether it is broken or not
		HttpURLConnection link = (HttpURLConnection)l.openConnection();
		if(link.getResponseCode() < 400){ //Broken link status code is 400 or greater than 400
			                              //Working link status code is less than 400
			System.out.println("Link is working");
		}
		else {
			System.out.println("Link is broken");
		} */
		
		//To check multiple links broken or not ::
		driver.get("https://the-internet.herokuapp.com/status_codes"); //To open the application ::
		List <WebElement> links = driver.findElements(By.tagName("a"));//Stores all the links in links var
		for(WebElement l : links) { //using for instance
			String a = l.getAttribute("href");
			URL o = new URL(a);
			HttpURLConnection access_link = (HttpURLConnection)o.openConnection();
			if(access_link.getResponseCode() < 400) {
				System.out.println("Broken link = "+ a);
			}
			else {
				System.out.println("not a Broken link = "+ a);
			}
		}


	}

}
