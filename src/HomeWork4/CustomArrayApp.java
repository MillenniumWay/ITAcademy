package HomeWork4;

    public class CustomArrayApp {

        public static void main(String[] args) {
            CustomArray<String> list = new CustomArray<String>(5);



            list.add("1");
            list.add("2");
            list.add("One");
            list.add("Two");
            list.add("LastOfList");

            list.print();
            System.out.println(list.getFirst());
            System.out.println(list.getLast());
            System.out.println(list.size());



        }
    }






