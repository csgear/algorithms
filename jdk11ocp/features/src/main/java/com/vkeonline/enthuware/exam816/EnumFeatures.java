package com.vkeonline.enthuware.exam816;

import java.io.Serializable;

/**
 * @author csgear
 */
public class EnumFeatures {
    public static void main(String[] args) {
        System.out.println(WorkingHours.Monday);
        System.out.println(WorkingHours.valueOf("Monday"));
    }
}

/**
 * @author csgear
 */
enum WorkingHours {
    Monday,
    Tuesday
}

