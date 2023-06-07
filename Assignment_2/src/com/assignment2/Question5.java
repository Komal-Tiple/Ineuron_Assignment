package com.assignment2;

public class Question5 {
	public void question5() {
		int[] array = {9, 5, 1, 8, 3, 2, 7, 6, 4};

        System.out.println("Original array: ");
        printArray(array);

        selectionSort(array);

        System.out.println("Sorted array: ");
        printArray(array);
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
	}
}
