/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examplesynchronise;

import java.util.ArrayList;

/**
 *
 * @author Lecturer
 */
public class ExampleSynchronise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> threadList = new ArrayList<>();
        Object lock = new Object();
        
        for (int threadNum=0; threadNum<2; threadNum++) {
            threadList.add(new Comogie());
            threadList.get(threadNum).start();
        }
//            threadList.add(new AtomicThread(new Object()));
//            threadList.get(5).start();        
        
        for (Thread thread: threadList) {
            thread.join();
        }
        Comogie.printData();
        System.out.println("All threads finished");
//        GAA gaa1 = new GAA();
//        GAA gaa2 = new GAA();
//        
//        gaa1.start();
//        gaa2.start();
//        
//        gaa1.join();
//        gaa2.join();
//        
//        System.out.println(GAA.message);
       
    }
    
}
