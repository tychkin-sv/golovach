package ua.tsv._08_multithreading._0_thread_runnable;

/**
 * Created by TSV on 25.12.2017.
 */
public class ThreadExample_0B {
    public static void main(String[] args) throws InterruptedException {
        for (int k = 0; k < 10; k++) {
            Thread.sleep(240);
            System.out.println("ThreadExample_0A k = " + k);
            f();
        }
    }
    public static void f() throws InterruptedException {
        Thread.sleep(260);
        System.out.println("B");
    }
}
