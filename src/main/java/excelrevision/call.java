package excelrevision;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import my_practice.Revision;
import task.readandwrite;
import task.taskone;

public class call {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	/*	excelrevv o = new excelrevv("./trial/Username.xlsx", 0);
		o.readdata(0, 1); //to read a data from excel
		o.Lastrownum(); //to print the last row number 
		o.lastCellNumber(0); // To print last cell num 
		//Using for loop :: -- //to print all the data in the excel 
		//for(int i=0; i<Lastrownum()+1; i++) { //Row 
			//for(int j=0; j<lastCellNumber; j++) { //Column
				//System.out.println(readdata(i, o));
		//	}
	//	}
		
		//Write a data :: in the user name excel
		//o.writedata("./user/Username.xlsx", 0, 3, "Status"); //to write only one data::
		//to get last row number for username excel ::
		int a = 2;//3rd column
		String fp = "./trial/Username.xlsx";
		for(int i=0; i < o.Lastrownum(); i++) { //i means row
			o.writedata(fp, i, a, "Pass");
		} */
		
		
		//TASK ::
		//taskone o = new taskone("./tasks/task_username.xlsx", 0);
		//o.readdata();
		
		//Reading file revision ::
		Revision o = new Revision(0);
		o.read(0, 0);
			
		
		
		

	}

}
