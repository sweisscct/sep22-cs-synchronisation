/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplesynchronise;

/**
 *
 * @author Lecturer
 */
public class GAA extends Thread {
    public static String message = "";
     
    public synchronized void Laois() {
        message = message + "Olé!";
    }
    
    public synchronized void Offaly() {
        message = message.substring(0, message.length() - 4);
    }
    
    @Override
    public void run() {
        Laois();
        for (int i=0; i<5; i++) {
            Laois();
            Offaly();
        }
//        for (int i=0; i<4; i++) {
//            
//        }
    }
}
