

package task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskone { //class one
	private static final String String = null;
	Workbook wb;
	Sheet sh;
	private TimeUnit TimeUnits;
	
	
	//Constructor::
		 public taskone(String filepath, int sheetnumber) throws IOException {
			 FileInputStream f = new FileInputStream(filepath);
			 this.wb = new XSSFWorkbook(f); //wb variable has workbook
			 this.sh = wb.getSheetAt(sheetnumber); //sh var has the sheet
	} //end of constructor ::
		 
		 
	
	
	
	public void readdata() throws InterruptedException, IOException{ //method to read data
		ChromeDriver driver = new ChromeDriver();
		//to open the application ::
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //For loop to read multiple data ::
		int col_num = 0;
		int pc = 1;
		for(int i=1; i<=sh.getLastRowNum(); i++) {
			Row row = sh.getRow(i); //to get a row 
			String user_name = row.getCell(col_num).toString(); //this stores a data 
			//Finding username field ::
			WebElement	u = driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/div[1]/input"));
			//u has username field
		//Passing username:	
		u.sendKeys(user_name);
		Thread.sleep(3000);
		//u.clear();
		String Password = row.getCell(1).toString();//this stores the password
		//Finding Password  field :::
		WebElement password_field = driver.findElement(By.name("password"));
		//Passing password
		password_field.sendKeys(Password);
		//clikcing submit button ::
		driver.findElement(By.id("submit")).click();
		
		//if(u.getAttribute("value").equals("student") && password_field.getAttribute("value").equals("Password123")) {
			
		//Once login is successful we are getting title for next page ::
		//String expected_title = driver.getTitle();
		
			

			//clicking log out button ::
			//driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
			//System.out.println("Call the write method ");
			//writedata(i);   // i = current row number
			Cell statusCell = row.getCell(2);
	        if (statusCell == null) {
	            statusCell = row.createCell(2);
	        }

	        if (driver.getCurrentUrl().contains("logged-in-successfully")) {
	            statusCell.setCellValue("Pass");
	            driver.findElement(By.linkText("Log out")).click();
	        } else {
	            statusCell.setCellValue("Fail");
	        }
	    } 

	    
	    FileOutputStream fos = new FileOutputStream("./tasks/task_username.xlsx");
	    wb.write(fos);
	    fos.close();
	    wb.close();

	    driver.quit();
	}

} //end of class 


			
			
			
			

			
			
			
		 
			
			
		
			
		
				 
				 
				 
		


		 
		 
		 
	 
