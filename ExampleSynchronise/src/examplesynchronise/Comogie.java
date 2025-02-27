/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplesynchronise;

import static examplesynchronise.GAA.message;

/**
 *
 * @author Lecturer
 */
public class Comogie extends Thread {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
    private static int pointsScored = 0;
    private static String message = "";
    
    public void Laois() {
        synchronized(lock1) {
            message = message + "Olé!";
        }
    }
    
    public void Offaly() {
        synchronized(lock1) {
            message = message.substring(0, message.length() - 4);
        }
    }
    
    public void point() {
        synchronized(lock2) {
            pointsScored++;
        }
    }
    
    public static void printData() {
        System.out.println(message);
        System.out.println(pointsScored);
    }
        
    
    public void run() {
        for (int i=0; i<5; i++) {
            Laois();
            point();
        }
        
        for (int i=0; i<4; i++) {
            Offaly();
            point();
        }
        
        
    }
}
