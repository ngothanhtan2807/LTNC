package week_6;

import java.util.Iterator;

public class Bai17 {
public static int max(int[]arr) {
	int max = arr[0];
	for (int i = 1; i < arr.length; i++) {
		if(max < arr[i]) {
			max = arr[i];
		}
	}
	return max;
}
public static int min(int[]arr) {
	int min = arr[0];
	for (int i = 1; i < arr.length; i++) {
		if(min > arr[i]) {
			min = arr[i];
		}
	}
	return min;
}
public static int findMaxFirst (int[]arr) {
	int max = max(arr);
	int res = 0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] == max) {
			res = i;
			break;
		}
	}
	return res;
}
public static int findMinFirst (int[]arr) {
	int min = min(arr);
	int res = 0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] == min) {
			res = i;
			break;
		}
	}
	return res;
}
public static int sumMax(int[]arr) {
	int sum = 0;
	int max = max(arr);
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] == max) {
			sum = sum + arr[i];
		}
	}
	return sum;
}
public static void main(String[] args) {
	int[]arr= {1,3,5,6,7,4,7,8,8};
	System.out.println(max(arr));
	System.out.println(min(arr));
	System.out.println(findMaxFirst(arr));
	System.out.println(findMinFirst(arr));
	System.out.println(sumMax(arr));
}
}
