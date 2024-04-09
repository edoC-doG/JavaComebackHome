package Chapter05;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {

		ArrayList<Double> list = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Nhap phan tu cua Array list: ");
			Double x = scanner.nextDouble();
			list.add(x);
			scanner.nextLine();

			System.out.println("Nhập thêm (Y/N):");
			String option = scanner.nextLine();
			if (option.equals("N") || option.equals("n")) { // why using equals ?
				break;
			}
		}
		int sum = 0;
		int lenght = list.size();
		for (int i = 0; i < lenght; i++) {
			sum += list.get(i);
		}
		System.out.println("Tong cua array list la: " + sum);
		scanner.close();
	}
}
