package pkg00;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Class1 {
	public static void main(String[] args) throws BiffException, IOException {
		
		File f=new File("C:\\Users\\RAHUL TAAK\\Desktop\\sh1.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet sh = wk.getSheet(0);
		int a = sh.getRows();
		int b= sh.getColumns();
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				Cell cl = sh.getCell(j,i);
				System.out.println(cl.getContents());
			}
		}

}
}
