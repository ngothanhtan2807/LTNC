package week_3;

public class Bai6 {
	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] createPascalTriangle(int size) {
		int[][] res = new int[size][];
		for (int i = 0; i < size; i++) {// 0
			res[i] = new int[i + 1];

			int value = 1;
			for (int j = 0; j <= i; j++) {
				res[i][j] = value;
				value++;
			}
		}
		return res;
		
	}
public static int[][] createPascalTriangle(int[] diagonalValues){
	int[][]res = new int[diagonalValues.length][];
	for (int i = 0; i < res.length; i++) {
		res[i] = new int[i+1];
		for (int j = 0; j< res[i].length; j++) {
			res[i][j] = diagonalValues[i]+(j-i);
//			System.out.println(res[i][j]);
		}
		
	}
	
	return res;
}
	public static void main(String[] args) {
		
		int[][] arr = { { 1, 2, 3 }, { 2, 1, 5 }, { 1, 4, 5 } };
		int[]arr1 = {1,5,2,0};
	printMatrix(arr);
	System.out.println("---------------------------");
	printMatrix(createPascalTriangle(arr1));
	System.out.println("---------------------------");
	printMatrix(createPascalTriangle(4));
	}
}
