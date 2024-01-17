/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

/**
 *
 * @author HOANG HUU
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class XFile {

    public static byte[] read(String path) throws FileNotFoundException, IOException {
        try {
            FileInputStream fis = new FileInputStream(path);
            int n = fis.available();
            byte[] data = new byte[n];

            fis.read(data);
            fis.close();

            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void write(String path, byte[] data) throws FileNotFoundException, IOException {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Object readObject(String path) throws FileNotFoundException, IOException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object object = ois.readObject();
            ois.close();
            return object;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeObject(String path, Object object) throws FileNotFoundException, IOException {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(object);
            oos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
