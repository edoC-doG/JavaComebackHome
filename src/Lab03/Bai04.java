package Lab03;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap kich thuoc cua mang");
		int x = sc.nextInt();
		int[] a = new int[x];
		int sum = 0;
		for (int i = 0; i < x; i++) {
			System.out.println("Nhap vao phan tu cua mang tai vi tri " + i + ":");
			a[i] = sc.nextInt();
			if (a[i] % 5 == 0) {
				sum += a[i];
			}
		}
		sc.close();
		System.out.println("Tong cac so chia het cho 5 co trong mang: " + sum);
	}
}
