package class28;

import main.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) throws IOException {
        //Create an excel file store some data inside it and read that data using the methods we have just created
        List<Map<String,String>> data= ExcelReader.readExcelData("C:\\Users\\ayesh\\IdeaProjects\\SDETJava\\Files\\Sales.xlsx");
        System.out.println(data+" ");



    }
}
