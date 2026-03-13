package my_practice;

import java.io.FileInputStream;

public class exelconnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fl = "./datasheet/Book1.xlsx";

        // Correct way to load workbook
        FileInputStream fis = new FileInputStream(fl);
        XSSFWorkbook book = new XSSFWorkbook(fis)

	}

}
