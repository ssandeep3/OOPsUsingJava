package testprj;
class Distance{
	float feet, inch;
	Distance(){ feet = 0; inch = 0;}
	Distance(float a, float b){ feet = a; inch = b;}
	void set(float a, float b){ feet = a; inch = b;}
	void sum(Distance d1) {
		float rf, ri;
		rf = this.feet + d1.feet;
		ri = this.inch + d1.inch;
		if (ri>12) { rf = rf + 1; ri -=12;}
		System.out.println("Sum is:"+rf+"' "+ri);
	}
}



public class SumDist {
	public static void main(String args[]) {
		Distance d1 = new Distance();
		Distance d2 = new Distance(7, 9);
		d1.set(89, 6);
		d1.sum(d2);
	}
}
