package Test;

import java.util.Scanner;

public class HelloWolrd {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("First Number: ");

		int First = scanner.nextInt();

		System.out.println("Second Number: ");

		int Second = scanner.nextInt();

		System.out.println("Min: " + Math.min(First, Second));
		scanner.close();
	}
}
