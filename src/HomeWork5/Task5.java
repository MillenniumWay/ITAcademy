package HomeWork5;
import java.util.HashMap;
import java.util.Map;
public class Task5 {

        public static void main(String[] args) {

            String str = "Qwertyq / 123456789 <>";
            Map<Character, Integer> dictionary = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                int value = 1;
                char symbol = str.charAt(i);
                if (!dictionary.containsKey(symbol)) {
                    dictionary.put(symbol, 1);
                } else {
                    dictionary.put(symbol, ++value);
                }
            }
            System.out.println(dictionary);
        }
    }




