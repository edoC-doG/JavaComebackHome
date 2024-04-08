package Lab04;

import java.util.Scanner;

public class BaiTap {
	public static void main(String[] args) {
		Product test = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten san pham");
		String namePr = sc.nextLine();
		System.out.println("Nhap gia tien san pham");
		double pricePr = sc.nextDouble();
		System.out.println("Nhap thue san pham");
		double taxPr = sc.nextDouble();
		Product pr1 = test.nhapThongTin(namePr, pricePr, taxPr);
		test.xuatThongTin(pr1);
		System.out.println(" tax = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}

}
