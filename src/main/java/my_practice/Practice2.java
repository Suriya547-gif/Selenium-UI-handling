package my_practice;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	/*	driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//To print the id of parent window :
		System.out.println("This is parent window : "+driver.getWindowHandle());
		
			//JAVASCRIPT EXECUTOR ::
				//  This is  used to find hidden elements
		WebElement b = driver.findElement(By.id("windowButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", b);
		//To find every hidden element  we have to pass this parameter "arguments[0].scrollIntoView(true);" i.e) this parameter is common for all hidden elements 
		b.click(); */
		
	/*	//PRACTICING JAVA SCRIPT EXECUTOR :		
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		//Maximize the window :
		driver.manage().window().maximize();
		//Starting automation after 10 seconds :
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//count the frame count :
	int	frame_count = driver.findElements(By.tagName("iframe")).size();
	System.out.println("Number of frames available in the page :"+frame_count);
	//Switch to frame 1:
	// Switch to frame
	driver.switchTo().frame(0);

	// Scroll down inside the frame
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, 500);");

	// Now find the element
	WebElement search = driver.findElement(By.id("td-header-search"));

	// Scroll that element into view
	js.executeScript("arguments[0].scrollIntoView(true);", search);

	// Click it
	search.click();
 
//Finding 1st search button in first frame ::
	//driver.findElement(By.xpath("//*[@id=\"td-header-search-button-mob\"]/i")).click();
	
	*/
		
		//PRACTICING WINDOWS HANDLE::
	/*	driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//To maximize window:
		driver.manage().window().maximize();
		//To print the id of parent window :
		String Parent = driver.getWindowHandle();
		System.out.println("This is parent window : "+Parent);
		//To open the child window for first time ::
		WebElement button = driver.findElement(By.id("windowButton"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", button);
		button.click();
		//To open the child window for first time ::
		WebElement b = driver.findElement(By.id("windowButton"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", b);
		b.click(); */
		
		//To print ID's for all opened windows::
	/*	Set <String> window_ids = driver.getWindowHandles();
		System.out.println("Id's for all windows :"+window_ids);
		int count = 1;
		for(String win : window_ids) {
			if(!win.equals(Parent)) {
				driver.switchTo().window(win);
				//String Title = driver.findElement(null)
				System.out.println("Switched to child window :"+count);
				System.out.println("Title of the child window : "+driver.getTitle());
				count++;
			}
		} */
		
		//WINDOW HANDLE PRACTICE ::
	/*	driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//NOTE ::
		/*Even if you maximize the browser, the page content 
		does not expand visually 
		because the layout is responsive and fixed-width. */
	//	String id_win_one = driver.getWindowHandle();
		//System.out.println("Id for window one : "+id_win_one);
		
	/*	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/button")).click();
		Set<String> Id_s =  driver.getWindowHandles();
		System.out.println("Id for multiple windows : "+Id_s); */
		
		// WINDOW HANDLE PRACTICE
	/*	driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Store JS executor in a variable
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Main window ID
		//String id_win_one = driver.getWindowHandle();

		// Locate button using ID
		WebElement btn = driver.findElement(By.id("windowButton"));

		// Scroll to the element using JS
		js.executeScript("arguments[0].scrollIntoView(true);", btn);

		// Click using JS
		//js.executeScript("arguments[0].click();", btn);
		btn.click();

		// Window handles
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids); */
		
		//WINDOW HANDLE ::
	/*	driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	WebElement button = driver.findElement(By.xpath("//*[@id=\"windowButton\"]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", button);
	button.click();
	button.click();
	String Parent_window_ID = driver.getWindowHandle();
	System.out.println("Parent_window_ID = "+Parent_window_ID);
	Set <String> Multiple_window_ids =  driver.getWindowHandles();
	System.out.println("Child_window_ID = "+Multiple_window_ids);
	int count = 1;
	for(String windows : Multiple_window_ids) {
		if(windows != Parent_window_ID ) {
			driver.switchTo().window(windows);
			System.out.println("Switched to child window "+ count);
		System.out.println(driver.getTitle());
			count ++;
	}
	}
	//SWITCHING BACK TO PARENT WINDOW ::
	driver.switchTo().window(Parent_window_ID);
	System.out.println("Back to parent window");
	//TO CLOSE THE BROWSER ::
	driver.quit(); */
	
	//Example 2: Close ONLY the child window, keep parent open ::
