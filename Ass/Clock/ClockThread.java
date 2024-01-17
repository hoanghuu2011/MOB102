/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ass.Clock;

/**
 *
 * @author HOANG HUU
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;

/**
 *
 */
public class ClockThread extends Thread implements Runnable {

    public JButton btnClock;

    public ClockThread(JButton btnClock) {
        this.btnClock = btnClock;
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa "); 
        while (true) {
            Date now = new Date();
            String time = sdf.format(now);
            btnClock.setText(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
