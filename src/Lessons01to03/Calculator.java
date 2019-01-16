package Lessons01to03;

public class Calculator {

	double multiply(double a, double b, double c){
		double multiply = a * b * c;
		return multiply;
	}

	void subtractAndShow(int d, int e){
		int subtract = subtract(d, e);
		System.out.println("Podaj wynik dla metody subtractAndShow: " + subtract);
	}

	int subtract(int d, int e){
		int subtract = d - e;
		return subtract;
	}
}
