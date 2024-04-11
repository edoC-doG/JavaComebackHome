package chapter9;

import java.util.Scanner;

public class Bai01 {
	public static Scanner sc = new Scanner(System.in);

	public static int nhapMaSv() {
		int res;
		while (true) {
			System.out.println("Nhap ma sv");
			try {
				res = sc.nextInt();
				sc.nextLine();
				break;
			} catch (Exception e) {
				System.out.println("Ma so sinh vien khong hop le");
				sc.next();
			}
		}
		return res;
	}

	public static String hotenSv() {
		String hoten = null;
		System.out.println("Nhap hotenSv");
		while (sc.hasNextLine()) {
			hoten = sc.nextLine();
			break;
		}
		return hoten;
	}

	public static double diemSv() {
		double res;
		while (true) {
			System.out.println("Nhap diemSv");
			try {
				res = sc.nextDouble();
				if (res <= 0 || res >= 10) {
					System.out.println("diemSv khong hop le");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("diemSv la so thuc");
//				sc.next();
			}
		}
		return res;
	}

	public static int tuoiSv() {
		int res;
		while (true) {
			System.out.println("Nhap tuoiSv");
			try {
				res = sc.nextInt();
				if (res <= 18 || res >= 100) {
					System.out.println("tuoiSv khong hop le");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("tuoiSv la so");
				sc.next();
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int masv = nhapMaSv();
		String hoten = hotenSv();
		double diem = diemSv();
		int tuoi = tuoiSv();
		SinhVien sv = new SinhVien(masv, hoten, diem, tuoi);
		System.out.println("MSSS: " + sv);
		sc.close();
	}
}
