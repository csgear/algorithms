package com.vkeonline.enthuware.exam816;


import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author csgear
 */
public class AnnotationFeatures {
    public void printAnnotations() {
    }


    @Author("bob")
    @Authors(@Author("alice"))
    void someMethod2(int index) {
    }

    @Authors(@Author("bob"))
    void someMethod3(int index) {
    }

    public static void main(String[] args) {
        List<Integer> al1 = new ArrayList<Integer>();
        al1.forEach((@DebugInfo("lambda")
                             Integer x) -> System.out.println(x));

        List<Integer> al2 = new ArrayList<Integer>();
        al2.forEach((@DebugInfo("lambda") var x) -> {
            System.out.println(x);
        });
    }

}


/**
 * 1) how to define an annotation, which is @interface
 * 1.1) primitive type, enum type can be used inside of annotation
 * 1.2) can provide default value
 * 2) how to use an annotation
 * 2.1) must use key = value, key name can not be omitted
 * 2.2) key={ "a", "b"} to provide values to an array
 * 3) annotation properties
 * 3.1) retention policy
 * 3.2) pre-defined annotations, @Deprecated, @Override , @SuppressWarning
 * 4) Repeatable annotations
 *
 * @author tstone10
 */


@interface Authors {
    Author[] value();
}

/**
 * @author tstone10
 */
@Repeatable(Authors.class)
@interface Author {
    int id() default 0;

    String value();
}

/**
 * @author tstone10
 */
@Retention(RetentionPolicy.RUNTIME)
@interface DebugInfo {
    String[] params() default {""};

    String date() default "";

    int depth() default 10;

    String value();
}