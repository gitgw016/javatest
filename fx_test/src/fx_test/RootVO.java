package fx_test;

public class RootVO {
	private String name;
	private double korean;
	private double math;
	private double english;
	
	public RootVO() {}
	
	public RootVO(String name, double korean, double math, double english) {
		this.name = name;
		this.korean = korean;
		this.math = math;
		this.english = english;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKorean() {
		return korean;
	}

	public void setKorean(double korean) {
		this.korean = korean;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	@Override
	public String toString() {
		return "RootVO [name=" + name + ", korean=" + korean + ", math=" + math + ", english=" + english + "]";
	}
	
}
