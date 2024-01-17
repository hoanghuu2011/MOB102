/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

/**
 *
 * @author HOANG HUU
 */
import java.io.IOException;

public class XFileDemo {

    public static void main(String[] args) throws IOException {
        byte[] data = XFile.read("d:\\output2.txt");
        XFile.write("d:\\output2.txt", data);

    }
}
