public class SimpleThread implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " - " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SimpleThread(), "Thread 1");
        Thread thread2 = new Thread(new SimpleThread(), "Thread 2");

        thread1.start();
        thread2.start();
    }
}