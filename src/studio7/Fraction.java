package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	//constructor
	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}
	
	//numerator accessor
	public int getNumerator() {
		return numerator;
	}
	//denominator accessor
	public int getDenominator() {
		return denominator;
	}
	//multiply two fractions
	public static Fraction Multiply(Fraction p, Fraction q) {
		int num = p.getNumerator() * q.getNumerator();
		int denom = p.getDenominator() * q.getDenominator();
		Fraction product = new Fraction(num, denom);
		return product;
	}
	//reciprocal of a fraction
	public static Fraction Reciprocal(Fraction q) {
		int num = q.getDenominator();
		int denom = q.getNumerator();
		Fraction recip = new Fraction(num, denom);
		return recip;
	}
	
	//create similar fraction at ratio r to original fraction
	public static Fraction Similar(Fraction q, int r) {
		Fraction sim = new Fraction(q.getNumerator() * r, q.getDenominator() * r);
		return sim;
	}
	//add two fractions
	public static Fraction Add(Fraction p, Fraction q) {
		Fraction p1 = Similar(p, q.getDenominator());
		Fraction q1 = Similar(q, p.getDenominator());
		Fraction sum = new Fraction(p1.getNumerator() + q1.getNumerator(), q1.getDenominator());
		return sum;
	}
	
	public static int gcd(int p, int q) {
		if (p % q == 0) {
			return q;
		} else {
			return gcd(q, p % q);
		}
	}
	
	//simplify a fraction to lowest terms
	public static Fraction Simplify(Fraction q) {
		int r = gcd(q.getNumerator(), q.getDenominator());
		Fraction simp = new Fraction(q.getNumerator() / r, q.getDenominator() / r);
		return simp;
	}
	public String toString() {
		return numerator + "/" + denominator;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction q1 = new Fraction(2,3);
		Fraction q2 = new Fraction(1,6);
		Fraction q3 = new Fraction(2,6);
		System.out.println(Multiply(q1,q2));
		System.out.println(Add(q1,q2));
		System.out.println(Reciprocal(q1));
		System.out.println(Simplify(q3));
	}

}
