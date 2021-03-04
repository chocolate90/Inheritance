package quiz05;

public class Computer extends Calculator {

	
	// circle의 오버라이딩
	double circle(int a) {
		return a*a*Math.PI;
	}
	
	// rect의 오버로딩
	
	double rect(double a) {
		return a*a;
	}
	double rect(double a, double b) {
		return a*b;
	}
	
	double rect(double a, double b, double c) {
		return (a*c) + (b*c) + (a*c) + (b*c) + (a*b) + (a*b);
	}
}
