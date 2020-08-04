package com.vkeonline.enthuware.exam816;

import java.io.IOException;

/**
 * @author csgear
 */
public class FoundationTest {
    static class Device implements AutoCloseable {
        boolean open = false;
        int index;

        public Device(int index) {
            this.index = index;
            open = true;
        }

        public void write() throws IOException {
            throw new RuntimeException("Can't write!");
        }

        @Override
        public void close() {
            open = false;
            System.out.println("Device closed " + index);
        }

        public static void main(String[] args) {
            Device d1 = new Device(1);
            try (d1; Device d2 = new Device(2); Device d3 = new Device(3)) {
                d2.write();
                d1.close();
            } catch (Exception e) {
                System.out.println("Got Exception " + e.getMessage());
            }


        }
    }

}


