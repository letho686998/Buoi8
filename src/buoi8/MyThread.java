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
public class MyThread extends Thread {// tạo thread C1 : kế thừa thread
// viết nhiệm vụ trong run
    @Override
    public void run() {
        // in ra các số từ 1-10 ,sau mỗi lần nghỉ 1 giây
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("T" + i);
                Thread.sleep(1000);// nghi 1s
            } catch (InterruptedException ex) {
                break;
            }
        }
    }
}
