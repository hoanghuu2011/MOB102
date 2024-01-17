/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author HOANG HUU
 */
public class Main3 {

    public static void main(String[] args) {
        OddThread th1 = new OddThread();
        EvenThread th2 = new EvenThread();

        th1.start();
        try {
            th1.join();
        } catch (InterruptedException ex) {
        }

        th2.start();
        System.out.println("\n Ket thuc!");
    }
}
