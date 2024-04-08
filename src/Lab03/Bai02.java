package Lab03;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 1 so de co bang cuu chuong: ");
		int a = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			int x = a * i;
			System.out.printf("%d x %d = %d \n", a, i, x);
		}
		sc.close();
	}
}
