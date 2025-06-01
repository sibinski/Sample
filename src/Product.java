public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public void displayInfo(){
        System.out.println("\nProduct: " + name + " \nPrice: $" + price);
    }
}
