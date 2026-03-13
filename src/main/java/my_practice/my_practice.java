package my_practice;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class my_practice {

	public static void main(String[] args, Object SECONDS) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.linkedin.com/");
		System.out.println(driver.getTitle());
		driver.quit(); */
		
	/*	driver.get("https://www.facebook.com/");
		///Printing the text using "xpath locator" ::
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).getText());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("Suriya@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Suriyajayan");
	
	//To get color of a button::
	String color = driver.findElement(By.name("login")).getCssValue("background-color");
	System.out.println("Color of login button in fb application = "+color); // Selenium will not give exact color name like red, blue
	
	//To get the text color:
	String text_color = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).getCssValue("color");
	System.out.println("Color of text/image = "+text_color); 
	
	
	//To get button size:
int	d = driver.findElement(By.name("login")).getSize().getHeight();//height 
System.out.println("Size of button in height in fb application = "+color);
	
int	g = driver.findElement(By.name("login")).getSize().getWidth();//width 
System.out.println("Size of button in width in fb application = "+g); */
	
	
	
	
		//driver.findElement(By.name("login")).click();
		//driver.navigate().back();  
/*	//To print the position of the button::
	int i = driver.findElement(By.name("login")).getLocation().getX(); //Horizontal position
	System.out.println(i);
	
	//To print the position of the button::
		int o = driver.findElement(By.name("login")).getLocation().getY(); //Horizontal position
		System.out.println(o);*/
		
		//Clicking the login button by using xpath:
	//	driver.findElement(By.xpath("//*[@id=\"u_0_5_QW\"]")).click();//not working
		
		// Entering the text mail id using name locator::
		//driver.findElement(By.name("email")).sendKeys("Suriyajayan@gmail.com");
		
		//Entering the password using class locator: //not working
		//driver.findElement(By.className("Inputtext_55r1_6luy_9npi")).sendKeys("Jayan");
		
		///Printing the text using "xpath locator" ::
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).getText());
		
		//Printing the text using "class locator" ::
		//System.out.println(driver.findElement(By.className("fb_logo_8ilh img")).getText());
		
		/*driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Edit.html");
	//System.out.println(driver.findElement(By.className("wp-page-heading")).getText());
	System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div")).getText());
	//System.out.println(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div")).getAttribute());
		
 WebElement a = driver.findElement(By.id("email"));
 a.sendKeys("Suriya@gmail.com"); */
		
		//To count num of buttons:
		/*	driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Button.html");
		List<WebElement> buttons = driver.findElements(By.tagName("<buttons"));
	System.out.println("Number of button"+buttons.size());
		//buttons.click(); /*
	

	
		
	//To count number of fields ::
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Edit.html");
		List <WebElement> box_count = driver.findElements(By.tagName("<input"));
		System.out.println("Number of text boxes :"+box_count.size()); 
		
		//TO PRACTICE CLEAR():
		/*	driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Edit.html");
	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input")).clear(); */
		
		//selecting multiple text boxes::
//		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Edit.html");
//		List <WebElement> Sel = driver.findElements(By.tagName("input")); 
//		
	//selecting multiple text boxes:: fb application :
//		driver.get("https://www.facebook.com/");
//		List <WebElement> Count = driver.findElements(By.tagName("input"));
//	System.out.println("Count of the input text boxes in fb app:"+Count.size());
	
	
		/*driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Edit.html");
		List <WebElement> box_count = driver.findElements(By.tagName("input"));
		System.out.println("Number of text boxes :"+box_count.size()); */
		
		//driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Button.html");
		
	//REVISION ::
	
		//To print text:
		/*driver.get("https://www.facebook.com/");
		String result = driver.findElement(By.className("_8eso")).getText();
		System.out.println(result); */
		
		//To find number of buttons:
