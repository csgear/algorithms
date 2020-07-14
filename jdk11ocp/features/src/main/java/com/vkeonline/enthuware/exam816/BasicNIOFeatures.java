package com.vkeonline.enthuware.exam816;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
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

    public void comparePaths() {
        try {
            Path path1 = Paths.get("/tmp/day", "../night").resolve(Paths.get("./sleep.txt")).normalize();

            Path path2 = new File("/tmp/night/sleep.txt").toPath().toRealPath();

            System.out.println(path1 + " " +  path2);

            System.out.println(Files.isSameFile(path1, path2));

            System.out.println(path1.equals(path2));
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
