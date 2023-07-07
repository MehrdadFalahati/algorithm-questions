package com.mehrdad.falahati.algorithms.sorting;

public class QuickSort implements ISort {
    public void sort(int[] arrays) {
        sort(arrays, 0, arrays.length - 1);
    }

    private void sort(int[] arrays, int start, int end) {
        if (start >= end)
            return;

        var boundary = partition(arrays, start, end);

        sort(arrays, start, boundary - 1);

        sort(arrays, boundary + 1, end);
    }

    private int partition(int[] arrays, int start, int end) {
        var pivot = arrays[end];
        int boundary = start - 1;
        for (int i = start; i <= end; i++) {
            if ((arrays[i]) <= pivot) {
                swap(arrays, i, ++boundary);
            }
        }
        return boundary;
    }
}
