package week_1;

public class Bai3 {
	public static int countDigit(int num) {
		int count = 0;
		while(num > 0) {
			num = num /10;
			count ++;
		}
		return count;
	}
	public static void main(String[] args) {
		
		System.out.println(countDigit(1234567890));
	}
}
