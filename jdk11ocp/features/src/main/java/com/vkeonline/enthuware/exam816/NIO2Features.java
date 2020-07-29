package com.vkeonline.enthuware.exam816;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class NIO2Features {
    public void comparePathObjects() throws IOException {
        Path path1 = Paths.get("/tmp/./").resolve(Paths.get("walking.txt"));
        Path path2 = new File("/tmp/././actions/../walking.txt").toPath();

        System.out.println(path1.toString());
        System.out.println(path2.toString());
        System.out.print(Files.isSameFile(path1, path2));
        System.out.print(" " + path1.equals(path2));
        System.out.println(" " + path1.normalize().equals(path2.normalize()));
        ;
    }

    public void checkAllJavaFiles() throws IOException {
        Files.walk(Paths.get("/tmp/actions/test").toRealPath().getParent())
                .map(p -> p.toAbsolutePath().toString())
                .filter(s -> s.endsWith(".java"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        Path path1 = Paths.get("/tmp/actions").toRealPath().getParent();
        System.out.println(path1.toString());
        System.out.println(path1.toAbsolutePath().toString());
    }

    static void pathResolve() {
        Path p1 = Paths.get("/temp/test.txt");
        Path p2 = Paths.get("report.pdf");
        System.out.println(p1.resolve(p2));
        var p3 = Path.of("/usr/./root", "../kodiacbear.txt");
        var p4 = p3.normalize().relativize(Path.of("/lion"));
        System.out.println(p3);
        System.out.println(p4);
        var p5 = Paths.get("/zoo/animals/bear/koala/food.txt");
        System.out.println(p5.subpath(1, 3).getName(1).toAbsolutePath());
    }

    static Path p1 = Paths.get("/tmp/mamal/kangaroo/hello.txt");

    public static String getRoot() {
        String root = p1.getRoot().toString();
        return root;
    }

    public static void main(String[] args) {
        System.out.println(getRoot());
    }
}
