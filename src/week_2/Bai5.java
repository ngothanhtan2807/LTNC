package week_2;

public class Bai5 {
public static int[]countPrime(int number, int count){
	int[]res = new int[count];
	int dk = 0;
	while(dk < count) {
		number +=1;
		if(checkPrime(number)) {
			res[dk] = number;
			dk ++;
		}
	}
	return res;
}
public static boolean checkPrime(int num) {
	int count = 0;
	for (int i = 1; i <= num; i ++) {
		if(num % i == 0) {
			count ++;
		}
	}
	if(count == 2) {
		return true;
	}
	else {
		return false;
	}
}
public static void print(int[]arr) {
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
}
public static void main(String[] args) {
	print(countPrime(1, 5));
}
}
