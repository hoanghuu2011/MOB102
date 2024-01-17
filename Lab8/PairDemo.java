/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author HOANG HUU
 */
public class PairDemo {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair(1, "One");
        Pair<String, String> p2 = new Pair("Hello" ,  "World");
        System.out.println(p1.getFirst() + ", " + p1.getSecond());
        System.out.println(p2.getFirst() + ", " + p2.getSecond());
    }
}
