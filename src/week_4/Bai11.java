package week_4;

import java.util.Random;

public class Bai11 {
	public static int[] subArray(int[] arr, int qty) {
		int[]res = new int[qty];
		int[]random = randomArr(arr);
		for (int i = 0; i < res.length; i++) {
			res[i] = random[i];
		}
		
		return res;
	}
	public static int[]randomArr(int[]arr) {
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			int index1 = rd.nextInt(arr.length);
			int index2 = rd.nextInt(arr.length);
			swap(arr, index1, index2);
		}
		return arr;
	}
	public static void swap(int[]arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void print (int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[]arr = {1,3,5,6,8,2};
//		swap(arr, 1, 4);
		print(subArray(arr, 3));
	}
}
