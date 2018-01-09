package ua.tsv._08_multithreading._0_thread_runnable;

/**
 * Created by userPG on 27.12.2017.
 */
public class ThreadExample_2A {
    public static void main(String[] args) throws InterruptedException {
        PrintRunnable runnable = new PrintRunnable(" B", 100);
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("AAA");
        thread.join(); // Ждем завершение потока
        System.out.println("BBB");

        for (int k = 0; k < 10; k++) {
            Thread.sleep(250);
            System.out.println("A");
        }


    }
}