/*	driver.get("https://demoqa.com/browser-windows");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	JavascriptExecutor j_s = (JavascriptExecutor)driver;
	WebElement bu = driver.findElement(By.id("windowButton"));
	j_s.executeScript("arguments[0].scrollIntoView(true)", bu);
	bu.click();
	String par_id = driver.getWindowHandle();
	System.out.println("Parent_window_ID = "+par_id);
	Set<String> child_id = driver.getWindowHandles();
	System.out.println("All window id's = "+child_id);
	int count = 1;
	for(String id : child_id) {
		if(!id.equals(par_id)) {//use equals string method
			driver.switchTo().window(id);
			System.out.println("Switched to child window = "+count);
			String Title = driver.getTitle();
			System.out.println("Title of child window =  "+Title);
			//To get length of the title ::
			System.out.println("Title length = " + Title.length());
			//When to use title of the window ??::
			   //To check whether the window has title or not.
			//To close child window::
			driver.close();
		}
		count++;
	}
	//SWITCHING BACK TO PARENT WINDOW ::
	driver.switchTo().window(par_id);
	System.out.println("Switched back to parent window"); */
	
	//DIFFERENCE BETWEEN driver.quit() and driver.close()::
	// driver.close() :  only the current browser window that WebDriver is focused on and session continues
//driver.quit(); : Closes all windows, shuts browser and session ends
	
	//Example 3: Window Handling + Performing Action in Child
	/*	driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Finding button ::
		WebElement button = driver.findElement(By.id("windowButton"));
		//using javascript executor ::
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",button);
		button.click();
		//getting parent window id:
		String parent_id = driver.getWindowHandle();
		System.out.println("Parent window id = " + parent_id);
		//getting child window id:
		Set<String> child_id = driver.getWindowHandles();
		System.out.println("Child window id = " + child_id);
		//Switching to child window ::
		int count = 1;
		for(String ids : child_id) {
		if(!ids.equals(parent_id)) {
			driver.switchTo().window(ids);
			System.out.println("Switched to child window : " + count);
			String text = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
			System.out.println("Title of the child window = " + text);
			driver.close();
		}
		count++;
		
		}
		//SWITCH BACK TO PARENT WINDOW ::
		driver.switchTo().window(parent_id);
		System.out.println("Switched to parent window"); */
		
		//Window handling practice ::
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Window.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//getting the title from  in window 1:
		//String Text_main_page = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/h1")).getText();
		//System.out.println("Heading for window 1 = " +Text_main_page);
		//Clicking the home button in window 1:
		driver.findElement(By.id("home")).click(); //----As a result window 2 opens
		//getting parent window id ::
		String parent_id = driver.getWindowHandle();
		System.out.println("Parent window id = " + parent_id);
		//getting child window id ::
		Set <String> child_id = driver.getWindowHandles();
		System.out.println("All window ids = " + child_id);
		//Switching to child window  i.e) window 2::
		int count = 1;
		for(String ids : child_id ) {
			if(!ids.equals(parent_id)) {
				//OPENING THE CHILD WINDOW AFTER 2 SECONDS ::
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				driver.switchTo().window(ids);
		//	String	Text_win_2 = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[1]/h1")).getText();
		//	System.out.println("Heading for window 2= " + Text_win_2);
		//	driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a/img")).click();
			}
		}
		//Switching back to parent window ::
	/*	driver.switchTo().window(parent_id);
		//Working on sec button ::
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();//This button will open new window
		int window_count = 1;
		for(String idss : child_id) {
			if(!idss.equals(parent_id)) {
				window_count = window_count + 1;
				driver.close();
			}
			
			
		}
		System.out.println("Total window count = "+window_count ); 
		//Working on third button ::
	/*	driver.findElement(By.id("color")).click(); //----As a result window 2 opens
		//Switching to child window
		for(String ids : child_id) {
			if(!ids.equals(parent_id)) {
				driver.switchTo().window(ids);
				driver.close();
				System.out.println("Closed the child window alone" );
			}
		} 
		*/
		
		
		
		
		
		
	
	
		
		
	
	}

	}