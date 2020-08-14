package com.vkeonline.enthuware.exam816;

import java.io.*;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;


/**
 * @author csgear
 */
public class BasicIoFeatures {
    static class Boo implements Serializable {
        transient int ti = 10;
        static int si = 20;
    }

    /**
     * 1) the transient and static variable is not serializable
     * 2) Constructors of unserializable classes are called. But for serializable classes, their data members are set directly
     * from the values presented in serialized data
     */
    public void checkFileStream() throws Exception {
        Boo boo = new BasicIoFeatures.Boo();
        Boo.si++;
        System.out.println(boo.ti + " " + Boo.si);
        FileOutputStream fos = new FileOutputStream("/tmp/boo.ser");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(boo);
        os.close();

        FileInputStream fis = new FileInputStream("/tmp/boo.ser");
        ObjectInputStream is = new ObjectInputStream(fis);
        boo = (Boo) is.readObject();
        is.close();
        System.out.println(boo.ti + " " + Boo.si);

    }

    static void checkIfAFileWillBeCreated() {
        File file;
        try (FileWriter fw = new FileWriter("/tmp/test1.txt");) {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void processLines(File f) throws IOException {
        FileReader fr = new FileReader(f);
        BufferedReader bfr = new BufferedReader(fr);
        String s;
        while ((s = bfr.readLine()) != null) {
            System.out.println(s);
        }
    }

    static void readAndWriteBytes() {
        final String fileName = "/tmp/data.bin";
        String s = "hello";
        byte i = 100;

        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeByte(i);
            dos.writeUTF(s);
            dos.flush();
            dos.close();
            fos.close();
            DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
            i = dis.readByte();
            s = dis.readUTF();
            System.out.println(i + " " + s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static void outputText(PrintWriter pw, String text) {
        pw.write(text);
        if (pw.checkError()) {
            System.out.println("exception in writing");
        }
    }


    public static void consoleTest() {
        Console c = System.console();
        char[] line = c.readPassword("Please enter your pwd:");
        System.out.println("Pwd is " + new String(line));
    }

    static void checkRAFWriteUTF() {
        try (RandomAccessFile raf = new RandomAccessFile("/tmp/test.txt", "rwd")) {
            raf.writeUTF("hello world");
            DataInputStream dis = new DataInputStream(new FileInputStream("/tmp/test.txt"));
            byte[] data = new byte[1024];
            if (dis.read(data) != -1) {
                System.out.print(data);
            }
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        checkIfAFileWillBeCreated();
    }
}

class FileCopier {
    static void copy(String records1, String records2) throws IOException {
        try (InputStream is = new FileInputStream(records1);
             OutputStream os = new FileOutputStream(records2)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }

}

class StudentSerialization implements Serializable {
    public static final long serialVersionUID = 1;
//    public String name;
//    public String grade;

//    @Override
//    public String toString() {
//        return "[" + name + ", " + grade + "]";
//    }

    public String id = "S111";
    public String name;
    public String grade;
    public int age = 15;

    @Override
    public String toString() {
        return "[" + id + ", " + name + ", " + grade + ", " + age + "]";
    }

    static void writeOldStudentObject() {
        try (FileOutputStream fos = new FileOutputStream("/tmp/student.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            StudentSerialization s = new StudentSerialization();
            s.name = "bob";
            s.grade = "10";
            oos.writeObject(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readNewStudentObject() {
        try (FileInputStream fis = new FileInputStream("/tmp/student.ser");
             ObjectInputStream os = new ObjectInputStream(fis)) {
            StudentSerialization s = (StudentSerialization) os.readObject();
            System.out.println(s);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readNewStudentObject();
    }
}
