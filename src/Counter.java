/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uxer
 */
public class Counter implements Runnable{

    @Override
    public void run() {
        
        try{
            int x = 1;       
            while(x<=10){
                System.out.println(x);
                x++;
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            //Logger.getLogger(Counter.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Counter Thread Stopped");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
