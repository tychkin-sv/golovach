package ua.tsv._08_multithreading._0_thread_runnable;

public class ThreadExample_0C {

    public static void main(String[] args) throws InterruptedException {
        for (int k=0; k<10; k++){
            Thread.sleep(240);
            System.out.println("A");
        }

        new PrintRunnable(" B", 260).run();

    }

}
