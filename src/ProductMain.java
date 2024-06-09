import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        product.inputData(scanner);
        product.displayData();
    }
}
