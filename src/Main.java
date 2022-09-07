import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Overload();
    }


        private static void Overload() {
          Random random = new Random();
          ArrayList<Integer> arrayList = new ArrayList<>();
          LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i, random.nextInt(2));
            linkedList.add(i, random.nextInt(2));
        }
        System.out.println("linkedlist  до сортировки :" + linkedList);
        Collections.sort(linkedList);
        System.out.println("linkedlist после сортировки :" + linkedList);
        System.out.println("");
        System.out.println("arrayList до сортировки :" + arrayList);
        Collections.sort(arrayList);
        System.out.println("arrayList после сортировки :" + arrayList);
    }
}