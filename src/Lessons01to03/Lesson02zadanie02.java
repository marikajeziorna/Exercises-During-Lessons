package Lessons01to03;

public class Lesson02zadanie02 {
    public static void main(String[] args) {
        double number1 = 12;
        double number2 = 5.5;

        double sum = number1 + number2;
        double multi = number1 - number2;
        double mnozenie = number1 * number2;
        double dzielenie = number1 / number2;

//        System.out.println(number1 + " + " + number2 + " = " + sum);
//        System.out.println(number1 + " - " + number2 + " = " + multi);
//        System.out.println(number1 + " * " + number2 + " = " + mnozenie);
//        System.out.println(number1 + " / " + number2 + " = " + dzielenie);

//        System.out.printf("%f + %f = %f", number1, number2, sum);
//
//        int age =15;
//        String name = "Jan";
//        System.out.printf("Cześć %s, masz %d lat\n", name, age);


        boolean zdanie1 = sum > 0;
        System.out.println("Czy jest większe od 0? " + zdanie1);
        boolean zdanie2 = sum % 2 == 0;
        System.out.println("Czy jest parzysta? " + zdanie2);
        boolean zdanie3 = number1 > 100 || number2 > 100;
        System.out.println("A lub B większe od 100? " + zdanie3);
        boolean zdanie4 = number1 >100 && number2 > 100;
        System.out.println("A i B większe od 100? " + zdanie4);


    }
}
