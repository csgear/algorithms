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


    void outputText(PrintWriter pw, String text) {
        pw.write(text);
        if (pw.checkError()) {
            System.out.println("exception in writing");
        }
    }
}
