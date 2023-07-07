package com.mehrdad.falahati.algorithms.sorting;

public interface ISort {
    void sort(int[] arrays);

    default void swap(int[] array, int minIndex, int index) {
        int temp = array[minIndex];
        array[minIndex] = array[index];
        array[index] = temp;
    }
}
