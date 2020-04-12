package com.vkeonline.enthuware;

import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicNIOFeatures {
    /**
     * returns "home/tstone10
     */
    public String checkPath() {
        Path p1 = Paths.get("/home/tstone10/Documents/Books/FrontEnd") ;
        return p1.subpath(0,2).toString() ;
    }

    /**
     * 1) Path.getRoot() returns "/"
     * 2) Path.getName(0) returns "home"
     * 3) Path.getName(1) return "tstone10"
     * 4) Path.getName(10) will cause IllegalArgumentException to be thrown
     * @return
     */
    public String checkPathRoot() {
        Path p1 = Paths.get("/home/tstone10/Documents/Books/FrontEnd") ;
        return p1.getRoot().toString() ;
    }

    public String checkRelativize() {
        Path p1 = Paths.get("x/y") ;
        Path p2 = Paths.get("z") ;
        return p1.relativize(p2).toString() ;
    }
}
