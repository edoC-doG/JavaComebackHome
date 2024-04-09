package chapter7;

public class SinhVienIT extends SinhVien {

	private String language;

	public SinhVienIT(String id, String name, double price, double tax, String language) {
		super(id, name, price, tax);
		this.setLanguage(language);
	}

	public void getMoney() {
		System.out.println("Run get money");
//		this.info();// goi ham co trong class
		super.info(); // Uu tien lay trong ham parent
	}

	public void info() {
		System.out.println("Sinh Vien It");
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}
}
