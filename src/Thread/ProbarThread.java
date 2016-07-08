/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.io.Serializable;


public class ProbarThread implements Runnable,Serializable{
    public static void main(String[] args) {
        //creamos el thread
        PrimerThread  t1= new PrimerThread();
        t1.start();
        //cremamos el segundo thread
        Runnable r=new ProbarThread();
        Thread t2=new Thread(r);
        t2.start();
    }
    
        public void run() {
            System.out.println("SEGUNDO THREAD");
    }
}
