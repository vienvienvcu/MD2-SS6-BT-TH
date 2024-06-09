import java.util.Scanner;

public class ProductFoodMain {
    public static ProductFood [] products = new ProductFood[100];
    public static int currentIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("************MENU***************:");
            System.out.println("1. Input product information");
            System.out.println("2. Display all the products");
            System.out.println("3. Exit");
            System.out.print("Enter your choice:\n ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ProductFoodMain.InputProduct(scanner);
                    break;
                case 2:
                    ProductFoodMain.displayProduct();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, try again");
            }
        }while (true);
    }

    public static void displayProduct() {
       for (int i = 0; i<currentIndex ; i++){
           products[i].displayDataFood();
       }
    }
    public static void InputProduct(Scanner scanner){
        System.out.println("nhap so luong san phan can nhap thong tin");
        int cntProducts = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i<cntProducts;i++){
            System.out.println("thong tin cua san pham thu: " + (i+1));
            products[currentIndex] = new ProductFood();
            products[currentIndex].inputDataFood(scanner);
            currentIndex++;
        }
    }
}