/*	driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Button.html");
		//List <WebElement> count = driver.findElements(By.tagName("button"));
	//	System.out.println(count.size()); 
		try {
			Thread.sleep(1000); //while using thread it is good to mention try catch to avoid errors
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//First button : Home button
        driver.findElement(By.id("home")).click(); //click the home button
       String title = driver.findElement(By.className("wp-page-heading")).getText();
       System.out.println("Title after clicking the home button: "+title);//To print the title
       
        // To print the number of buttons in selenium and locator page(after clicking the home button)
        int  inner_buttons_count = driver.findElements(By.tagName("img")).size();
        System.out.println(inner_buttons_count);
        
        //To click the edit button:
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();
        
        //To print the title of the page:
        System.out.println(driver.findElement(By.className("wp-page-heading")).getText());
        
        //to enter values in text boxes::
        driver.findElement(By.id("email")).sendKeys("Suriya@gmail.com"); //mail text box
        //append text box:
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("SuriyaJayan");
        //get default text: i.e) to get a value which was already entered in a text box
      System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
      //To clear a text:
      driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
      //to check a field is enabled or not: Eg: Append tect box:
    WebElement f = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
    if(f.isEnabled()) {
    	System.out.println("Append text box is enabled");
    }
    else {
    	System.out.println("Append text box is disabled");
    }
   WebElement q = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
  if(q.isEnabled()) {
	  System.out.println("Edit field is enabled");
  }
  else {
  	System.out.println("Edit field is disabled");
  }
  driver.navigate().back();
  //Second button : BUTTON:
  String w = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/h5")).getText();
  System.out.println("Name of the second button is "+w);
  //clicking the button:
  driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();
  //to print heading of the page:
  String e = driver.findElement(By.className("wp-heading")).getText();
  System.out.println("Heading of the page after clicking second button = "+e);
  //to print subheading of the 1st button :
  String r = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/label")).getText();
  System.out.println("subheading of the 1st button is : "+r);
  //To print the buttons name :
  String t = driver.findElement(By.id("home")).getText();
  System.out.println("Name of the button is : "+t);
  //To click the button:
  driver.findElement(By.id("home")).click();
  //to print subheading of the 2nd button :
 // String y = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label")).getText();
//	System.out.println(y);	
  
  //To see the position of the button:
  //int u = driver.findElement(By.xpath("//*[@id=\"position\"]")).getLocation().getX();
  //System.out.println(u); 
  
  //To print subheading of the button :
  //String s = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/label")).getText();
  //System.out.println("subheading of the button = "+s);
  
  //To get color:
 //String color =  driver.findElement(By.xpath("//*[@id=\"color\"]")).getCssValue("background-color");
 //System.out.println("Color of the button is = "+color);
  
//To get the text color:
 String tex = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/label")).getCssValue(color);
 System.out.println("text_color is = "+ tex); */

// Date :: NOV 25:

//driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Edit.html"); //to open the application

//TASK :
//To get number of text box headings:
	/*List<WebElement> h = driver.findElements(By.tagName("label"));
	System.out.println(h.size());
		
//TO PRINT TEXT BOX HEADINGS : //TASK:::
	String e1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/label")).getText();
String e2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label")).getText();
	String e3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/label")).getText();
	String e4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/label")).getText();
	String e5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/label")).getText();
String ar[] = {e1, e2, e3, e4, e5};
System.out.println("Heading of the texts are:");
for(int i = 0; i<ar.length; i++) {
	System.out.println(ar[i]);
	
} */
	/*for(int I=1; I==5; I++) {
		String j = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[I]/div/div/label")).getText();
		System.out.println(j);
	} */
		

//Working on buttons application : //hyperlink button :
/*driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Button.html");
driver.findElement(By.id("home")).click();
//To get title:
String k = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/h5")).getText();
System.out.println("Title of the button is : "+k);
String l = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[3]/a/img")).getCssValue("background-color");
System.out.println("Color of the hyperlink button is :"+l);
driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[3]/a/img")).click();
String z = driver.findElement(By.xpath("//*[@id=\"content\"]")).getText();
System.out.println("Heading is : "+z);
 int  x = driver.findElements(By.tagName("a")).size();
 System.out.println("Num of hyperlinks available in the page: "+x);
 String c = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a")).getText();
 System.out.println("Name of the first hyperlink :"+c);
String v = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a")).getCssValue("color");
System.out.println("Color of the first hyperlink :"+v);

Thread.sleep(1000); //Always use Caps T 
driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a")).click();
Thread.sleep(2000);
driver.navigate().back();
String b = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a")).getText();
System.out.println("Name of the second hyperlink :"+b);
String n = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a")).getCssValue("color");
System.out.println("color of the second hyperlink : "+n);
driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a")).click();//this navigates to button pages
//driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a")).click(); */
//System.out.println(m);
/*String color =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/a")).getCssValue("color");
System.out.println("Color of the third hyperlink : "+color);
String color_five = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/a")).getCssValue("color");
System.out.println("Color of the fourth hyperlink : "+color_five); */

//Automating images:
/*String it = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a/h5")).getText();
System.out.println("heading of the image is : "+it);
driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a/h5")).click(); */
 
