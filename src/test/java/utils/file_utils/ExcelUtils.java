package utils.file_utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("/Users/isa/Desktop/Student.xls");
        Workbook workbook = new HSSFWorkbook(file);
//        Sheet sheet = workbook.getSheet("Sheet1");
        Sheet sheet = workbook.getSheet("Cars");
        Row row = sheet.getRow(2);
        Cell cell = row.getCell(1); // Champions

        int rowCount = sheet.getPhysicalNumberOfRows();

//        for (int i = 0; i < rowCount; i++) {
//            System.out.println(sheet.getRow(i).getCell(1).toString()); // cell means which column u would like to access
        // printing all numbers inside cell1

//        for (int i = 1; i < rowCount; i++) {
//            String name = sheet.getRow(i).getCell(0).toString();
//            String group = sheet.getRow(i).getCell(1).toString();
//
//            double groupNum = Double.parseDouble(group);
//            if (groupNum % 5 == 0)
//                System.out.println(name); // Gigi , Frank, Yulduz
//        }

        for (int i = 1; i < rowCount; i++) {
            String model = sheet.getRow(i).getCell(0).toString();
            String color = sheet.getRow(i).getCell(2).toString();
            String year = sheet.getRow(i).getCell(1).toString();
            double numYear = Double.parseDouble(year);
            if (numYear > 2018 && color.equalsIgnoreCase("Black")) {
                System.out.println(model + " | " + year.substring(0, year.length() - 2) + " | " + color); // black cars
            }
        }
    }
}