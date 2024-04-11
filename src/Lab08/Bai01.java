package Lab08;

public class Bai01 {
	public static void main(String[] args) {
		Student sv = new Student("SE123", "Long", 10, 7);
		System.out.println("TEST: " + sv);
		sv.setGrade();
		System.out.println("TEST: " + sv);
	}
}
