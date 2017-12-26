package ua.tsv.example_exception_from_jdk;

/**
 * Created by TSV on 20.12.2017.
 */
public class IllegalArgumentExceptionExample {

    public static void main(String[] args) {
        createNewUser(null, -1);
    }

    private static void createNewUser(String name, int age) {
  if (name == null) {
      throw new IllegalArgumentException("Name must be not null");
  }
  if ((age<0) || (age>256)) {
      throw new IllegalArgumentException("Age must be in interval [0..256]. Age = " + age);
  }
    }
}
