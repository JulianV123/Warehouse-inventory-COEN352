package coen352.ch4.sort;

import java.util.Comparator;

/**
 All of the code written under the sort package was written in tutorial 4 with the help of the tutorial TA.
 */

public class MergeSort<T> implements ISort<T> {
    public void mergeSort(T[] a, int n, Comparator<T> comparator) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        T[] l = (T[]) new Object[mid];
        T[] r = (T[]) new Object[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid,comparator);
        mergeSort(r, n - mid,comparator);

        merge(a, l, r, mid, n - mid,comparator);
    }
    public void merge(T[] a, T[] l, T[] r, int left, int right, Comparator<T> comparator) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (comparator.compare(l[i], r[j]) <= 0)
            {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public void mergeSortDescending(T[] a, int n, Comparator<T> comparator) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        T[] l = (T[]) new Object[mid];
        T[] r = (T[]) new Object[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSortDescending(l, mid,comparator);
        mergeSortDescending(r, n - mid,comparator);

        mergeDescending(a, l, r, mid, n - mid,comparator);
    }

    public void mergeDescending(T[] a, T[] l, T[] r, int left, int right, Comparator<T> comparator) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (comparator.compare(l[i], r[j]) >= 0)
            {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    @Override
    public void sort(T[] array, Comparator<T> comparator, String order) {

        if(order.equals("ascending")) {
            mergeSort(array, array.length, comparator);
        }

        if (order.equals("descending")) {
            mergeSortDescending(array, array.length, comparator);
        }
     }
}
