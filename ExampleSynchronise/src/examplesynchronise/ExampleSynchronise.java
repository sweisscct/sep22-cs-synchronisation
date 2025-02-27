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
        ArrayList<AtomicThread> threadList = new ArrayList<>();
        
        for (int threadNum=0; threadNum<5; threadNum++) {
            threadList.add(new AtomicThread());
            threadList.get(threadNum).start();
        }
        
//        for (Thread thread: threadList) {
//            thread.join();
//        }
        System.out.println("All threads finished");
    }
    
}
