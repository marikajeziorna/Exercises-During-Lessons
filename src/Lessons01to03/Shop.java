package Lessons01to03;

class Shop {
    public static void main(String[] args) {
        Address address = new Address("Fabryczna", "Krobia", "63-840", "7a");

        Producer producer = new Producer("Mlekowita", address );

        Product product = new Product("mleko", 3.2, producer);

        System.out.println("Wyświetl nazwę i cenę produktu: " + product.name);
        System.out.println("Wyświetl nazwę producenta: " + producer.name);
        System.out.println("Wyświetl pełen adress producenta: ulicę " + address.street + " numer " + address.number + " kod pocztowy " + address.postalCode + " miasto " + address.city);



/////////////////////////////

        Product product1 = new Product("mleko", 3.2, producer);
                product1.producer = new Producer();
                product1.producer.name = "Mlekowita";
                product1.producer.address = new Address("Mleczna", "Mlekowice podgórne", "12-123", "12");

                Product product2 = new Product("keczup", 5.8, producer);

                product2.producer = new Producer();
                product2.producer.name = "Pudliszki";
                product2.producer.address = new Address("Fabryczna", "Krobia", "63-840", "7a");

                //Wyświetlenie informacji o 1 produkcie
                System.out.println("Pierwszy produkt:");
                System.out.printf("%s w cenie %.2f wyprodukowane przez %s\n",
                        product1.name, product1.price, product1.producer.name);
                System.out.println("Siedziba producenta:");
                System.out.printf("%s, %s, %s, %s\n",
                        product1.producer.address.city, product1.producer.address.street,
                        product1.producer.address.postalCode, product1.producer.address.number);

                //Wyświetlenie informacji o 2 produkcie
                System.out.println("\nDrugi produkt:");
                System.out.printf("%s w cenie %.2f wyprodukowany przez %s\n",
                        product2.name, product2.price, product2.producer.name);
                System.out.println("Siedziba producenta:");
                System.out.printf("%s, %s, %s, %s\n",
                        product2.producer.address.city, product2.producer.address.street,
                        product2.producer.address.postalCode, product2.producer.address.number);
            }
}

