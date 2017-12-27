package ua.tsv._08_multithreading._0_thread_runnable;

/**
 * Created by userPG on 27.12.2017.
 */
public class ThreadExample_3A {
    public static void main(String[] args) throws InterruptedException {
        // 1 вариант
        Thread thread = Thread.currentThread();
        thread.join();

        // 2 вариант
        Thread.currentThread().join();

    }
}
