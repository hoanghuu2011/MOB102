/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2Demo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HOANG HUU
 */
public class Example1 {

    public static void main(String[] args) {
        try {
            try (FileOutputStream fos = new FileOutputStream("d:\\output2.txt")) {
                String text = "Chao buoi sang";
                byte[] textAsByte = text.getBytes();
                fos.write(textAsByte);
                fos.close();
            }
        } catch (IOException ex) {
            System.out.println("Sai: " + ex.getMessage());
        }

    }
}