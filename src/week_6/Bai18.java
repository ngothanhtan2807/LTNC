package week_6;

import java.util.Iterator;

public class Bai18 {
public static boolean isTriangle (int[][]arr) {
	boolean trig = false;
	
	return trig;
}
public static int[][] plus(int[][]arr1, int[][]arr2) {
	int[][] res = new int [arr1.length][arr1[0].length];
	if(arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				res[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
	}
	else {
		System.out.println("can't plus");
	}
	return res;
}
public static int[][]multiply(int[][]arr1, int[][]arr2){
	int[][]res = new int[arr1.length][arr2[0].length];
	if(arr1[0].length == arr2.length) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				for (int k = 0; k < arr2.length; k++) {
					res[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
	}
	
	
	return res;
}
public static void print(int[][]arr) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	int[][]arr1 = {{1,2,3},{1,4,6},{1,6,3}};
	int[][]arr2 = {{1,2,3},{1,4,6},{1,6,3}};
//	print(plus(arr1, arr2));
	
	int[][]arr3 = {{2,3,4},{1,0,0}};
	int[][]arr4 = {{0,1000}, {1,100}, {0,10}};
	print(multiply(arr3, arr4));
}
}
