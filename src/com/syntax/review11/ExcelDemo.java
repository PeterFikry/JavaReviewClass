package com.syntax.review11;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelDemo {
    public static void main(String[] args) {

        String path = "Files/Book2Review.xlsx";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfworkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet1 = xssfworkbook.getSheet("Sheet1");
            Row row = sheet1.getRow(3);
            System.out.println(row.getCell(2));
        } catch (Exception e) {
            System.out.println("Please check the path of the file");

        }
    }
}
