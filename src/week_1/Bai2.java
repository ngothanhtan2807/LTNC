package week_1;

public class Bai2 {
public static boolean checkEven(int num) {
	if(num % 2 == 0) {
		return true;
	}
	else {
		return false;
	}
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
public static void main(String[] args) {
	
	System.out.println("check even 6: " + checkEven(6));
	System.out.println("check even 5: " + checkEven(5));
	System.out.println("check prime 6: " + checkPrime(6));
	System.out.println("check prime 5: " + checkPrime(5));
}
}
