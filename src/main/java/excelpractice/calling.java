package excelpractice;

import java.io.IOException;

public class calling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//String fp = "./emp/employee_details.xlsx";//file path
		String wb = "./datasheet/Book1.xlsx"; //file path
		exp o = new exp(wb, 0); //cla+passing values //sheet num = 0
		System.out.println(o.getdata(0, 0)); //to get one val from excel
		//System.out.println(o.row_length());
		System.out.println(o.col_length(0));
		System.out.println("i am new");
//		o.givingvalue("./datasheet/Book1.xlsx", 0, 0, 5, "Status" );
		
		
		
	}

}