//ALERT ::
		/*driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
driver.findElement(By.id("my-alert")).click();
//Alert means like a pop up message
//We cant inspect a pop up
//but we can switch to pop up using switchTo() method 

driver.switchTo().alert().accept(); //accept() is used to ok the pop up message.
driver.findElement(By.id("my-confirm")).click();
Alert pop = driver.switchTo().alert();//this variable will store alert 
                                       //thus we have to mention the data type as alert
Thread.sleep(6000);
pop.dismiss();//This will choose the cancel option from the pop up.
driver.findElement(By.id("my-prompt")).click();
 Alert A =driver.switchTo().alert();
 A.sendKeys("Suriya");
 Thread.sleep(3000);
 A.accept();
 driver.findElement(By.xpath("/html/body/main/div/div[4]/div[4]/button")).click();
 Alert A2 = driver.switchTo().alert();
 Thread.sleep(5000);
 //A2.accept(); //To select save changes in the pop up
 A2.dismiss();//To select close in the pop up */
 
 //NOTE :: We cannot print text/color/name of the text box which are present inside the alter and we cant do inspect too coz HTML is not used for alert

 /*driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
 int frame_count = driver.findElements(By.tagName("iframe")).size();
 System.out.println("Total frames available in the page is "+frame_count);
 //WebElement frame_one = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/div/div/iframe[1]"));
 driver.switchTo().frame(0);
 WebElement sb = driver.findElement(By.xpath("//*[@id=\"td-header-search-button-mob\"]/i"));
 Thread.sleep(4000);
 sb.click();
 //sb.sendKeys("IT jobs");
 WebElement sc = driver.findElement(By.id("//*[@id=\"td-header-search-mob\"]"));
 driver.switchTo().defaultContent(); //this defaultContent() method is used to
                                     //get out of the frame and go back to the 
                                     //original page.
                                      
 sc.click();
 sc.sendKeys("IT jobs"); */
		
		 //PRACTICING FRAMES ::
//		driver.get("https://demoqa.com/frames");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//this starts the automation process 
//		                                                                //once the website loaded after 10 sec
//		//To print no.of available frames:
//		int frame_count = driver.findElements(By.tagName("iframe")).size();
//		System.out.println("Total frames available in the page is "+frame_count);
//		WebElement frame_1 = driver.findElement(By.id("frame1"));//We stored the frame in an variable that is finding frame 1
//		driver.switchTo().frame("frame1"); //while switching to frame it is better
//		                                   //to use its id or name as an argument here dont use xpath as an argument it will throw error in this scenario alone i.e) frame("id/name/xpath")
//		String Heading_frame_1= driver.findElement(By.xpath("/html/body/h1")).getText();
//		System.out.println("Heading for frame one : "+Heading_frame_1); */
		
		//NOTE ::
		//How to solve no such element??
				// Start the automation process after 10 sec 
				 //i.e) let the website load 1st 
                 //after 10 seconds
                 //start automation
		
	/*	driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/home.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//clicking the frame button :
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[10]/a/img")).click();
	//To print heading of the button :	
/*	String text = driver.findElement(By.xpath("//*[@id=\"content\"]")).getText();
    System.out.println("Heading od the page is :"+text);
    //To print num of frames available in the page:
  List <WebElement> frames_selection =  driver.findElements(By.tagName("iframe"));
  System.out.println("Num of frames : "+frames_selection.size());
  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  //waiting for 3 seconds before finding 1st frame:
  Thread.sleep(3000);
  //To find 1st frame ::
 //WebElement frame_one = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/iframe"));
 //Switch to frame 1:
  driver.switchTo().frame(0);
  //To print text inside frame 1:
 String Text_in_frame = driver.findElement(By.id("Click")).getText();
 System.out.println("Text which is present inside the frame 1 is  :"+Text_in_frame);
 //To click the button inside frame 1:
 driver.findElement(By.id("Click")).click();
 
 
		
		
	//	To find second frame :
/*  WebElement frame_two = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/iframe"));//this is not working by using xpath/id/name
  //Switching to second frame :
  driver.switchTo().frame(1);
  //Getting Text inside the second frame :
  /*String Text_frame_2 = driver.findElement(By.xpath("/html/body/text()")).getText();
  System.out.println("Text which is present inside the frame 2 is  :"+Text_frame_2); 
  */
  /*Thread.sleep(2000);
  
  //Clicking button inside frame 2:
  driver.findElement(By.xpath("/html/body/button")).click(); //throws error tried with id/name/xpath 
  */
  

  //Working with second frame:
		//Finding second frame :
	/*	driver.findElement(By.id("frame2"));
		
		//Switching to second frame:
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		//Clicking button inside the frame 1:
		driver.findElement(By.xpath("/html/body/button")).click(); */
		
		//Frame practice :
		/*	driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		//To maximize the application :
	driver.manage().window().maximize();
		 int frame_count = driver.findElements(By.tagName("iframe")).size();
		 System.out.println("Total frames available in the page is "+frame_count);
		 driver.switchTo().frame(0);
		//To print heading from the frame 1:
		String Heading_frame_1 = driver.findElement(By.xpath("//*[@id=\"td-outer-wrap\"]/div[2]/div/h1")).getText();
		System.out.println("Heading for frame_1 is : "+Heading_frame_1);
		//Clicking the search box inside frame 1:
		driver.findElement(By.xpath("//*[@id=\"td-header-search\"]"))//.click();
		//driver.findElement(By.xpath("//*[@id=\"td-outer-wrap\"]/div[3]/div/div[1]/div[1]/a")).click();
		  */
		
		/*	driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Button.html");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.id("home")).click(); */
	//To print current url :
