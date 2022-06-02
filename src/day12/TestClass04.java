package day12;

public class TestClass04 {
	private int kor, eng, math, sum;
	private double avg;
	
	public int getKor() {
		return this.kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		this.sum = kor + eng + math;
	}
	public double getAvg() {
		return sum/3.0;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	

}
