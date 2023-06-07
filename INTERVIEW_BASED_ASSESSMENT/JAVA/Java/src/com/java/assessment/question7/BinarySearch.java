package com.java.assessment.question7;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	 public void BinarySearchExample() {
	        // Sorted array
	        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

	        // Get user input for the target value
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the target value: ");
	        int target = scanner.nextInt();

	        // Perform binary search
	        int index = binarySearch(numbers, target);

	        // Print the result
	        if (index != -1) {
	            System.out.println("Target value found at index: " + index);
	        } else {
	            System.out.println("Target value not found");
	        }
	    }

	    private static int binarySearch(int[] array, int target) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (array[mid] == target) {
	                return mid; // Target value found
	            } else if (array[mid] < target) {
	                left = mid + 1; // Search in the right half
	            } else {
	                right = mid - 1; // Search in the left half
	            }
	        }

	        return -1; // Target value not found
	    }
}


   

