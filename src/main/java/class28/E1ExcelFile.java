package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {
        //location of the file
        String path = "C:\\Users\\ayesh\\IdeaProjects\\SDETJava\\Files\\Employees.xlsx";
        //class that brings the data in the form of bytes into the memory
        FileInputStream fis = new FileInputStream(path);
        //that special class which knows how to handle excel files
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        //accessing the sheet from the xlsx file
        Sheet sheet = workbook.getSheet("Sheet1");

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) { //gives us the physical number of cells which contains data
                System.out.print(row.getCell(j) + " ");

            }
            System.out.println();
        }


    }
}

