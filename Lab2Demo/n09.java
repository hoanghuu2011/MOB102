/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2Demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 */  class n09 {
 

    // main class
    public static void main(String[] args) {
        // create a new frame
        JFrame f = new JFrame("frame");

        // set layout of frame
        f.setLayout(new FlowLayout());

        // array of string contating cities
        String s1[] = {"Ha Noi", "Dang Nang", "Ho Chi Minh", "Hue", "Tien Giang"};

        JLabel l = new JLabel("Chon thanh pho ");
        JLabel l1 = new JLabel("Ha noi duoc chon");
        l.setForeground(Color.red);
        l1.setForeground(Color.blue);

        // create checkbox
        JComboBox c1 = new JComboBox(s1);
        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == c1) {
                    l1.setText(c1.getSelectedItem() + " duoc chon");
                }
            }
        });
        // create a new panel
        JPanel p = new JPanel();

        p.add(l);

        p.add(c1);

        p.add(l1);

        f.add(p);

        // set the size of frame
        f.setSize(450, 300);

        f.setVisible(true);
    }

}

