package classes;

public class Nota {
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	private int media;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum3() {
		return num3;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	public int getNum4() {
		return num4;
	}
	public void setNum4(int num4) {
		this.num4 = num4;
	}
	
	public String getMedia() {
		return "A média é " + this.media;
	}
	public void setMedia() {
		this.media = (this.num1+this.num2+this.num3+this.num4) / 4;
	}
	
	
}
