package org.example.Multithreading;
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("i am from runnable");
    }
}
public class RunnableSample {
    public static void main(String[] args) {
        System.out.println("My current thread name :"+ Thread.currentThread().getName());
        System.out.println("My current thread id :"+ Thread.currentThread().getId());
        MyRunnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);
        t2.start();
    }
}
