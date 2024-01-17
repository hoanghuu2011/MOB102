/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.io.Serializable;

/**
 *
 * @author HOANG HUU
 */
public class Staff implements Serializable {

    public String fullname;
    public double salary;

    public Staff() {
    }

    public Staff(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

}
