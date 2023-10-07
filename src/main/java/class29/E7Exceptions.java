package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E7Exceptions {

    public static void main(String[] args) {


    }

    void readFile() {
        read();
    }


    void read() {
        try {
            FileInputStream fis = new FileInputStream("C:/adasas");
        } catch (FileNotFoundException f) {
        }
    }
}