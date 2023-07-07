package com.mehrdad.falahati.algorithms.sorting;

public class SelectionSort implements ISort {

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
}
