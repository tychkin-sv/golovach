package ua.tsv._08_multithreading._0_thread_runnable;

/**
 * Created by userPG on 27.12.2017.
 */
public class ThreadExample_1C {
    public static void main(String[] args) throws InterruptedException {


        for (int k = 0; k < 10; k++) {
            Thread.sleep(250);
            System.out.println("ThreadExample_1C A k = " + k);
        }

        PrintRunnable runnable = new PrintRunnable("B", 1000);
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("main finished");
    }
}
