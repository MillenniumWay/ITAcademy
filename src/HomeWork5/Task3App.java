package HomeWork5;

public class Task3App {

        public static void main(String[] args) {
            Integer[][] array = {{1, 2, 3},
                    {4, 5, 6, 7, 8}};
            Task3 customIterator = new Task3(array);
            while (customIterator.hasNext()) {
                System.out.print(customIterator.next() + ", ");
            }
        }

}




