package com.vkeonline.enthuware.exam816;

import java.io.*;

class Boo implements Serializable {
    transient int ti = 10 ;
    static int si = 20 ;
}

public class BasicIOFeatures {
    /**
     * 1) the transient and static variable is not serializable
     * 2) Constructors of unserializable classes are called. But for serializable classes, their data members are set directly
     *    from the values presented in serialized data
     * @throws Exception
     */
    public void checkFileStream() throws Exception {
        Boo boo = new Boo() ;
        boo.si++ ;
        System.out.println(boo.ti + " " + boo.si);
        FileOutputStream fos = new FileOutputStream("/tmp/boo.ser") ;
        ObjectOutputStream os = new ObjectOutputStream(fos) ;
        os.writeObject(boo);
        os.close();

        FileInputStream fis = new FileInputStream("/tmp/boo.ser") ;
        ObjectInputStream is = new ObjectInputStream(fis) ;
        boo = (Boo) is.readObject() ;
        is.close();
        System.out.println(boo.ti + " " + boo.si) ;

    }

    public void processLines(File f) throws IOException {
        FileReader fr = new FileReader(f) ;
        BufferedReader bfr = new BufferedReader(fr) ;
        String s = null ;
        while( ( s = bfr.readLine()) != null) {
            System.out.println(s);
        }
    }
}
