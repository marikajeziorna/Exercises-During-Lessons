package Lessons01to03;

public class CalcTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		double multiply = calculator.multiply(2.1, 1.1, 3.1);
		System.out.println("Podaj wynik mnożenia: " + multiply);

		calculator.subtractAndShow(5, 3);
	}
}
