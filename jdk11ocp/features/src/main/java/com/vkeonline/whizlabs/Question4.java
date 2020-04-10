package com.vkeonline.whizlabs;

import java.nio.file.Path;

public class Question4 {
    public static void main(String[] args) {
        Path path1 = Path.of("a/b") ;
        Path path2 = Path.of("a/c") ;
        System.out.println(path1.resolveSibling(path2));
    }
}
