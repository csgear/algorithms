package com.vkeonline.enthuware;

import org.junit.jupiter.api.Test;

import java.text.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationFeatureTest {

    @Test
    void localDate() {
        LocalDate d = LocalDate.now() ;
        // DateFormat is an abstract class
        // DateFormat df = new DateFormat(DateFormat.LONG) ;
        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG) ;
        System.out.println(df.format(d)) ;
        SimpleDateFormat sdf1 = new SimpleDateFormat("zzzz mm/yyyy", Locale.CANADA) ;
        System.out.println(sdf1.format(new Date().getTime()));
        SimpleDateFormat sdf2 = new SimpleDateFormat("XXX mm/yyyy", Locale.CANADA) ;
        System.out.println(sdf2.format(new Date().getTime()));
    }

    @Test
    void datetimeFormatter() {
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/yyyyy") ;
        System.out.println(sdf.format(LocalDate.now()));
    }

    @Test
    void getJapanCurrency() {
        double amount = 53000.25 ;
        Locale jp = new Locale("jp", "JP") ;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(jp) ;
        System.out.println(formatter.format(amount));
        formatter = DecimalFormat.getCurrencyInstance(jp) ;
        System.out.println(formatter.format(amount));
    }
    @Test
    void numberFormat() {
        double amount = 123456.789 ;
        Locale fr = new Locale("fr", "FR") ;
        NumberFormat formatter = NumberFormat.getInstance(fr) ;
        String s = formatter.format(amount) ;
        formatter = NumberFormat.getInstance() ;

        try {
            Number amount2 = formatter.parse(s);
            System.out.println(amount + " " + amount2) ;
        } catch (NumberFormatException | ParseException e) {
            System.err.println(e.getMessage());
        }

    }
}