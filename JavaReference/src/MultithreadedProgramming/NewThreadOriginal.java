package MultithreadedProgramming;

// create a second thread
public class NewThreadOriginal implements Runnable {
    Thread t;

    NewThreadOriginal() {
        // create a new, second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start(); // start the thread
    }

    // this is the entry point for the second thread
    public void run() {
        try {
            int i = 5;
            while (i > 0) {
                System.out.println("child thread: " + i);
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException e) {
            System.out.println("child interrupted.");
        }
        System.out.println("exiting child thread.");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThreadOriginal(); // create a new thread

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
