package week_5;

public class Bai14 {
public static char[][] endodeTrue (String input, int key) {
	int row = checkRow(input, key);
	char[][]res = new char[row][key];
	input = input.replace(" ", "-");
	if(input.length() < row*key) {
		input = input + "-".repeat(row*key - input.length()); 
	}
	char[]inp = input.toCharArray();
	int index = 0;
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < key; j++) {
			res[i][j] = inp[index];
			index ++;
		}
	}
	
	
	return res;
}
//ma hoa tu 1 chuoi cho truoc
public static String toStringEncodeTrue (String inp, int key) {
	String s = "";
	char[][]input = endodeTrue(inp, key);
	for (int j = 0; j < input[0].length; j++) {
		for (int i = 0; i < input.length; i++) {
			s += input[i][j];
		}
	}
	return s;
}

public static char[][]encodeFalse(String input, int key){
	int row = checkRow(input, key);
	int index = 0;
	char[][]res = new char[row][key];
	char[]inp = input.toCharArray();
	for (int i = 0; i < key; i++) {
		for (int j = 0; j < row; j++) {
			res[j][i] = inp[index];
			index ++;
		}
	}
	
	return res;
}
//ma hoa nguoc de tim chuoi ban dau
public static String toStringEncodeFalse(String inp, int key) {
	String s = "";
	char[][]input = encodeFalse(inp, key);
	for (int i = 0; i < input.length; i++) {
		for (int j = 0; j < input[i].length; j++) {
			s += input[i][j];
 		}
	}
	s = s.replaceAll("-", " ");
	
	s = s.trim();
	return s;
}
public static int checkRow(String input, int key) {
	int row = 0;
	if (input.length() % key == 0) {
		row = input.length()/key;
	}
	else {
		row = input.length()/key + 1;
	}
	
	return row;
}
public static void print (char[][]arr) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	String s = "i am student";
	
	System.out.println("ma hoa chuoi s: " + toStringEncodeTrue(s, 5));
	String s1 = toStringEncodeTrue(s, 5);
	System.out.println("ma hoa nguoc de tim s: " + toStringEncodeFalse(s1, 5));

}
}
