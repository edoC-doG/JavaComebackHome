package Chapter05;

import java.util.ArrayList;

public class ArrayL {
	public static void main(String[] args) {
		int a = 10;
		ArrayList<Object> a1 = new ArrayList<Object>();
		a1.add(1);
		a1.add(a);
		a1.add("Long");

		System.out.println("Mang:" + a1.toString());
	}
}
