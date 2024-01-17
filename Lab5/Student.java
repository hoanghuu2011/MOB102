/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import Lab5.XFile;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HOANG HUU
 */
public class Student implements Serializable {

    public String name;
    public double marks;
    public String major;

    public Student() {
    }

    public Student(String name, double marks, String major) {
        this.name = name;
        this.marks = marks;
        this.major = major;
    }

    public String getGrade() {
        if (this.marks < 3) {
            return "Kem";
        }
        if (this.marks < 5) {
            return "Yeu";
        }
        if (this.marks < 6.5) {
            return "Trung Binh";
        }
        if (this.marks < 7.5) {
            return "kha";
        }
        if (this.marks < 9) {
            return "Gioi";
        }
        return "Xuat Sac";
    }

    public boolean isBonus() {
        return this.marks >= 7.5;
    }

    public static void main(String[] args) {
        try {
            List<Student> list = new ArrayList<>();
            list.add(new Student("Huu", 10, "CNTT"));
            list.add(new Student("Linh", 7.5, "QTKD"));
            list.add(new Student("Hong", 8.5, "CNTT"));
            XFile.writeObject("students.txt", list);
            List<Student> list2 = (List<Student>) XFile.readObject("students.txt");
            for (Student sv : list) {
                System.out.println("Ho va ten: " + sv.name);
                System.out.println("Diem: " + sv.marks);
                System.out.println("Hoc luc: " + sv.getGrade());
                System.out.println("Nganh: " + sv.major);
            }
        } catch (IOException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
    }
}
