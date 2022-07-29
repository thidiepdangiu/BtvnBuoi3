import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		String s;
		String s1 = "";
		String s2 = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập vào một chuỗi: ");
		s = sc.nextLine();
		System.out.println("\n");
		System.out.println("Chuỗi vừa nhập là: " + s);
		
		s = s.trim().toLowerCase();//xóa khoảng trắng đầu cuối và viết thường tất cả các kí tự
		
		int n = s.length();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				s2 = s2 + "";
			} else
				s2 = s2 + s.charAt(i);
		}
		
		String d[] = s2.split(" ");
		for (int i = 0; i < d.length; i++) {
			if (d[i].length() != 0) {
				s1 += d[i].substring(0, 1).toUpperCase() + d[i].substring(1);//viết hoa chữ cái đầu tiên
			}
			if(i<d.length -1) {
				s1+=" ";
			}
		}
		System.out.println("\n");
		System.out.println("Chuỗi sau khi chuẩn hóa là: " + s1);
	}
}
