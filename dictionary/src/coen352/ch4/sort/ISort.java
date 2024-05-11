package coen352.ch4.sort;

/**
 All of the code written under the sort package was written in tutorial 4 with the help of the tutorial TA.
 */

import java.util.Comparator;

public interface ISort<T> {
    void sort(T[] arr, Comparator<T> comparator, String order);
}
