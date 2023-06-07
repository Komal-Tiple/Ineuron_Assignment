package com.java.assessment.question10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class SecondLargestSmallest {

	
    public void secondLarsmall() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        if (numbers.size() < 2) {
            System.out.println("Insufficient elements in the list.");
            return;
        }

        // Find the second largest and second smallest elements
        int secondLargest = findSecondLargest(numbers);
        int secondSmallest = findSecondSmallest(numbers);

        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second smallest element: " + secondSmallest);
    }

    private static int findSecondLargest(List<Integer> numbers) {
        Collections.sort(numbers, Collections.reverseOrder());
        return numbers.get(1);
    }

    private static int findSecondSmallest(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers.get(1);
    }
}





