class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // Call base class constructor
        start(); // Start the thread
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + getName() + ": Count - " + i);
            try {
                sleep(500); // Suspend the thread for 500 milliseconds
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
        // Create and start a child thread
        MyThread childThread = new MyThread("Child Thread");

        // Main thread execution
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: Count - " + i);
            try {
                Thread.sleep(1000); // Suspend the main thread for 1000 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
