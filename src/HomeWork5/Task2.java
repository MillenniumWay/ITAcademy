package HomeWork5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

    public class Task2 {
        public static void main(String[] args) {

            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();

            System.out.print("В добавлении элементов ");
            timeDifference(fillingTime(arrayList), fillingTime(linkedList));

            System.out.print("В получении элементов ");
            timeDifference(gettingTime(arrayList), gettingTime(linkedList));
        }

        private static void fillTheList(List<Integer> list) {
            for (int i = 0; i < 1_000_000; i++) {
                list.add(i, i);
            }
        }


        private static void getRandomElements(List<Integer> list) {
            Random random = new Random();
            for (int i = 0; i < 1_000_000; i++) {
                list.get(random.nextInt(list.size()));
            }
        }

        private static double fillingTime(List<Integer> list) {
            long start = System.currentTimeMillis();
            fillTheList(list);
            long finish = System.currentTimeMillis();
            return (finish - start) / 1000d;
        }

        private static double gettingTime(List<Integer> list) {
            long start = System.currentTimeMillis();
            getRandomElements(list);
            long finish = System.currentTimeMillis();
            return (finish - start) / 1000d;
        }

        private static void timeDifference(double arrayListTime, double linkedListTime) {
            if (arrayListTime > linkedListTime) {
                double diff = arrayListTime - linkedListTime;
                System.out.println("LinkedList быстрее на " + diff + " секунд");
            } else {
                double diff = linkedListTime - arrayListTime;
                System.out.println("ArrayList быстрее на " + diff + " секунд");
            }
        }

    }
