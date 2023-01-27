package HomeWork5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Task1 {

        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();

            list.add("1");
            list.add("1");
            list.add("2");
            list.add("2");
            list.add("3");
            list.add("3");

            System.out.println(toSet(list));
        }

        public static Set<?> toSet(Collection<?> collection) {
            return collection == null ? null : new HashSet<>(collection);
        }

    }



