package Lab02;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao nghiem A cua phuong trinh: ");
		int a = sc.nextInt();
		System.out.println("Nhap vao nghiem B cua phuong trinh: ");
		int b = sc.nextInt();
		System.out.println("Nhap vao nghiem C cua phuong trinh: ");
		int c = sc.nextInt();
		if (a == 0) {
			System.out.printf("Giai pt bac nhat %dx + %d = 0 \n", b, c);
			if (b == 0 && c == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			} else if (b == 0 && c != 0) {
				System.out.println("Phuong trinh vo ngiem");
			} else {
				float requal = (float) -b / c;
				System.out.println("Ngiem cua phuong trinh la: " + requal);
			}
		} else {
			System.out.printf("Giai pt bac hai %dx^2 + %dx + %d = 0 \n", a, b, c);
			int delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo ngiem");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.println("Phuong trinh nghiem kep: " + x);
			} else {
				double requal1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
				double requal2 = (double) (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Ngiem cua phuong trinh la 2 nghiem rieng biet : " + requal1 + " va" + requal2);
			}
		}
		sc.close();
	}
}
