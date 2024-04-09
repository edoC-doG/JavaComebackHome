package chapter6;

import java.util.ArrayList;

public class Bai01 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Username :");
//		String userName = sc.nextLine();
//		System.out.println("Password:");
//		String pwd = sc.nextLine();
//		if (userName.equals("Long") && pwd.length() > 6) {
//			System.out.println("Valid");
//		} else {
//			System.out.println("Invalid");
//		}
		Student st1 = new Student("Long01", "1");
		Student st2 = new Student("Long02", "2");
		Student st3 = new Student("Long03", "3");
		Student st4 = new Student("Long04", "4");
		Student st5 = new Student("Long05", "5");

		ArrayList<Student> a = new ArrayList<Student>();
		a.add(st5);
		a.add(st4);
		a.add(st3);
		a.add(st2);
		a.add(st1);
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getName().endsWith("05")) {
				System.out.println("Ten can tim " + a.get(i));
			}
		}
		System.out.println("In ra" + a);
	}
}
