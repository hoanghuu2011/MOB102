/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author HOANG HUU
 */
public class OddThread extends Thread {

    public void run() {
        for (int i = 1; i < 20; i += 2) {
            System.out.print(" " + i);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }
}
