package exelpages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exelunit {//this is a class
	
	Workbook w; //workbook is a data type and w is a variable //excel file path
	Sheet s; //Sheet is a data type and s is a variable //Sheet number
	
	public exelunit(String filepath,int snum) throws IOException //Constructor
	{
	
		 FileInputStream fis = new FileInputStream(filepath);//fileinputstream is a built in class
        w = new XSSFWorkbook(fis);
        
        s=w.getSheetAt(snum); //Mention the sheetnum, which sheet number we are going to work
        fis.close(); //Here we did not use w.close () because to close/open the file we have mention the 1st variable (which was mentioned near fileinputstream).
	}
	//To read a data from the file ::
	public String getdata(int r,int c)//Method 1::
	{
	    Row row=s.getRow(r); //To get row number //Row is a datatype
	    Cell cell=row.getCell(c);//To get column num //Cell is a datatype
	    
	    return cell.toString();//to string will convert all the values in to string.
	}
	
	public  int len_row()//Method 2
	{
		return s.getLastRowNum(); //To get the last row number which the row has data
	}
	
	public  int len_cell(int r)
	
	{
		 Row row=s.getRow(r);
		
		return row.getLastCellNum();//To get the last column number which the data was present
	}
	
	
	

}
