package week_3;

public class Bai8 {
	public static String xorForChar(String input, char x) {
		String res = "";
		char[] charInput = input.toCharArray();
		for (int i = 0; i < charInput.length; i++) {
			res += (char) (charInput[i]^x);
		}

		return res;
	}
	
	public static String xorForString (String inp, String key) {
		String res = "";
		char[] charInput = inp.toCharArray();
		char[] charKey = key.toCharArray();
		for (int i = 0; i < charInput.length; i++) {
			for (int j = 0; j < charKey.length; j++) {
				res += (char)(charInput[i] ^ charKey[j]);
			}
		}
		return res;
	}
	
	public static String convert (String inp, String key) {
		String res = "";
		char[] charInput = inp.toCharArray();
		char[] charKey = key.toCharArray();
		for (int i = 0; i < charInput.length; i+= charKey.length) {
			
				res += (char)(charInput[i]^charKey[0]);
		}
		return res;
	}

	public static void main(String[] args) {
		
		String inp = "lap trinh nang cao";
		String out = xorForChar(inp, 'n');
		
		System.out.println("ma hoa voi 1 ky tu là n: " + xorForChar(inp, 'n'));
		System.out.println("giai ma lai sau khi ma hoa voi ky tu n: " + xorForChar(out, 'n'));

		String out1 = xorForString(inp, "ltnc");
		System.out.println("ma hoa voi 1 chuoi ltnc: " + out1);
		System.out.println("giai ma sau khi ma hoa voi chuoi ltnc: " +convert(out1, "ltnc"));		

	}
}
