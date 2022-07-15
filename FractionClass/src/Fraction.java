
public class Fraction {
	int numerator;
	int denominator;
	
	private void Simplify() {
		int gcd = 1;		int smaller = Math.min(numerator, denominator);
		for (int i = 2; i<= smaller; i++){
			if (numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	
	public Fraction(int numerator, int denominator) {
		if(denominator == 0) {
			return;
		}
		this.numerator = numerator;
		this.denominator = denominator;
		Simplify();
		
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setDenominator(int denominator) {
		if (denominator == 0) {
			return;
		}
		this.denominator = denominator;
		Simplify();
	}
	
	
	public int getDenominator() {
		return denominator;
	}
	
	public void print() {
		if (denominator == 1) {
			System.out.println(numerator);
		}
		System.out.println(numerator + "/" + denominator);
		
	}
	
	public void add(Fraction f2) {
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		Simplify();
	}
	
	public void multiply(Fraction f2) {
		this.numerator = this.numerator * f2.numerator;
		this.denominator = this.denominator* f2.denominator;
		Simplify();
	}
	
	public static Fraction add(Fraction f2, Fraction f3) {
		int newNum = f2.numerator * f3.denominator + f2.denominator* f3.numerator;
		int newDen = f2.denominator * f3.denominator;
		Fraction f = new Fraction(newNum, newDen);
		return f;
	}

}
