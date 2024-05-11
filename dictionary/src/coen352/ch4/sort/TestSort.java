
package coen352.ch4.sort;

import java.util.Comparator;
import java.util.Random;

/**
 All of the code written under the sort package was written in tutorial 4 with the help of the tutorial TA.
 */

/**

public class TestSort {

    public static void main(String[] args) {

        boolean y = false;
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        int[] array = new int[1000];
        Object[] array2 = new Object[1000];

        for (int i = 0; i < 1000; i++) {
            array[i] = new Random().nextInt(1000);
            array2[i] = new Random().nextInt(1000);
        }

        long start = System.currentTimeMillis();
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(array, y);
        long end = System.currentTimeMillis();
        long execution = end - start;
        System.out.println("The execution time for the insertion sort is: "+execution+"ms");

        long start2 = System.currentTimeMillis();
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array2, comp);
        long end2 = System.currentTimeMillis();
        long execution2 = end2 - start2;
        System.out.println("The execution time for the merge sort is: "+execution2+"ms");

        array = new int[10000];
        array2 = new Object[10000];

        for (int i = 0; i < 10000; i++) {
            array[i] = new Random().nextInt(1000);
            array2[i] = new Random().nextInt(1000);
        }

        long start3 = System.currentTimeMillis();
        insertionSort.insertionSort(array, y);
        long end3 = System.currentTimeMillis();
        long execution3 = end3 - start3;
        long multiplied10Insertion = execution3/execution;

        long start4 = System.currentTimeMillis();
        mergeSort.sort(array2, comp);
        long end4 = System.currentTimeMillis();
        long execution4 = end4 - start4;
        long multiplied10Merge = execution4/execution2;
        System.out.println("By multiplying the size of the array by a factor of 10, the execution time of the MergeSort multiplied by "+multiplied10Merge+",  and InsertionSort by "+multiplied10Insertion+".");

        array = new int[100000];
        array2 = new Object[100000];

        for (int i = 0; i < 100000; i++) {
            array[i] = new Random().nextInt(1000);
            array2[i] = new Random().nextInt(1000);
        }

        long start5 = System.currentTimeMillis();
        insertionSort.insertionSort(array, y);
        long end5 = System.currentTimeMillis();
        long execution5 = end5 - start5;
        long multiplied10Insertion2 = execution5/execution;

        long start6 = System.currentTimeMillis();
        mergeSort.sort(array2, comp);
        long end6 = System.currentTimeMillis();
        long execution6 = end6 - start6;
        long multiplied10Merge2 = execution6/execution2;
        System.out.println("By multiplying the size of the array by a factor of 100, the execution time of the MergeSort multiplied by "+multiplied10Merge2+"ms,  and InsertionSort by "+multiplied10Insertion2+"ms.");

        array = new int[1000000];
        array2 = new Object[1000000];

        for (int i = 0; i < 1000000; i++) {
            array[i] = new Random().nextInt(1000);
            array2[i] = new Random().nextInt(1000);
        }

        long start7 = System.currentTimeMillis();
        insertionSort.insertionSort(array, y);
        long end7 = System.currentTimeMillis();
        long execution7 = end7 - start7;
        long multiplied10Insertion3 = execution7/execution;

        long start8 = System.currentTimeMillis();
        mergeSort.sort(array2, comp);
        long end8 = System.currentTimeMillis();
        long execution8 = end8 - start8;
        long multiplied10Merge3 = execution8/execution2;
        System.out.println("By multiplying the size of the array by a factor of 1000, the execution time of the MergeSort multiplied by "+multiplied10Merge3+",  and InsertionSort by "+multiplied10Insertion3+".");

    }

}
**/