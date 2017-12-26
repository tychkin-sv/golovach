package ua.tsv._06_exception;

import java.io.IOException;

/**
 * Created by TSV on 19.12.2017.
 */
public class ExceptionTest_ThrowThrows_0_Ex_Ex {

    // Надо либо обработать checked исключение либо добавить throws в сигнатуру метода
    public static void main(String[] args) /*throws Exception*/ {
        try {
         throw new IOException();
        }
        catch (Exception e){
            // не требует объявления в сигнатуре, т.к. uncheked
            throw new IndexOutOfBoundsException();

            //throw new Exception();

        }
    }
}
