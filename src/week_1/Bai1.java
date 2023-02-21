package week_1;

public class Bai1 {
	public static int roundNumber(float number) {
		int res = 0;
		float num = (int) (number / 1);
		float du = (float) (number % 1);
		if (du * 10 < 5) {
			res = (int) num;
		} else {
			res = (int) (num + 1);
		}
		return res;
	}

	public static void main(String[] args) {
		
		System.out.println(roundNumber(5.4f));
	}
}
