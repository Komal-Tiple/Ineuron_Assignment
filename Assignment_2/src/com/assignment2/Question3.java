package com.assignment2;

public class Question3 {
	public void question3() {
		int[] array = {9, 5, 1, 8, 3, 2, 7, 6, 4};

        System.out.println("Original array: ");
        printArray(array);

        bubbleSort(array);

        System.out.println("Sorted array: ");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
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
