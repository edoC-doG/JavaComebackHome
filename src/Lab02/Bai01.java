package Lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao nghiem A cua phuong trinh: ");
		int a = sc.nextInt();
		System.out.println("Nhap vao nghiem B cua phuong trinh: ");
		int b = sc.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo ngiem");
		} else {
			int c = -b / a;
			System.out.println("Ngiem cua phuong trinh la: " + c);
		}
		sc.close();
	}
}
