package pesoArchivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
public class ModificarExcel {

		
    public static void modificarExcel(int row, int col) throws IOException {
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\abana62\\Desktop\\informe.xls");

            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            Cell cell = null;

          //Retrieve the row and check for null
            HSSFRow sheetrow = sheet.getRow(row);
            if(sheetrow == null){
                sheetrow = sheet.createRow(row);
            }
            //Update the value of cell
            cell = sheetrow.getCell(col);
            if(cell == null){
                cell = sheetrow.createCell(col);
            }
            double sum=Sumar.suma(Main.RUTA);
            cell.setCellValue(sum);

            file.close();

            FileOutputStream outFile =new FileOutputStream(new File("C:\\Users\\abana62\\Desktop\\informe.xls"));
            workbook.write(outFile);
            outFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}