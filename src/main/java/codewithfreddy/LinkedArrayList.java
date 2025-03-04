package codewithfreddy;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedArrayList {

    public static void main(String[] args) {


        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 10000000; i++){
            linkedList.add(i);
            arrayList.add(i);

        }

        // **********************************LinkedList*******************************************
        startTime = System.nanoTime();

        //do something
       // linkedList.get(0);
        // linkedList.get(9999999);
//        linkedList.remove(0);
//        linkedList.remove(100000);
        linkedList.remove(9999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("LinkedList:\t " + elapsedTime + " ns");



        // **********************************ArrayList*******************************************

        startTime = System.nanoTime();

        //do something
//        arrayList.get(0);
//        arrayList.get(9999999);
//        arrayList.remove(0);
//        arrayList.remove(100000);
        arrayList.remove(9999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t " + elapsedTime + " ns");

    }
}
