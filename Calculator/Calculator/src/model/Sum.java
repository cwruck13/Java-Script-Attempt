package model;

//Cassandra Wruck

public class Sum {
	
    private int sum;
	private int number1;
	private int number2;
	private int number3;
	private int number4;
	
	public Sum() {
		super();
	}

	public Sum(int number1, int number2, int number3, int number4) {
		// TODO Auto-generated constructor stub
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
		this.number4 = number4;
		setAnswer(number1, number2, number3, number4);
		
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
		setAnswer(number1, number2, number3, number4);
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getNumber3() {
		return number3;
	}

	public void setNumber3(int number3) {
		this.number3 = number3;
	}

	public int getNumber4() {
		return number4;
	}

	public void setNumber4(int number4) {
		this.number4 = number4;
	}
	
	public void setAnswer(int number1, int number2, int number3, int number4) {

		sum = number1 + number2 + number3 + number4;
	}

	@Override
	public String toString() {
		return "Sum [sum=" + sum + ", number1=" + number1 + ", number2=" + number2 + ", number3=" + number3
				+ ", number4=" + number4 + "]";
	}


}
