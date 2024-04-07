package Test;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of Student:");
		String name = sc.nextLine();
		System.out.println("Enter Age of Student:");
		int age = sc.nextInt();
		System.out.println("Name: " + name + "Age: " + age);
	}
}
