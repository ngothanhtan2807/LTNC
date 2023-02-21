package week_5;

public class Bai15 {
public static double sum(double x, int n) {
	double sum = 0;
	for (int i = 0; i <= n; i++) {
		sum += Math.pow(x, i);
	}
	return sum;
}
public static double sumIf(double x, int n) {
	double sum = 0;
	for (int i = 0; i <= n; i++) {
		sum += Math.pow(x, i)*Math.pow(-1, i);
	}
	return sum;
}

public static double giaithua (int num) {
	double sum = 1;
	if(num == 0) {
		sum  = 1;
	}
	else {
		for (int i = 1; i <= num; i++) {
			sum = sum * i;
		}
	}
	return sum;
}
public static double sumGiaiThua(double x, int n) {
	double sum = 0;
	for (int i = 0; i <= n; i++) {
		sum = sum + Math.pow(x, i)/giaithua(i);
		
	}
	return sum;
}
public static void main(String[] args) {
	System.out.println(sum(4, 3));

	System.out.println(sumIf(4, 3));

	System.out.println(giaithua(3));
	System.out.println(sumGiaiThua(3, 3));
}
}
