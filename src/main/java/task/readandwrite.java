//To read and write the file ::

package task;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readandwrite {
	Workbook wb;
	Sheet sh;
	//constructor ::
	public readandwrite(String filepath, int sheetnumber) throws IOException{
		FileInputStream f = new FileInputStream(filepath);
		this. wb = new XSSFWorkbook (f); //this wb variable has a workbook
		this.sh =  (Sheet) wb.getSheetAt(sheetnumber);//Type casting happened
		                                              //this sh var contains sheet
		
	}
		public void readdata(int row_number, int Cell_number){
			Row r =  sh.getRow(row_number);
			Cell c =r. getCell(Cell_number);
			System.out.println(c);
			
		}
		
		public void readalldata(int roww_num) {
			Row r1 =sh.getRow(roww_num);//r1 has a row
			for(int row = 0; row<sh.getLastRowNum(); row++) {//row
				for(int c=0; c<r1.getLastCellNum(); c++) { //cell
					Row rr = sh.getRow(row);
					Cell ans = rr.getCell(c);
					//System.out.println(ans);
					driver.get("https://practicetestautomation.com/practice-test-login/");
			
		}
		
		
			
		}
		}
}
		
	
	
	
	
		
	


