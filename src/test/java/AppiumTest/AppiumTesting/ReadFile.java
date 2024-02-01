package AppiumTest.AppiumTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "/Users/Ragini.Gautam/Downloads/Book1.xlsx";

        try {
            FileInputStream file = new FileInputStream(filePath);
            Workbook workbook = WorkbookFactory.create(file);

            // Assuming only one sheet in the workbook
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
  
            	for (Cell cell : row) {
            		System.out.print(cell.getStringCellValue() + "\t");
            		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("cell.getStringCellValue");

                }
            	
                System.out.println();
            }

            workbook.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

}
