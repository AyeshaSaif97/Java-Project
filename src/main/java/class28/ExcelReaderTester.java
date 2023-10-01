package class28;

import main.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {
        List<Map<String, String>> data = ExcelReader.readExcelData("C:\\Users\\ayesh\\IdeaProjects\\SDETJava\\Files\\Employees.xlsx", "EmpData");
        System.out.println(data.get(0));

    }
}
