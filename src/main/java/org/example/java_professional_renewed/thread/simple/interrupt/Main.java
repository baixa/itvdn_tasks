package org.example.java_professional_renewed.thread.simple.interrupt;

/**
 * Created by Ivan Maksimchuk.
 */
public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        counter.interrupt();
    }
}

class Counter extends Thread {
    @Override
    public void run() {
        int i = 0;

        while (!isInterrupted()) {
            System.out.println("i = " + i++);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
