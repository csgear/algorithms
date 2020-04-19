package com.vkeonline.enthuware;

public class PrimitiveDataType {
    /**
     * 1) var can not be used for instance variables,
     * 2) var declarations are allowed only for local variables
     * (i.e. variables defined inside method body) and
     * in for loops (for example, for(var i = 0; i<10; i++){ } ).
     */
    public void declareInt() {
        var x = 10 ;
    }

    /**
     * varargs?
     * @param args
     */
    public void myMethod(String... args) {
        var a = args ;
        var b = args[0] ;

        if(a instanceof String[])
            System.out.println("a is a string array") ;
    }

    public void validFloat() {
        // float f0 = 1.0 ;     // double
        // float f1 = 43e1 ;    // double
        float f2 = 0x0123 ;


    }
}
