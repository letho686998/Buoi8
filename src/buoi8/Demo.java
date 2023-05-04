/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class Demo {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        //MyThread t2 = new MyThread();

        t1.start();
        //t2.start();
        // tạo thread dùng runable
        try {
            t1.join();// dợi t1 chạy xong thì t2 mới chạy
        } catch (InterruptedException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Thread t2 = new Thread(new MyRunable());
        t2.start();
    }
}
