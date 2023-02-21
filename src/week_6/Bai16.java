package week_6;

public class Bai16 {
public static boolean subArray(int[]input, int[]key) {
	boolean sub = true;
	int count = 0;
	if(input.length < key.length) {
		sub = false;
	}
	else {
		for (int i = 0; i < input.length - key.length + 1; i++) {
			if(count == key.length) {
				break;
			}
			else {
				for (int j = 0; j < key.length; j++) {
					if(input[i + j] != key[j]) {
						sub = false;
						break;
					}
					else {
						sub = true;
						count ++;
					}
				}
			}
		}
	}
	
	
	return sub;
}
public static void main(String[] args) {
	int[]inp = {1,3,4,5,4,3};
	int[]key = {1,3,4,5,4,3};
	System.out.println(subArray(inp, key));
}
}
