
public class FractionUses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(20,30);
		f1.print();
		//
		
		f1.setNumerator(12);
		int d = f1.denominator;
		System.out.println(d);
		
		f1.setNumerator(10);
		f1.setDenominator(30);
		
		f1.print();
		
		Fraction f2 = new Fraction(3,4);
		f1.add(f2);
		f1.print();
		// 13/12
		f2.print();
		
		Fraction f3 = new Fraction(4,5);
		f3.multiply(f2);
		f3.print();
		// 3/5
		
		Fraction f4 = Fraction.add(f1,f2);
		

	}

}
