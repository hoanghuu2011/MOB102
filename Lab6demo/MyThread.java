/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6demo;

/**
 *
 * @author HOANG HUU
 */
public class MyThread extends Thread {

    public void run() {
        for (int i = 0; true; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread();
        t2.start();
        MyThread t3 = new MyThread();
        t3.start();
        MyThread t4 = new MyThread();
        t4.start();
        MyThread t5 = new MyThread();
        t5.start();
    }

}
