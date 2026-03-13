package exelpages;

import java.io.IOException;

public class demopro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String f = "./datasheet/Book1.xlsx";
		exelunit e= new exelunit(f,0);//We are accessing code from the class exelunit
		
		System.out.println(e.getdata(0, 0));
		
		for (int i=0; i<=e.len_row(); i++) //To print over all data in the excel file
		{
			for(int j=0; j<e.len_cell(i); j++)
			{
				System.out.print(e.getdata(i, j));
			}
			
			System.out.println();
		}

	}

}
