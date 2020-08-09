package com.vkeonline.enthuware.exam815;

/**
 * @author csgear
 */
public class InstanceOfOperator {
    int k = 5;

    public boolean checkIt(int k) {
        return k-- > 0 ? true : false;
    }

    public void printThem() {
        while (checkIt(k)) {
            System.out.print(k--);
        }
    }

    public static void main(String[] args) {
        new InstanceOfOperator().printThem();
    }
}



class Speak {
    public static void main(String[] args) {
        Speak s = new GoodSpeak();

        ((GoodSpeak) s).up();
        ((Tone) s).up();
    }
}

class GoodSpeak extends Speak implements Tone {
    @Override
    public void up() {
        System.out.println("UP UP UP");
    }
}

interface Tone {
    void up();
}