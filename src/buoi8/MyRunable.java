/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi8;

/**
 *
 * @author LENOVO
 */
public class MyRunable implements Runnable{ // tạo Runable

    @Override
    public void run() {
           for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("R" + i);
                Thread.sleep(1000);// nghi 1s
            } catch (InterruptedException ex) {
                break;
            }
        }
     }
    
}
