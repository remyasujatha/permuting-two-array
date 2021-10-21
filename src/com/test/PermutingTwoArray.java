package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutingTwoArray {
	public static void main(String[] args) {
		System.out.println(twoArrays(10, new ArrayList<Integer>(Arrays.asList(2, 1, 3)),
				new ArrayList<Integer>(Arrays.asList(7, 8, 9))));

		System.out.println(twoArrays(5, new ArrayList<Integer>(Arrays.asList(1, 2, 2, 1)),
				new ArrayList<Integer>(Arrays.asList(3, 3, 3, 4))));

	}

	public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
		String result = "NO";
		int iterator = B.size();
		if (A.size() < iterator) {
			iterator = A.size();
		}
		for (int i = 0; i < iterator; i++) {
			if (A.get(i) + B.get(i) >= k) {
				if (result.equalsIgnoreCase("NO")) {
					result = "YES";
				} else {
					return "NO";
				}

			}
		}
		return result;
	}
}
