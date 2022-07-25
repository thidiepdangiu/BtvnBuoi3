import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		String s;
		String s1 = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập vào một chuỗi: ");
		s = sc.nextLine();
		System.out.println("\n");
		System.out.println("Chuỗi vừa nhập là: " + s);
		
		s = s.trim().toLowerCase();//xóa khoảng trắng đầu cuối và viết thường tất cả các kí tự
		
		int n = s.length();
		for (int i = 0; i < n; i++) {
			if ((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57) {
				s=xoakt(s, i);//xóa kí tự số
				i--;
				n--;
			}
		}
		
		String d[] = s.split(" ");
		for (int i = 0; i < d.length; i++) {
			if (d[i].length() != 0) {
				s1 += d[i].substring(0, 1).toUpperCase() + d[i].substring(1) + " ";//viết hoa chữ cái đầu tiên
			}
		}
		System.out.println("\n");
		System.out.println("Chuỗi sau khi chuẩn hóa là: " + s1);
	}

	public static String xoakt(String s, int k) {
		return s.substring(0, k) + s.substring(k + 1);
	}
}
