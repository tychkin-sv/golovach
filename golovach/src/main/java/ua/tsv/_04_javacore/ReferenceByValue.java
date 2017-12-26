package ua.tsv._04_javacore;

/**
 * Created by TSV on 15.12.2017.
 * Передача параметров по значению, значению ссылки
 */
public class ReferenceByValue {

    public static void main(String[] args) {
        int x = 0;
        int[] arr = {0};
        System.out.println("x = " + x + " arr={" + arr[0] + "}");
        change(x, arr);
        System.out.println("x = " + x + " arr={" + arr[0] + "}");
        create(x, arr);
        System.out.println("x = " + x + " arr={" + arr[0] + "}");
        x = retVal(x,retRef(x, arr));
        System.out.println("x = " + x + " arr={" + arr[0] + "}");
        arr = retRef(x, arr);
        System.out.println("x = " + x + " arr={" + arr[0] + "}");
    }

    public static void change(int x, int[] arr){
       x = 10; // Не влиеят никак на внешнюю
       // arr хранит в себе значение ссылки такое же как и внешняя
       // поэтому изменения влияют также на внешний массив
       arr[0] = 10;
    }

    public static void create(int x, int[] arr){
        x = 20; // Не влиеят никак на внешнюю
        // arr создает новую ссылку, ссылки на внешнюю теряется
        // поэтому изменения не увидем во внешнем массиве
        arr = new int[]{20};
    }

    public static int retVal(int x, int[] arr){
        x = 30;
        arr[0] = 30;
        return x;
    }

    public static int[] retRef(int x, int[] arr){
        x = 30; // Не влиеят никак на внешнюю
        // arr создает новую ссылку, ссылки на внешнюю теряется
        arr = new int[]{30};
        // но возвращаем ссылку на вновь созданный массив
        // и теберь внешняя ссылась бы на него, если бы ей присвоили
        return arr;
    }
}
