package studio7;

public class Complex {
	private double a;
	private double b;
	
	public Complex(double inta, double intb) {
		a = inta;
		b = intb;
	}
	public double GetA() {
		return a;
	}
	public double GetB() {
		return b;
	}
	public static Complex addition(Complex num1, Complex num2) {
		double x = num1.GetA() + num2.GetA();
		double y = num1.GetB() + num2.GetB();
		Complex sum = new Complex(x, y);
		return sum;
		
	}
	public static Complex multiply(Complex num1, Complex num2) {
		double x = (num1.GetA() * num2.GetA())-(num1.GetB() * num2.GetB());
		double y = (num1.GetA() * num2.GetB())+(num2.GetA() * num1.GetB());
		Complex product = new Complex(x, y);
		return product;
		
	}
	public String toString() {
		return a + " + " + b + "i";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex num1 = new Complex(5.0,6.0);
		Complex num2 = new Complex(0.0,1.0);
		System.out.println(multiply(num1, num2));
		System.out.println(addition(num1, num2));
		

	}

}
