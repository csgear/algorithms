package com.vkeonline.enthuware.exam816;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public static void readCsvContent() throws IOException {
        String file = "/tmp/food.csv";
        var path = Path.of(file);
        Files.readAllLines(path).stream().flatMap(p -> Stream.of(p.split(",")))
                .map(q -> q.toUpperCase()).forEach(System.out::println);
    }

    public static void checkPathIsSame() throws IOException {
        var p1 = Path.of("/tmp", ".").resolve(Path.of("walking.txt"));
        var p2 = new File("/tmp/././actions/../walking.txt").toPath();

        System.out.println(Files.isSameFile(p1, p2));
        System.out.println(p1.equals(p2));
        System.out.println(p1.normalize().equals(p2.normalize()));

    }

    public static void main(String[] args) throws IOException {

        Path p1 = Paths.get("/personal/./photos/../readme.txt");
        Path p2 = Paths.get("/personal/index.html");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);
    }

    /**
     * returns "home/tstone10
     */
    public String checkPath() {
        Path p1 = Paths.get("/home/tstone10/Documents/Books/FrontEnd");
        return p1.subpath(0, 2).toString();
    }

    /**
     * 1) Path.getRoot() returns "/"
     * 2) Path.getName(0) returns "home"
     * 3) Path.getName(1) return "tstone10"
     * 4) Path.getName(10) will cause IllegalArgumentException to be thrown
     *
     * @return
     */
    public String checkPathRoot() {
        Path p1 = Paths.get("/home/tstone10/Documents/Books/FrontEnd");
        return p1.getRoot().toString();
    }

    public String checkRelativize() {
        Path p1 = Paths.get("x/y");
        Path p2 = Paths.get("z");
        return p1.relativize(p2).toString();
    }

    public void comparePaths() {
        try {
            Path path1 = Paths.get("/tmp/day", "../night").resolve(Paths.get("./sleep.txt")).normalize();

            Path path2 = new File("/tmp/night/sleep.txt").toPath().toRealPath();

            System.out.println(path1 + " " + path2);

            System.out.println(Files.isSameFile(path1, path2));

            System.out.println(path1.equals(path2));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
