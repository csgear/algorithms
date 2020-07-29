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
    }
}

/**
 * @author csgear
 */
@interface Exercise {
    int hoursPerDay() ;
    int startHour() default 6 ;
}

/**
 * @author csgear
 */
@interface Strong {
    int force() ;
}

/**
 * @author csgear
 */
@interface Wind {
    public static final int temperature = 20 ;
    int size = 10 ;
    Strong power() default @Strong(force=10) ;
}