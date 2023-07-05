package com.mehrdad.falahati.algorithms.sorting;

import java.util.stream.IntStream;

public class SelectionSort {

    public void sort(int[] arrays) {
        for (var i = 0; i < arrays.length - 1; i++){
            var minIndex = i;
            for (var j = i + 1; j < arrays.length; j++){
                if (arrays[j] < arrays[minIndex]) {
                    minIndex = j;
                }
            }

            swap(arrays, minIndex, i);
        }
    }

    private void swap(int[] array, int minIndex, int index) {
        int temp = array[minIndex];
        array[minIndex] = array[index];
        array[index] = temp;
    }
}
