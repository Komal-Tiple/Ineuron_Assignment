package com.assignment2;

import java.util.HashSet;
import java.util.Set;

public class Question1 {
	public void question1() {
		int[] array = {1, 2, 3, 4, 5, 2, 7, 3, 9, 4, 6, 5};

        Set<Integer> uniqueElements = new HashSet();
        Set<Integer> duplicateElements = new HashSet<>();

        for (int num : array) {
            if (!uniqueElements.add(num)) {
                duplicateElements.add(num);
            }
        }

        System.out.println("Duplicate elements in the array: " + duplicateElements);
  
	}
}
