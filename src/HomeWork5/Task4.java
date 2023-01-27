package HomeWork5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
public class Task4 {


        public static void main(String[] args) {

            List<Integer> list = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                list.add(i, random.nextInt(11));
            }
            System.out.println(Arrays.deepToString(list.toArray()));
            Iterator<Integer> iterator = list.iterator();
            int max = 0;
            while (iterator.hasNext()) {
                int count = iterator.next();
                if (count > max) {
                    max = count;
                }
            }
            System.out.println("Максимальная оценка - " + max);
        }
    }

