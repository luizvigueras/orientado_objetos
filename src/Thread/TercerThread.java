/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author Luis Pomposo V
 */
public class TercerThread {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable(){
            public void run(){
                System.out.println("Soy el primer Thread");
            }
            
        });
        
        Thread t2=new Thread(new Runnable(){
            public void run(){
                System.out.println("Soy el segundo Thread");
            }
        });
        
        
        
        t1.start();
        t2.start();
    }
}
