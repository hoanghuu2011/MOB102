/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author HOANG HUU
 */
public class Pair<T, S> {
private T first;
private S second;

public Pair(T fi, S se){
first = fi;
second = se;
}
public T getFirst() { return first; }
public S getSecond() { return second; }
}