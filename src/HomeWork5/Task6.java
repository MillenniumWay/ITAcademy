package HomeWork5;
import java.util.Arrays;

public class Task6 {
        public static void main(String[] args) {

            int[] array = new int[8];

            try {
                array[1] = 1;
                for (int i = 0; i < 10; i++) {
                    array[i] = i + 1;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Array is to small, expand the array");
            } finally {
                System.out.println(Arrays.toString(array));
            }
        }
    }

