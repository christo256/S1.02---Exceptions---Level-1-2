package task1_S1_02_Level1;

public class Main {
    public static void main(String[] args) {

        try {
            Sale sale = new Sale();
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
        try {
            Sale sale = new Sale();
            sale.addProduct(new Product("Book", 20.0));
            sale.addProduct(new Product("laptop", 500.0));
            System.out.println("Total price :" + sale.calculateTotal());
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
        try {
            Sale sale = new Sale();
            sale.addProduct(new Product("Book", 20.0));
            sale.addProduct(new Product("Laptop", 500.0));
            Product p = sale.getListProducts().get(5);
            System.out.println(sale.getListProducts().get(1));

        } catch (IndexOutOfBoundsException e) {
            System.out.println(" IndexOutOfBoundsException captured correctly: ");
            System.out.println(e.getMessage());

        }
    }
}


