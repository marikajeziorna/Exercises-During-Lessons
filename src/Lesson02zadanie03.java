public class Lesson02zadanie03 {
    public static void main(String[] args) {
        int number1 = 11;
        int number2 = 13;

        boolean czyRówne = number1 == number2;

        Person person1 = new Person();
        person1.firstName = "Marika";
        person1.lastName = "Jeziorna";
        person1.age = 34;
        person1.address = new Address();
        person1.address.city = "Wrocław";
        person1.gender = true;

        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println(person1.age);
        System.out.println(person1.address.city);
        System.out.println(person1);


    }
}
