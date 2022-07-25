import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		int a[];
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập vào số phần tử mảng: ");
		n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập vào phần tử thứ " + i + ": ");
			a[i] = sc.nextInt();
		}
		System.out.print("Trung bình cộng của các số lẻ ở vị trí chẵn là: " + tbc(a, n));
		System.out.print("\n");
		vtmin(a, n);
		System.out.print("\n");
		scp(a, n);
		System.out.print("\n");
		snt(a, n);
		System.out.print("\n");
		sapxep(a, n);
	}

	public static float tbc(int a[], int n) {
		int s = 0, count = 0;
		for (int i = 0; i < n; i += 2) {
			if (a[i] % 2 != 0) {
				s += a[i];
				count++;
			}
		}
		return (float) s / count;
	}

	public static int min(int a[], int n) {
		int min = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public static void vtmin(int a[], int n) {
		System.out.print("Vị trí các số nhỏ nhất trong mảng là: ");
		for (int i = 0; i < n; i++) {
			if (a[i] == min(a, n)) {
				System.out.print(i + " ");
			}
		}
	}

	public static int scp(int n) {
		int x = (int) Math.sqrt(n);
		if (Math.pow(x, 2) == n)
			return 1;
		else
			return 0;
	}

	public static void scp(int a[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (scp(a[i]) == 1) {
				count++;
			}
		}
		if (count != 0) {
			System.out.print("Các số là số chính phương là: ");
			for (int i = 0; i < n; i++) {
				if (scp(a[i]) == 1) {
					System.out.print(a[i] + " ");
				}
			}
		} else
			System.out.println("Trong mảng không có số chính phương nào.");
	}

	public static int snt(int n) {
		int count = 0;
		if (n < 2)
			return 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0)
			return 1;
		else
			return 0;
	}

	public static void snt(int a[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (snt(a[i]) == 1) {
				count++;
			}
		}
		if (count != 0) {
			System.out.print("Các số nguyên tố có trong mảng là: ");
			for (int i = 0; i < n; i++) {
				if (snt(a[i]) == 1) {
					System.out.print(a[i] + " ");
				}
			}
		} else
			System.out.println("Trong mảng không có số nguyên tố.");
	}

	public static void sapxep(int a[], int n) {
		int tg;
		for (int i = 0; i < n; i++) {
			for(int j=i+1;j<n;j++) {
			if (a[i] > a[j]) {
				tg = a[i];
				a[i] = a[j];
				a[j] = tg;
			}
			}
		}
		System.out.print("Sắp xếp mảng theo thứ tự tăng dần là: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

