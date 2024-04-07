package Test;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Chieu dai cua hinh chu nhat");
		int chieuDai = sc.nextInt();
		System.out.println("Enter Chieu rong cua hinh chu nhat:");
		int chieuRong = sc.nextInt();
		int chuVi = (chieuDai + chieuRong) * 2;
		int dienTich = (chieuDai * chieuRong);
		System.out.println("Chu vi" + chuVi);
		System.out.println("Dien tich" + dienTich);
		System.out.println("Canh nho nhat" + chieuRong);
	}
}
