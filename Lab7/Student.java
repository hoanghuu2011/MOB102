/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author HOANG HUU
 */
public class Student {

    public String fullname;
    public Career career;

    public void print() {
        System.out.println(">Fullname: " + this.fullname);
        switch (this.career) {
            case UDPM:
                System.out.println(">Career: Ung dung phan mem");
                break;
            case TKTW:
                System.out.println(">Career: Thiet ke trang web");
                break;
            case LTDĐ:
                System.out.println(">Career: Lap trinh di dong");
                break;
            case TKĐH:
                System.out.println(">Career: Thiet ke do hoa");
                break;
        }
    }

    public static void main(String[] args) {
        Student sv = new Student();
        sv.fullname = "Vo Van Hoang Huu";
        sv.career = Career.valueOf("UDPM");
        sv.print();
    }
}
