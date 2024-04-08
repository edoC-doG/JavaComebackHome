package Lab03;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number : ");
		int a = sc.nextInt();
		int count = 0;
		for (int i = 2; i <= a - 1; i++) {
			if (a % i == 0) {
				System.out.println("Orther requal: " + i);
			}
		}
		if (count == 0) {
			System.out.println("Day la so nguyen to ");
		} else {
			System.out.println("Day khong phai la so nguyen to");
		}
		sc.close();
	}
}
