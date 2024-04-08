package Test;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lựa chọn của bạn là : ");
		int value = scanner.nextInt();
		switch (value) {
		case 1:
			System.out.println("Cong");
			break;
		case 2:
			System.out.println("Tru");
			break;
		default:
			System.out.println("Thoat ");
			System.exit(0);
		}
		scanner.close();
	}
}
