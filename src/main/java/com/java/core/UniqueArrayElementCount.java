package com.java.core;

import java.util.Arrays;

public class UniqueArrayElementCount {

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }; // Input array
		System.out.println("Numbers Before:" + Arrays.stream(nums).boxed().toList());
		int k = removeDuplicates(nums); // Calls your implementation
		System.out.println("Numbers After:" + Arrays.stream(nums).boxed().toList());
		System.out.println("unique count::" + k);
	}

	public static int removeDuplicates(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}
		int i = 0;

		for (int j = i + 1; j < nums.length; j++) {

			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}

		}

		return i + 1;
	}

}
