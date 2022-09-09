import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

          Random random = new Random();
          int [] massiv=new int[10] ;
          ArrayList<Integer> arrayList = new ArrayList<>();
          LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            massiv[i]= random.nextInt(2);
            arrayList.add(i, random.nextInt(2));
            linkedList.add(i, random.nextInt(2));
        }
        System.out.println("massiv до сортировки"+Arrays.toString(massiv));
        sorrt(massiv);
        System.out.println("\nlinkedlist  до сортировки :" + linkedList);
        sorrt(linkedList);
        System.out.println("\narrayList до сортировки :" + arrayList);
        sorrt(arrayList);
    }
    public static void sorrt(ArrayList<Integer>arrayList){
        Collections.sort(arrayList);
        System.out.println("arrayList после сортировки :" + arrayList);
    }
    public static void sorrt(LinkedList<Integer>linkedList){
        Collections.sort(linkedList);
        System.out.println("linkedlist после сортировки :" + linkedList);
    }
    public static void sorrt(int[]massiv){
        Arrays.sort(massiv);
        System.out.println("massiv после сортировки"+Arrays.toString(massiv));
    }
}