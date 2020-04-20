package com.vkeonline.studyguide;

import org.w3c.dom.Text;

import java.io.Console;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.SortedMap;

public class FoundationPractices {
    public void readPasswordFromConsole() throws Exception {
        Console c = System.console() ;
        char[] cha = c.readPassword() ;

    }

    public void getLocaleCountry() {
        System.out.println(Locale.getDefault().getCountry()) ;
    }

    public void changeFileNames(String[] args) throws Exception {
        File dir = new File(args[0]) ;
        if(! dir.isDirectory()) {
            System.err.println(args[0] + " is not a directory.");
        }

        File[] files = dir.listFiles() ;

        for(File oldFile: files) {
            if(!oldFile.isDirectory()) {
                String oldFileName = oldFile.getName() ;
                File newFile = new File(args[0] + File.separator + oldFileName + ".checked") ;
                boolean b = oldFile.renameTo(newFile) ;
                if(b) {
                    System.out.println("Changed " + oldFileName + " " + newFile.getName()) ;
                }
                else {
                    System.err.println("Not changed "+ oldFileName);
                }
            }
        }
    }

    // what is a static class?
    // every instance variable is ?
    static class A {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM", Locale.FRANCE);
        SimpleDateFormat sdf1 = new SimpleDateFormat("MM", Locale.FRANCE);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM") ;
        LocalDate ld = LocalDate.now() ;

        void Hello() {
            System.out.println(sdf.format(ld));
            System.out.println(sdf1.format(ld));
        }

    }
    static void checkAnonymous() {
        Thread t = new Thread(new Runnable()
        {
            public void run()
            {
                System.out.println("Child Thread");
            }
        });
    }

    // static class can be extended final class cannot
    static class TestA {
        class B {}
    }

    private class TestB extends TestA {
        Character c = 2 ;
    }
}
