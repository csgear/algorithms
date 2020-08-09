package com.vkeonline.enthuware.exam816;

import java.text.Format;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

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

    static void formatNumberWithJPNLocale() {
        double amount = 5000.05;
        Locale jp = new Locale("jp", "JP");
        NumberFormat formatter = NumberFormat.getInstance(jp);
        System.out.println(formatter.format(amount));
        Format formatter2 = NumberFormat.getCurrencyInstance(jp) ;
        System.out.println(formatter2.format(amount));
    }

    public static void main(String[] args) {
        dateFormatWithShortMonthName();
        StringBuilder sb = new StringBuilder("abcde");

        Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.Category.FORMAT, Locale.CANADA);

        formatNumberWithJPNLocale();
    }
}
