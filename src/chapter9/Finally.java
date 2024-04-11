package chapter9;

import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		try {

		} catch (Exception e) {
			// TODO: handle exception
		}

		finally {
			sc.close();
		}
	}
}
