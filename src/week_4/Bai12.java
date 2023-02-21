package week_4;

public class Bai12 {
public static String convertDate (String date) {
	String[]arr = date.split("/");
	int day = Integer.parseInt(arr[0]);
	int month = Integer.parseInt(arr[1]);
	int year = Integer.parseInt(arr[2]);
	String res = "";
	if(day > 31 || month > 12) {
		res = "date wrong format";
	}
	else {
	 res = day + " ";
	switch (month) {
	case 1:
		res = res + "Jan ";
		break;
	case 2:
		res = res +"Feb " ;
		break;
	case 3:
		res = res +"Mar " ;
		break;
	case 4:
		res = res +"Apr " ;
		break;
	case 5:
		res = res +"May "  ;
		break;
	case 6:
		res = res +"Jun " ;
		break;
	case 7:
		res = res +"Jul " ;
		break;
	case 8:
		res = res +"Aur " ;
		break;
	case 9:
		res = res +"Sep " ;
		break;
	case 10:
		res = res +"Oct " ;
		break;
	case 11:
		res = res +"Nov "  ;
		break;
	case 12:
		res = res +"Dec " ;
		break;
	}
	res = res + year;
	}
	return res;
}
public static void main(String[] args) {
System.out.println(convertDate("30/1/2000"));
}
}
