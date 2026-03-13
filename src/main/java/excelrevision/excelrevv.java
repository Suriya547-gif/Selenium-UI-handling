  //STUDY THIS PROGRAM TO READ A FILE ::

package excelrevision;


import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelrevv {
	Workbook wb; 
	XSSFSheet sh;

	public excelrevv(String filepath, int sheet_num) throws IOException{ //Constructor ::
		FileInputStream f = new FileInputStream(filepath);
		this. wb = new XSSFWorkbook(f); //wb var has a workbook 
		//Sheet ::
		this.sh = (XSSFSheet) wb.getSheetAt(sheet_num); // sh variable contains sheet + Access sheet using sh var
		
		
	}
	//To read a data from excel ::
	public void readdata(int row_num, int cell_num) {
		//to get row ::
		XSSFRow row = sh.getRow(row_num); //this has a row
		XSSFCell cell = row.getCell(cell_num);
		//return cell.toString();
		System.out.println(cell.toString());
		
	}
	//To get last row number ::
	public int Lastrownum(){
		//return sh.getLastRowNum()+1;
	//System.out.println("Last row number = "+sh.getLastRowNum()+1);//to get exact last row number use +1 coz excel 
	int l = sh.getLastRowNum();   //consider the starting row num as 0.
	return l;
		
		
	}
	//To get last cell num::
public void lastCellNumber(int row_number){ // a method ::
	Row r = sh.getRow(row_number);
	System.out.println("Last cell number ="+r.getLastCellNum());//to get last cell value don't need to add +1.
	                                                            //it will show the actual result 
	//return r.getLastCellNum();
}

//To write data in excel ::
//writedata is user defined method
public void writedata(String filepath,  int row_number, int cell_number, String data) throws IOException {
	Row rr = sh.getRow(row_number); // rr var has row
	if(rr == null) {
		rr = sh.createRow(row_number);//to allocate a row --> to write a data
	}
	Cell cell_write = rr.getCell(cell_number);
	if(cell_write == null) {
		cell_write = rr.createCell(cell_number); //to allocate a cell --> to write a data
	}
	cell_write.setCellValue(data); //To write a data in excel

	FileOutputStream fos = new FileOutputStream(filepath);
	wb.write(fos);
	fos.close();
	
	
}
	
	}

//Summary ::
  //In this concept we are using 6 methods ::
       
        // 1.Workbook_var.getSheetAt(num); //to get a sheet
        // 2.Sheet_var.getRow();    //To get a row
        // 3.row_var.getCell(); //To get cell value
        // 4.sh_var.getLastRowNum();   //To get last row num   
        // 5.row_var.getLastCellNum(); //to get last cell num 
//getPhysicalNumberOfRows(); //to get actual row count


//creating class
//To read a file we are using workbook and sheet
//so mention that under a class as ::
     // Workbook wb;    //here Workbook is a data type and wb is a variable
     //Sheet sh;    //here Sheet is a data type and sh is a variable

//create a constructor
//Pass file path and sheet num 
//File path = Workbook (wb)
//sheet num = sheet (sh)
//  Use FileInputStream class + pass the file path, dont pass the file path directly ---- this says we will read a data/write a data in a file
//and XSSFWorkbook class---- this says we will read a data/write a data in a excelfile , 
//                           i.e) we will say we will work in what kind of file
//then get sheet num 
//close the file

//Write a method to read a data + practice those 5 methods 
// TO get a last cell value ::
    //1) Get a row. Eg :: row 1
    //2) And then get a last cell value
//NOTE ::
//This reading and writing file should use with constructor. and this should not be used with main method 

//For reading and writing excel files Apache poi library is needed. Apache poi is mandatory










