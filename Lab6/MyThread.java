
package Lab6;


/**
 *
 * @author HOANG HUU
 */
public class MyThread implements Runnable {
     public void run() {
        for (int i = 0;i<=10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}

