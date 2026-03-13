package my_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class imagess {
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
    driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");
    //TAKING SCREENSHOT ::
    File firstSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //This will take a screenshot and store it in a variable
     File dest = new File("./snapss/img1.png"); //This will automatically create a folder under maven dependencies + we have go give the path
                                                //Path name : Syntax : ./File_name/img_name.extension
                                                //Here If I mention dot means file will save in current project
     //From the above 2 scripts ... We are taking screenshot in one file
     //And saving screenshot in another file which we can view this later
     
     
     //File dests = new File("./demo/img1.png");
   dest.getParentFile().mkdirs();   // <-- IMPORTANT
    FileHandler.copy(firstSrc, dest); // <-- Correct method
   // FileHandler.copy(firstSrc, dests);
		
	}

}
