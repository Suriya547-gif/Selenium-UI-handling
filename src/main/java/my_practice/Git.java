package my_practice;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.lang3.ThreadUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Git {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/home.html"); //open the application
		driver.manage().window().maximize(); //Maximize the window
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click(); //clicking the edit button
		WebElement mail_text_box = driver.findElement(By.id("email"));//Finding mail id text box
		mail_text_box.sendKeys("Suriya@gmail.com");//sending mail id
		//Finding append text box
		WebElement append_text_box = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		append_text_box.sendKeys("appending"); //sending value
		append_text_box.sendKeys(Keys.TAB); //pressing tab in keyboard
		//WebElement get_Text_box = driver.switchTo().activeElement(); //Finding get text box 
		WebElement get_text_box = driver.findElement(By.name("username"));//
		String v = get_text_box.getAttribute("value").toString(); //Getting value available in the get text box
		System.out.println("Value availabele in the text box ="+v);//Getting value available in the get text box
		WebElement clear_text_box = driver.findElement(By.name("username"));//Finding clear text box 
		clear_text_box.clear();//Clearing the value in clear text box
		//find the text box:
		WebElement enabled_or_not = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		if(enabled_or_not.isEnabled()) { //checking whether a text box enabled or disabled
			System.out.println("Text box is Enabled");
		}
		else {
			System.out.println("Text box is disabled");
	        }
		Thread.sleep(5000);
		driver.navigate().refresh();//Refresh the page
		Thread.sleep(5000);
		driver.navigate().back(); //Back navigation
		WebElement b = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")); //finding button
		b.click();//clicking button
		WebElement button_one = driver.findElement(By.xpath("//*[@id=\"home\"]")); //finding first button
		button_one.click(); //Clicking first button
		driver.navigate().back(); //Back navigation
		WebElement second_button = driver.findElement(By.id("position"));//finding second button
		int x = second_button.getLocation().getX();// get the X position of the second button 
		int y = second_button.getLocation().getY();// get the Y position of the second button 
		System.out.println("X position of the button = "+x); //Printing the X position of the second button
		System.out.println("Y position of the button = "+y); //Printing the Y position of the second button
		WebElement color_button = driver.findElement(By.id("color")); //Finding color button
		String color = color_button.getCssValue("background-color"); //getting the color of the button
		System.out.println("Color of the button ="+color); //Printing the color of the button
		WebElement size_button = driver.findElement(By.id("size")); //Finding the size button
		int ht = size_button.getSize().getHeight(); //getting height of the size button
		int w = size_button.getSize().getWidth(); //getting width of the size button
		System.out.println("Height of the button ="+ht); //Printing the height of the button
		System.out.println("Width of the button ="+w); //Printing the width of the button
		driver.navigate().back(); //Back navigation
		//Finding hyperlink_button
		WebElement hyperlink_button = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/img"));
		hyperlink_button.click(); //Clicking hyperlink button
		List<WebElement> hyperlinks = driver.findElements(By.tagName("a")); //Finding all available hyperlinks
		int hyperlinks_count = hyperlinks.size();//counting how many hyperlinks available in the page
		//Printing all available links in the page ::
		System.out.println("Num of hyperlinks available in the page = "+hyperlinks_count); 
		//To print the visible link available in the page :: 
		int ans = 0;
        for (WebElement link : hyperlinks) {
		    if (link.isDisplayed() && !link.getText().trim().isEmpty()) {
		        ans++;
		    }
		}
        //To print the number of visible links
		System.out.println("Num of visible hyperlinks available in the page = " + ans); 
		//Finding the first link
		WebElement first_link = driver.findElement(By.partialLinkText("Go"));
		first_link.click(); //Clicking the first link
		driver.navigate().back();//back navigation
		//Finding second link
		WebElement second_link = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String new_page = second_link.getAttribute("href"); //Saving new page link
		System.out.println("new_page link = "+new_page); //printing the new page link
		//finding whether a link is broken or not
		URL linkUrl = new URL("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/error.html");
		HttpURLConnection conn = (HttpURLConnection) linkUrl.openConnection();
		conn.connect();
        if(conn.getResponseCode() >= 400) {
		    System.out.println(linkUrl + " --> Broken link");
		} else {
		    System.out.println(linkUrl + " --> Valid link");
		}
        //Finding 4th hyperlink
        WebElement fourth_link = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a"));
        String d = fourth_link.getAttribute("href"); //Getting href value for the 4th link
        System.out.println("Destination after clicking fourth link = "+d); //Printing the new destination page
        driver.navigate().back(); //back navigation
        WebElement bu = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a/img")); //Finding Image button
        bu.click(); //Clicking image button
        //Finding 1st i,age button
        WebElement first_button = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
        first_button.click();//Clicking first_button
        driver.navigate().back();//Back navigation
        //Finding second image + Testing the image is broken or not
        WebElement i = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/img"));
        String i_url = i.getAttribute("src");//Getting image url
        URL o = new URL(i_url);
        HttpsURLConnection image = (HttpsURLConnection)o.openConnection();
        image.connect();
        if (image.getResponseCode() >= 400){
        	System.out.println("Broken image");
        }
        else {
        	System.out.println("Image is good");
        }
        //Finding third image
     /*  WebElement third_image = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img"));
       Actions actions = new Actions(driver); //using actions class for keyboard interaction
       actions.moveToElement(third_image).sendKeys(Keys.ENTER).build().perform(); //clicking the enter button on keyboard
      
       */
        driver.navigate().back();
        //Finding drop down button
        WebElement drop_down = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img"));
        drop_down.click(); //Clicking drop down button
        WebElement first_drop_down = driver.findElement(By.id("dropdown1")); //Finding first drop down button
        first_drop_down.click(); //Clicking the first drop down
        Select s1 = new Select(first_drop_down); //using select class to select a value from dropdown
        s1.selectByVisibleText("Select training program using Index"); //Selecting value from drop down
        WebElement second_drop_down = driver.findElement(By.name("dropdown2")); //Finding second drop down button
        Select s2 = new Select(second_drop_down); //Select class for second drop down
        second_drop_down.click(); //Clicking the second drop down
        s2.selectByVisibleText("Select training program using Text"); //Selecting a value in second drop down
        WebElement third_drop_down = driver.findElement(By.id("dropdown3"));//Finding third drop down
        third_drop_down.click(); //Clicking third drop down
        Select s3 = new Select(third_drop_down); //using select class for third drop down
        s3.selectByVisibleText("Select training program using Value");//Selecting a value from third drop down
        WebElement Fourth_drop_down = driver.findElement(By.className("dropdown")); //Finding fourth drop down
        Select s4 = new Select(Fourth_drop_down); //using select class for fourth drop down
        List <WebElement> fourth_drop_down_values = s4.getOptions();//Getting all options from the drop down
        int count_fourth_drop_down_values = fourth_drop_down_values.size(); //counting fourth_drop_down_values
        //Printing the count of fourth_drop_down_values
        System.out.println("count_fourth_drop_down_values = "+count_fourth_drop_down_values);
        //Finding 5th drop down
        WebElement fifth_drop_down = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
        fifth_drop_down.sendKeys("Selenium"); //Selecting a value from fifth_drop_down using sendKeys()
        //Finding 6th drop down
        WebElement sixth_drop_down = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
        Select s6 = new Select(sixth_drop_down); //Using select class for drop down 6
        s6.selectByVisibleText("Selenium"); //Selecting a value from 6th drop down
        driver.navigate().back(); //Back navigation
        //Finding main radio button + click it
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[6]/a/img")).click();
        WebElement radio_button_one = driver.findElement(By.id("yes")); //Finding radio_button_one
        radio_button_one.click(); //Clicking radio_button_one
        WebElement radio_button_two = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]"));
        boolean a = radio_button_two.isSelected(); //using isSelcted() to check radio button is selected or not
                                                   //isSelcted() always has boolean value
        if (a == true) {
        	System.out.println("Radio Button 2 is selected");
        }
        else {
        	System.out.println("Radio Button 2 is not selected");
        }
        //Locating radio_button_three
        WebElement radio_button_three = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
        boolean c = radio_button_three.isSelected(); //Checking radio_button_three is selected or not
        if(c == true) {
        	System.out.println("Radio Button 3 is selected");
        }
        else {
        	System.out.println("Radio Button 3 is not selected");
        }
        //To select a radio button based on the age
        Scanner sc = new Scanner(System.in); //Using scanner
        System.out.println("Enter your age = ");
        int age = sc.nextInt(); //Getting age from user
        if(age >= 1 && age <= 20) {
        	//Radio button for age  1 and 20
        	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]")).click();
        	System.out.println(age);
        }
        else if(age >= 21 && age <= 40){
        	//Radio button for age  21 and 40
        	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]")).click();
        	System.out.println(age);
        }
        else {
        	//Radio button for age  above 40
        	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]")).click();
        	System.out.println(age);
        	
        }
        driver.navigate().back();//Back navigation
        //Locating + clicking check box in home page
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[7]/a/img")).click();
        //Locating check box one 
        WebElement check_box_one = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
        check_box_one.click(); //Clicking check box one
        //Locating check box two
        WebElement check_box_two = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
        //isSelected() method is used to check whether a check box is selected or not
        boolean q = check_box_two.isSelected(); 
        if(q == true) {
        	System.out.println("Check box is selected");
        }
        else {
        	System.out.println("Check box not is selected");
        }
        //Locating check_box_three
        WebElement check_box_three = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
        boolean we = check_box_three.isSelected();
        if(we == true) {
        	check_box_three.click();
        }
        //Locating multiple check boxes 
        List <WebElement> all_check_boxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement cb : all_check_boxes) { //Using for each loop
        	if(!cb.isSelected()) {
        		cb.click(); //Selecting multiple check boxes
        	}
        }
        driver.navigate().back(); //Back navigation
        //Locating + Clicking table button
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[8]/a/img")).click();
        List<WebElement> col = driver.findElements(By.tagName("th")); //Finding table column headers
        int col_count = col.size(); //getting column header count
        System.out.println("Column count in a table = "+col_count); //Printing column count
        List<WebElement> row = driver.findElements(By.tagName("tr")); //Finding rows
        int row_count = row.size();//getting row count
        System.out.println("Row count in a table = "+row_count);//printing row count
        //Locating the "Progress value of 'Learn to interact with elements'
        String pv = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[3]/td[2]")).getText();
        //Printing the "Progress value of 'Learn to interact with elements'
        System.out.println("Progress value of 'Learn to interact with elements' = "+pv);
        //Locating + clicking the check box of 1st vital button in a table 
        driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[4]/td[3]/input")).click();
        driver.navigate().back(); //Back navigation
        //Clicking main alert button 
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a/img")).click();
        //Locating 1st alert button 
        WebElement first_alert_button = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
        first_alert_button.click(); //Clicking 1st alert button 
        driver.switchTo().alert().accept(); //Accepting first_alert_button
        //Locating 2nd alert button + click it
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
        driver.switchTo().alert().accept();//Accepting second_alert_button
        //Locating third alert button 
        WebElement third_alert_button = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
        third_alert_button.click();//Clicking third_alert_button
        Alert al= driver.switchTo().alert(); //Switch to alert
        al.sendKeys("");//Overwrite the existing text
        System.out.println("over write");
        al.sendKeys("Suriya");//Sending new value
        System.out.println("Sended"); 
        al.accept();
        //Locating fourth_alert_button + clicking
        WebElement fourth_alert_button = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/button"));
        fourth_alert_button.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.navigate().back(); //Back navigation
        //Locating main frame button
        WebElement frame_button = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[10]/a/img"));
        frame_button.click(); //Clicking main frame button
        driver.switchTo().frame(0);  //Switching to 1st frame
        driver.findElement(By.id("Click")).click(); //Locating a button inside a frame + click it
        driver.switchTo().parentFrame(); //Switching to parent frame
        driver.switchTo().frame(1); //Switching to 2nd frame
        driver.switchTo().frame(0);//Switching to nested frame
        Thread.sleep(5000); //waitimg for 5 seconds
        driver.findElement(By.xpath("//*[@id=\"Click1\"]")).click(); //Locating the button + click it
        driver.switchTo().parentFrame();//Switching to parent frame
        int fc = driver.findElements(By.tagName("iframe")).size(); //count of frame
        System.out.println("Frame count = "+fc); //Printing frame count
        driver.navigate().back(); //Back navigation
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a/img")).click();
        String p = driver.getWindowHandle(); //Getting parent window ID
        System.out.println("Parent window = "+p); //Printing parent window ID
        //Locating 1st window button
        WebElement b1 = driver.findElement(By.id("home"));
        b1.click(); //Clicking 1st window button
        //Locating 1st window button + click it
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
        Set<String> wids = driver.getWindowHandles();//Getting all opened window id's
        for(String w1 :wids) {
        	if(!w1.equals(p)) {
        		driver.switchTo().window(w1); //Switching to child window
        		driver.close(); //Closing the child window
        	}
        }
        driver.switchTo().window(p); //Switching to parent window
        WebElement lw = driver.findElement(By.xpath("//*[@id=\"color\"]")); //Locating last_window_button 
        lw.click(); // Clicking last_window_button
        Thread.sleep(2000); //Waiting for 2 seconds
        Set<String> ids = driver.getWindowHandles(); //Getting windows id after clicking last window button
        System.out.println(ids.size()); //Printing num of windows opened after clicking last window button
        for(String ii : ids) {
        	if(!ii.equals(p)) {
        		driver.switchTo().window(ii);
        		driver.close();
        	}
        	}
        driver.switchTo().window(p); //Switching to parent window
        driver.navigate().back(); //Back navigation
        //Locating main auto complete button + click it
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[17]/a/img")).click();    
        WebElement courseName = driver.findElement(By.id("tags")); // Locating text box
        courseName.click(); //Clicking the courseName textbox
        Actions cn = new Actions(driver); //Action cls
        cn.sendKeys(courseName, "se").perform();//passing the value "se" in course name text box
        Thread.sleep(5000);
        cn.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();//Pressing arrow key for one time + Click
        driver.navigate().back();//Back navigation
        //Locating main download files button + click it
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[18]/a/img")).click();
        driver.navigate().back();//Back navigation
        //Clicking 1st download button  + click it
        //driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div[2]/a[1]")).click();
        //driver.navigate().back();//Back navigation
        //Clicking 2nd download button + click it
        //driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div[2]/a[2]")).click();
        //driver.navigate().back();//Back navigation
        //Clicking 3rd download button + click it
        //driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div[2]/a[3]")).click();
        //driver.navigate().back();//Back navigation
        //Locating file upload button  + click it
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[19]/a/img")).click();
        WebElement u = driver.findElement(By.name("filename")); //Finding upload option
        u.sendKeys("C:\\Users\\Admin\\Downloads");//Sending file path
        System.out.println("File uploaded successfully"); //Ensuring file was uploaded
        driver.navigate().back();//Back navigation
        
        
        
        
        
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        

        
        
		
		
		
		
		
		
		
		
		
		
		

	}

	private static Actions Actions(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
