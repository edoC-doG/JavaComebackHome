package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap kich thuoc cua mang");
		int x = sc.nextInt();
		int[] a = new int[x];
		for (int i = 0; i < x; i++) {
			System.out.println("Nhap vao phan tu cua mang tai vi tri " + i + ":");
			a[i] = sc.nextInt();
		}
		System.out.println("Array ban dau: " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array sau khi sort: " + Arrays.toString(a));
		System.out.println("Thanh phan lon nhat trong mang: " + a[x - 1]);
		System.out.println("Thanh phan lon nhat trong mang: " + a[0]);
		sc.close();
	}
}
