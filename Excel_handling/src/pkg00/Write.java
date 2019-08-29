package pkg00;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Write {
	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		File f = new File("C:\\Users\\RAHUL TAAK\\Desktop\\sh2.xls");
		WritableWorkbook wk = Workbook.createWorkbook(f);
		WritableSheet ws = wk.createSheet("sh1", 0);
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<6;j++)
			{
				Label l =new Label(j, i, "Rahul");
				ws.addCell(l);
			}
		}
		wk.write();
		wk.close();
	}

}
