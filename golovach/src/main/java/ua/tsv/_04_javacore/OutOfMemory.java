package ua.tsv._04_javacore;

import java.util.ArrayList;

/**
 * Created by TSV on 15.12.2017.
 */
public class OutOfMemory {

    public static void main(String[] args) {
        //createBigArray();
        //createInfinityObject();
        //createInfinityObjectVar();
        createInfinityObjectList();
    }


    public static void createBigArray(){
        // Очень много памяти
        long[] s = new long[Integer.MAX_VALUE];
    }

    public static void createInfinityObject(){
        // !!! Не вызывает OutOfMemoryError
        while (true) new Object();
    }



    public static void createInfinityObjectVar(){
        // !!! Не вызывает OutOfMemoryError
        Object object;
        while (true) object = new Object();
    }

    public static void createInfinityObjectList(){
        // !!! Вызывает OutOfMemoryError
        ArrayList<Object> list = new ArrayList<Object>();
        while (true) list.add(new Object());
    }


}
