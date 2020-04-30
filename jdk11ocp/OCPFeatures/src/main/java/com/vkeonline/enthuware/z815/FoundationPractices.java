package com.vkeonline.enthuware.z815;

import java.io.Console;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.*;


public class FoundationPractices {

    protected final String name = "Hello" ;

    /**
     * 1) Assertions can be enabled or disabled for specific classes and/or packages.
     * To specify a class, use the class name. To specify a package, use the package name
     * followed by "..." (three dots also known as ellipses):
     * java -ea:<class> myPackage.myProgram java -da:<package>... myPackage.myProgram
     * 2) assertion can be turned on in dev mode and turn off in production mode
     * 3) assertion shall not use to validate parameters
     * 4) assertion shall not be checked and recovered
     */
    public void doYouKnowAssertion() {

    }


    /**
     * meta-annotation @Retention, @Documented, @Target, @Inherited, and @Repeatable
     *
     * RUNTIME annotation: @SafeVarargs, @FunctionalInterface @Deprecated
     */
    public void doYouKnowAnnotation() {

    }
    /**
     * The modifier static pertains only to member classes,
     * not to top level or local or anonymous classes.
     * That is, only classes declared as members of top-level classes can be declared static.
     * Package member classes, local classes (i.e. classes declared in methods)
     * and anonymous classes cannot be declared static.
     */
    // it seems Ok, for a inner class extends encapsulating class
    private class InnerClass extends FoundationPractices {

    }

    // use inner class,
    public void useInnerClass() {
        InnerClass innerClass = new FoundationPractices().new InnerClass() ;
        System.out.println( innerClass.name );
    }

    /**
     * concurrency example,
     * Submit a callable to ExecutorService, the submit returns a Future object
     * check if results isDone, then continue, wait otherwise.
     * @throws InterruptedException
     * @throws ExecutionException
     */
    public void checkCallable() throws InterruptedException, ExecutionException {
        Future<Long> result  = null;
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Callable<Long> worker = new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                Thread.sleep(1000);
                return 10_0L  ;
            }
        };
        //This call returns immediately.
        result = executor.submit(worker);

        while(!result.isDone()){
            try {
                //Do something else and check later
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        //Since result.isDone() is true, the result is available now
        System.out.println("Result is "+result.get());
    }

    /**
     * Using Console class the readPassword from console,
     * Console is obtained when the JVM is started from an interactive command line
     * without redirecting the standard input and output streams.
     * @throws Exception
     */
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
