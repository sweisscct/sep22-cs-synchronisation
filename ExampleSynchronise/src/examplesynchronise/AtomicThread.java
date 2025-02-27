/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examplesynchronise;

/**
 *
 * @author Lecturer
 */
public class AtomicThread extends Thread {
    private static int nextThreadNum = 0;
    public int threadNum;
    public Object lock;

    public AtomicThread(Object lock) {
        this.threadNum = nextThreadNum++;
        this.lock = lock;
    }
    
    public void sayHi(int i) throws InterruptedException { 
        System.out.println("Thead: " + threadNum + " says hi for the " + i + " time");
        Thread.sleep(3000);
    }
    
    public static synchronized void synchronizedSayHi(int i, int threadNum) throws InterruptedException {
        System.out.println("Thead: " + threadNum + " says hi for the " + i + " time");
        Thread.sleep(3000);        
    }
    
    public void blockSynchronizedSayHi(int i, int threadNum) throws InterruptedException {
       synchronized(lock) { 
            System.out.println("Thead: " + threadNum + " says hi for the " + i + " time");
            Thread.sleep(3000); 
       }
    }
    
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            try {
                blockSynchronizedSayHi(i, threadNum);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
        }
    }
}
