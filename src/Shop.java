class Shop {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "mleko";
        product1.price = 3.2;
        product1.producer = new Producer();
        product1.producer.name = "Mlekowita";
        product1.producer.address = new Address();
        product1.producer.address.city = "Mlekowice podgórne";
        product1.producer.address.street = "Mleczna";
        product1.producer.address.postalCode = "12-123";
        product1.producer.address.number = "12";

        Product product2 = new Product();
        product2.name = "keczup";
        product2.price = 5.8;
        product2.producer = new Producer();
        product2.producer.name = "Pudliszki";
        product2.producer.address = new Address();
        product2.producer.address.city = "Krobia";
        product2.producer.address.street = "Fabryczna";
        product2.producer.address.postalCode = "63-840";
        product2.producer.address.number = "7a";

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

