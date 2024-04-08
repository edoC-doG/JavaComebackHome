package Test;

import java.util.Scanner;

public class HelloWolrd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tien cua ban de tinh thue :");
		int tax = sc.nextInt();
		if (tax < 10) {
			System.out.println(" Khong dong thue");
		} else if (10 < tax && tax < 15) {
			System.out.println(" Thue 10&");
		} else if (15 < tax && tax < 30) {
			System.out.println(" Thue 20&");
		} else {
			System.out.println(" Thue 30&");
		}
		sc.close();
	}
}
