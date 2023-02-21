package week_3;

public class Bai9 {
	public static String addComma(int num) {
		String result = "";
		while (true) {
			if (num / 1000 != 0) {
				int soDu = num % 1000;
				if (soDu > 100) {
					result = ", " + soDu + result;
				} else if (soDu >= 10) {
					result = ", " + "0".repeat(1) + soDu + result;
				}

				else if (soDu >= 0) {
					result = ", " + "0".repeat(2) + soDu + result;

				}

				num = num / 1000;
			} else {
				result = num + result;
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(addComma(123000001));
	}
}