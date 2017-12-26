package ua.tsv._04_javacore;

/**
 * Created by TSV on 16.12.2017.
 */
public class TestRef {



    public static void main(String[] args) {
        // Память не растет
        //cyclic01();

        // Память растет
        //cyclic02();

        // Память не растет
        //cyclic03();
    }

    public static void cyclic01(){
        Object[] ref = new Object[1];
        // Только внешняя ссылка важна
        while (true) {
            Object[] a = new Object[1];
            Object[] b = new Object[1];
            a[0] = b;
            b[0] = a;
            ref = a;
        }
    }

    public static void cyclic02(){
        // Создаем бесконечную цепочку ссылок увеличивая используемую память
        Object[] ref = new Object[1];
        while (true) {
            ref = new Object[]{ref};

        }
    }

    private static void cyclic03() {
        Object[] ref = new Object[1];
        while (true) {
            ref[0] = new Object[]{ref};
            ref = (Object[]) ref[0];

        }
    }
}
