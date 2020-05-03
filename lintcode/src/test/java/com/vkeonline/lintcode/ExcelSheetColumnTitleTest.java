package com.vkeonline.lintcode;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnTitleTest {
    ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle() ;

    @org.junit.jupiter.api.Test
    void convertToTitle() {
        String s = excelSheetColumnTitle.convertToTitle(28) ;
        System.out.println(s);
    }
}