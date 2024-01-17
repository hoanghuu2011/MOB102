/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2Demo;

import java.io.Serializable;

/**
 *
 * @author HOANG HUU
 */
public class Sachpoly implements Serializable{
    private String masach,tensach,theloai;
    private float giatien;

    public Sachpoly() {
    }

    public Sachpoly(String masach, String tensach, String theloai, float giatien) {
        this.masach = masach;
        this.tensach = tensach;
        this.theloai = theloai;
        this.giatien = giatien;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }
    
}
