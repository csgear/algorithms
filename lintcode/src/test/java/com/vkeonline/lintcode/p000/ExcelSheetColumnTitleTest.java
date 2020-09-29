package com.vkeonline.lintcode.p000;

import com.vkeonline.lintcode.p1300.ExcelSheetColumnTitle;

class ExcelSheetColumnTitleTest {
    ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle() ;

    @org.junit.jupiter.api.Test
    void convertToTitle() {
        String s = excelSheetColumnTitle.convertToTitle(28) ;
        System.out.println(s);
    }
}