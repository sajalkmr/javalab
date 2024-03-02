class MyThread extends Thread {
    public MyThread(String name) {
        super(name); 
        start(); 
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + getName() + ": Count - " + i);
            try {
                sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Thread " + getName() + " interrupted.");
            }
        }
        System.out.println("Thread " + getName() + " exiting.");
    }
}

public class MyThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        
        MyThread childThread = new MyThread("Child Thread");

        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: Count - " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
