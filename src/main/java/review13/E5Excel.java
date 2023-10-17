package review13;

import main.utils.ExcelReader;

import java.util.List;
import java.util.Map;

public class E5Excel {
    public static void main(String[] args) {
        List<Map<String,String>> data= ExcelReader.readExcelData("C:\\Users\\ayesh\\IdeaProjects\\SDETJava\\Files\\Employees.xlsx","EmpData");
        System.out.println(data);
    }
}
