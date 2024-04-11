package chapter9;

public class SinhVien {
	private int masv;
	private String hoten;
	private double diem;
	private int age;

	public int getMasv() {
		return masv;
	}

	public String getHoten() {
		return hoten;
	}

	public double getDiem() {
		return diem;
	}

	public int getAge() {
		return age;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public void setAge(int age) {
//		if (18 < this.age < 100) {
//			System.out.println("Tuoi khong hop le");
//		}
		this.age = age;
	}

	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", hoten=" + hoten + ", diem=" + diem + ", age=" + age + "]";
	}

	public SinhVien(int masv, String hoten, double diem, int age) {
		this.masv = masv;
		this.hoten = hoten;
		this.diem = diem;
		this.age = age;
	}

}
