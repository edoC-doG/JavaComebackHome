package p2;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Nhap X");
			try {
				int a = sc.nextInt();
				System.out.println("Ket qua: " + a);
				break;
			} catch (Exception e) {
				sc.next();
				System.out.println("Error");
			}
		}
	}
}
