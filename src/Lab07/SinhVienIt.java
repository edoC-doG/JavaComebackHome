package Lab07;

public class SinhVienIt extends SinhVien {
	private double scoreJava;
	private double scoreHTML;

	public SinhVienIt(String id, String name, double price, double tax, double scoreJava, double scoreHTML) {
		super(id, name, price, tax);
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	@Override
	double getDiem() {
		// TODO Auto-generated method stub
		return (this.scoreJava * 2 + this.scoreHTML) / 3;
	}

}
