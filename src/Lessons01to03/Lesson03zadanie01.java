package Lessons01to03;

public class Lesson03zadanie01 {
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.name = "mleko";
		product1.price = 3.2;
		Producer producer1 = new Producer();
		product1.producer = producer1;
		producer1.name = "Mlkowita";
		Address address = new Address();
		product1.producer.address = address;
		product1.producer.address.city = "Kraków";
		product1.producer.address.street = "Mleczarska";
		product1.producer.address.postalCode = "12-123";
		product1.producer.address.number = "2A";

		Product product2 = new Product();
		product2.name = "czekolada";
		product2.price = 2.8;

		product2.producer = new Producer();
		product2.producer.name = "Milka";
		product2.producer.address = null;

		System.out.println("Wyświetl nazwę dla produktu 2 " + product2.producer.name);
	}
}
