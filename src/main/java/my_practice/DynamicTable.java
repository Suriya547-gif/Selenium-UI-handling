package my_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table"); //Open the app
		int row_count = driver.findElements(By.xpath("tr")).size(); //Getting the size of row_count 
        System.out.println("row_count = "+row_count); //Printing the size of row_count
		
		
		
		
		
		
		
		
		
		
	}

}
//WHAT IS DYNAMIC TABLES ?? ::
//In dynamic tables Data are coming from server ---> So data will be refreshing
//Here rows and columns too interchange