/*	String Current_url = driver.getCurrentUrl();
	System.out.println("Current url : "+Current_url); 
	driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/img")).click();
	int link_count = driver.findElements(By.tagName("a")).size();
	System.out.println("Total links available in the page is "+link_count);
	//To print a url: which is already available in the application :
	/*String link = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a")).getAttribute("href");
	System.out.println("Link is : "+link); */
	//To print second url:
/*	String link_2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a")).getAttribute("href");
	System.out.println("Second Link is : "+link_2); */
		
		//TO GET A URL WHICH WAS STORED IN A VARIABLE::
		/*	String link = "http://myntra.com/";
	driver.get(link); */
		
		//Automating images::
	/*driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a/img")).click();
String heading = driver.findElement(By.className("wp-page-heading")).getText();
System.out.println("Heading of the page is : "+heading); 
//To print count of the image :
int image_count = driver.findElements(By.tagName("img")).size();
System.out.println("Number of image present in the page :"+image_count);
driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img")).click();		
System.out.println("Current url of the page :"+driver.getCurrentUrl()); */

//FILE HANDLING IN JAVA :
    //File handling means doing some operations like creating files, reading files, 
//deleting files, writing files and checking file existence
     //File handling is achieved through classes and interfaces
//Those classes and interfaces are contained by two packages 
//Those 2 packages are java.io and java.nio.file

//java.io.File :: A CLASS 
  //This is a file class
  //This class represents a file path
  //This class provides methods for creating file, deleting file,
  //-renaming file, check file existence, getting path information

//TO TAKE SCREENSHOT ::
/*driver.get("https://www.netflix.com/browse");//open the application
File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
File destination = new File("./screenshot/evidence.png");
destination.getParentFile().mkdirs();
try {
	FileHandler.copy(scr, destination);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace(); //this method is used to print what kind of error + line num
} */
		
		//TRY CATCH REVISION ::
	/*	System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		
		try {
			int a = sc.nextInt(); //In try block we should use the code which might cause error
			System.out.println("a");
		}
		catch(Exception e) {
			System.out.println("Pls enter an integer");
		}
		finally {
			System.out.println("Program completed");
		}
		 */
		
	/*	driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		 int frame_count = driver.findElements(By.tagName("iframe")).size();
		 System.out.println("Total frames available in the page is "+frame_count);
		 driver.switchTo().frame(0);
		 try {
		 driver.findElement(By.id("td-header-search")).click();
		 }
		 catch(Exception e){
		   e.printStackTrace(); 
		 } */
		 
		 //NOTE :: e.printStackTrace() METHOD::
		 //By default selenium will show the error name and line number too
		 // Working of  e.printStackTrace();- to show the error name and line number too
		 //if we use e.printStackTrace() in catch {} block means .... we can see the error
		 //and program will not stop running
		
	//WINDOWS HANDLING ::
		//Windows handling means handling multiple windows or tabs that may
//       opens while automation
		//Selenium has a unique identifier called "Window handle" for each window or tab
		//i.e) selenium has an identifier "window handle" that indicated opened window 1 , 2, 3, etcc
// This window handler helps to get know about the window difference and we can have control between them
	
	//WINDOW HANDLING SCRIPT ::
	/*	driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		System.out.println(driver.getWindowHandle()); //This will print the ID of the current window */
		
	/*	driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Button.html");
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
try {
	driver.getWindowHandles();
}
catch(Exception e){
	e.printStackTrace();
} */
		
		driver.get("https://demoqa.com/browser-windows");
		System.out.println(driver.getWindowHandle());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("windowButton")).click();
 
 
 
    
		
		
		
		
		
 






	}
}
	  
  
      
        
        
		
		
		
 
 
	
	
		
		
		

	


