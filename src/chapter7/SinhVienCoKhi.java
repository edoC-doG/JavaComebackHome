package chapter7;

public class SinhVienCoKhi extends SinhVien {
	public SinhVienCoKhi(String id, String name, double price, double tax) {
		super(id, name, price, tax);
		// TODO Auto-generated constructor stub
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	private String skills;

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}
}
