package week_2;

public class Bai4 {
	public static int[] arrayPlus(int[] arr1, int[] arr2) {
		int[]res = new int[arr1.length < arr2.length? arr2.length:arr1.length];
		for(int i = 0; i < checkLength(arr1, arr2); i ++) {
			res[i] = arr1[i]+arr2[i];
		}
		for (int i = checkLength(arr1, arr2); i < res.length; i ++) {
			res[i] = checkArr(arr1, arr2)[i];
		}
		return res;
	}
	//tim length cua mang co length nho hon
public static int checkLength (int[]arr1, int[]arr2) {
	return arr1.length > arr2.length? arr2.length:arr1.length;
	
}
//tim mang co length lon hon
public static int[] checkArr(int[]arr1, int[]arr2) {
	if(arr1.length < arr2.length) {
		return arr2;
	}
	else {
		return arr1;
	}
}
public static void print(int[]arr) {
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
}

public static void main(String[] args) {
	
	int[]arr1 = {1,2,3,4};
	int[]arr2 = {1,2,3,4,5};
	print(arrayPlus(arr1, arr2));
}
}
