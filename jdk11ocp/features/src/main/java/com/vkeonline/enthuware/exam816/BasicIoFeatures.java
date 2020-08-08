package com.vkeonline.enthuware.exam816;

import java.io.*;


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
     *
     * @throws Exception
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

    public void processLines(File f) throws IOException {
        FileReader fr = new FileReader(f);
        BufferedReader bfr = new BufferedReader(fr);
        String s = null;
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

    public static void main(String[] args) {
        readAndWriteBytes();
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter Number:");
            String s = bfr.readLine();
            System.out.println("Your Number is : " + s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
