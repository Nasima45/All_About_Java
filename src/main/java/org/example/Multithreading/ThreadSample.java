package org.example.Multithreading;

class MyThread extends Thread {
    public void run() {
        System.out.println("my thread is running");
    }
}

public class ThreadSample {
    public static void main(String[] args) {
        System.out.println("My current thread name :"+ Thread.currentThread().getName());

        MyThread t1 = new MyThread();
        t1.start();
        Thread t2 = new Thread(()-> {
            System.out.println("I am just a thread working for t2");
            System.out.println("My current thread name :"+ Thread.currentThread().getName());
            System.out.println("My current thread id :"+ Thread.currentThread().getId());
        });
        Thread t3 = new Thread(()-> {
            System.out.println("I am just a thread working for t3");
            System.out.println("My current thread name :"+ Thread.currentThread().getName());
            System.out.println("My current thread id :"+ Thread.currentThread().getId());
        });
        t2.start();
        t3.start();
        Thread t5 = new Thread(()->{
            for(int i=2;i<40;i++){
                if(i%2==0){
                    System.out.println("T5 for EVEN : " + i);
                }
            }
        });
        Thread t6 = new Thread(()->{
            for(int i=2;i<40;i++){
                if(i%2!=0){
                    System.out.println("T6 for ODD : " + i);
                }
            }
        });
        t5.start();
        t6.start();
    }
}
