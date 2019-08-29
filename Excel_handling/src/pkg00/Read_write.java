package pkg00;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Read_write {
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		File f = new File("C:\\Users\\RAHUL TAAK\\Desktop\\sh1.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet sh = wk.getSheet(0);
		int a=sh.getRows();
		int b=sh.getColumns();
		
		File f1 = new File("C:\\Users\\RAHUL TAAK\\Desktop\\sh2.xls");
		WritableWorkbook wk2 = Workbook.createWorkbook(f1);
		WritableSheet sh1 = wk2.createSheet("sh2", 1);
		
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				Cell cl=sh.getCell(j, i);
				String s = cl.getContents();
				Label l = new Label(j, i, s);
				sh1.addCell(l);
				
			}
		}
		
		wk2.write();
		wk2.close();
		
		
	}

}
