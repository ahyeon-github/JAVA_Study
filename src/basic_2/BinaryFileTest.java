package basic_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryFileTest {
    public static void main(String[] args) {
        try {
            BufferedInputStream is = new BufferedInputStream(new FileInputStream("a.jpg"));
            BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("b.jpg"));

            byte[] buffer = new byte[16384];
            while (is.read(buffer) != -1) {
                os.write(buffer);
            }
            is.close();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

