package com.vkeonline.enthuware.exam816;

import java.lang.annotation.*;
import java.util.HashMap;
import java.util.Map;

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
 */
public class AnnotationFeatures {
    public void printAnnotations() {
        Authors authors = Book.class.getAnnotation(Authors.class);
        for(Author author: authors.value()){
            System.out.println(author.value());
        }
        Author author = Book.class.getAnnotation(Author.class) ;
    }

    /**
     * Annotation keys
     */
    @Table( length = 1, primaryKey = "id", columns = {/*"col1", "col2"*/})
    public void checkTable() {

    }

    /**
     * type annotation can be used in simple type, nested type,
     * constructor, type casting, generic type, throw exception,
     * instanceOf, and methods
     */
    public void checkTypeAnnotation() {
        @NotEmpty String s = "" ;
        Map<@NotEmpty String, Integer> map = new HashMap<>() ;

        map.put("a", 1) ;
        map.put("", 1) ;

        boolean isNotEmpty = s instanceof String ;
        System.out.println(isNotEmpty);
        isNotEmpty = s instanceof @NotEmpty String ;
        System.out.println(isNotEmpty);

    }
}

/**
 * all props must be a function
 */
@interface Table {
    String primaryKey()  default "' ";
    int length() default 0;
    String[] columns() ;
}

/**
 * value() must be provided for repeatable annotation
 */
@Repeatable(value = Authors.class)
@interface Author {
    String value();

};

@Retention(RetentionPolicy.RUNTIME)
@interface Authors {
    Author[] value() default {};
}


@Authors({
        @Author("Range Rover"), @Author("Mercedes Benz"),
        @Author("Toyota"),
        @Author("BMW")}
)
@Author("Peter")
interface Book {
}

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface NotEmpty {

}