
package Lab3;

/**
 *
 * @author HOANG HUU
 */
public class Student {
    private String name,major;
    private double marks;

    public Student(String name, String major, double marks) {
        this.name = name;
        this.major = major;
        this.marks = marks;
    }

    public Student() {
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    public String getHocLuc() {
        if (this.marks < 3) {
            return "Kém";
        }
        if (this.marks < 5) {
            return "Yếu";
        }
        if (this.marks < 6.5) {
            return "Trung bình";
        }
        if (this.marks < 7.5) {
            return "Khá";
        }
        if (this.marks < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }
    public boolean isBonus() {
        return this.marks >= 7.5;
    }
}
