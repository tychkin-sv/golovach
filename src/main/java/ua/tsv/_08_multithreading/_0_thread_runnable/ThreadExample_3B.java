package ua.tsv._08_multithreading._0_thread_runnable;

public class ThreadExample_3B {
//#8.3
    public static void main(String[] args) throws InterruptedException {
        final Thread mainThread = Thread.currentThread();
        Thread runThread = new Thread(new Runnable() {
        public void run() {
            try {
                System.out.println("Run: wait for main");
                mainThread.join();
            } catch (InterruptedException e){
                e.printStackTrace();
                }
            }
        });
        runThread.start();
        System.out.println("Main: wait for run");
        runThread.join();
    }
}
