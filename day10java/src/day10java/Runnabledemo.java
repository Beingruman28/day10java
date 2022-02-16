package day10java;

public class Runnabledemo  implements Runnable {  
	  
    public void run() {  
        System.out.println("Thread has ended");  
    }  
   
    public static void main(String[] args) {  
    	Runnabledemo rd = new Runnabledemo();  
        Thread t1= new Thread();
        Thread t2= new Thread(rd);
        t1.start();  
        System.out.println("Hi"); 
        t2.start();
        System.out.println("trying the thread 2");
    }  
}  