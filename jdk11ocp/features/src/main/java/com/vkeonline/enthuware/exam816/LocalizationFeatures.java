package com.vkeonline.enthuware.exam816;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalizationFeatures {
    // Note:
    // 1. How to create a locale object
    // 2. How to pass locale the DateFormatter or NumberFormatter classes
    // 3. The pattern string for formatters, namely, m,M,d,D,e,y,s,S,h,H and z
    // 4. Resource bundles and getObject(String key) apis
    // 5.
    public void localDate() {

    }

    static void dateFormatWithShortMonthName() {
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/YY");
        System.out.println(sdf.format(LocalDateTime.now()));
    }

    static void dateTimeFormatWithInsertedText() {
        LocalDate d = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("eeee d'st day of' MMMM yyyy");
        String s = dtf.format(d);
        System.out.println(s);

        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(df.format(d));
    }
    public static void main(String[] args) {
        dateFormatWithShortMonthName() ;
        StringBuilder sb = new StringBuilder("abcde");

    }
}
