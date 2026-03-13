package excelpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;






public class exp {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//READING AND WRITING FILE PRACTICE ::
	Workbook wb;
	Sheet sh;
	
	//constructor ::
public exp(String wb_filepath, int sh_num) throws IOException{
		FileInputStream f = new FileInputStream(wb_filepath);
		XSSFWorkbook wb = new XSSFWorkbook(f); //wb var has this workbook
		//To find sheet 
		sh =wb.getSheetAt(sh_num);//sh var has a sheet
		
	}
	//Read data ::
	public String getdata(int row_num, int cell_num){
		Row row = sh.getRow(row_num);//This var contains row num 
		Cell cell_value = row.getCell(cell_num);
		return cell_value.toString();
		
		
	}
	public int row_length() {
		return sh.getLastRowNum()+1; //Tried to print number of rows
		
	}
	public int col_length(int row_number) {
		Row roo = sh.getRow(row_number);
		return roo.getLastCellNum(); 
	
} 
	//To write the data in excel::
	public void givingvalue(String X, int sheetnum, int row, int cell_value, String value) throws IOException { //method --- to give a valye in excel
	//sh is a sheet
		Row r = sh.getRow(row); //r var contains row
	if(r == null) { //first if
		r = sh.createRow(row); 
	}
	Cell c = r.getCell(cell_value); //c var contains a cell
	if(c == null) { //Second if
		c = r.createCell(cell_value); //Allocates a cell
	}
	c.setCellValue(value); //to write a value
	FileOutputStream fos = new FileOutputStream(X);
	wb.write(fos);
	fos.close();
	}
}
	
	
	
	
		

	


