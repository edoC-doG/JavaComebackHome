package chapter4;

public class Students {
	// class attribute
	private String name;
	private int age;
	String fullName;
	String firstName;
	String emailAddress;

	public Students() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Students(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// class method
	public void learnJava() {
		System.out.println("Learn Java again 3!!!");

	}

}
