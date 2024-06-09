import java.util.Scanner;
import java.util.regex.Pattern;

public class ProductFood {
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private float profit;
    private String descriptions;
    private Boolean status;

    public ProductFood(){

    }
    public ProductFood(String productId, String productName, float importPrice, float exportPrice, int quantity, float profit, String descriptions, Boolean status){
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.profit = profit;
        this.descriptions = descriptions;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public void inputDataFood(Scanner scanner){
//        1.Mã sản phẩm gồm 4 ký tự, bắt đầu là ký tự P
           this.productId = inputProductId(scanner);
//        2.Tên sản phẩm có từ 6-50 ký tự,
           this.productName = inputProductName(scanner);
//        3. Giá nhập có giá trị lớn hơn 0
           this.importPrice = inputImportPrice(scanner);
//        4. Giá xuất có giá trị lơn hơn ít nhất 20% so với giá nhập
           this.exportPrice = inputExportPrice(scanner);
//        5. Lợi nhuận tính theo công thức:profit = exportPrice – importPrice
            this.profit = calProfit();
//        6.Số lượng sản phẩm có giá trị lớn hơn 0
             this.quantity = inputQuantity(scanner);
//        7. Mô tả sản phẩm.
        System.out.println("nhap mo ta san pham");
             this.descriptions = scanner.nextLine();
//        8.Trạng thái sản phẩm chỉ nhận 1 trong 2 giá trị true | false
             this.status = inputStatus(scanner);
    }

   public float calProfit(){

        return this.profit = (this.exportPrice - this.importPrice);
   }

   public String inputProductId(Scanner scanner){
       System.out.println("Enter product id: ");
       do {
        String productId = scanner.nextLine();
        String productIdRegex = "[P]\\w{3}";
        if (Pattern.matches(productIdRegex, productId)){
            boolean isExists = false; // KHONG TON TAI
            for (int i = 0; i < ProductFoodMain.currentIndex; i++){
                if (ProductFoodMain.products[i].getProductId().equals(productId)){
                    isExists = true;
                    break;
                }
            }
            if (isExists){
                System.out.println("ma san pham da ton tai vui long nhap lai");
            }else {
                return productId;
            }
        }else {
            System.out.println("Mã sản phẩm gồm 4 ký tự, bắt đầu là ký tự P");
        }
       }while (true);
   }

   public String inputProductName(Scanner scanner){
        System.out.println("Enter product name: ");
        do {
            String productName = scanner.nextLine();
            if (productName.length()>6 && productName.length()<=50){
                 boolean isExit = false;
                  for (int i =0; i<ProductFoodMain.currentIndex; i++){
                        if (ProductFoodMain.products[i].getProductName().equals(productName)){
                            isExit = true;
                            break;
                        }
                  }
                  if (isExit){
                      System.err.println("ten da ton tai roi, vui long nhap lai");
                  }else {
                      return productName;
                  }
                return productName;
            }else {
                System.err.println("Tên sản phẩm có từ 6-50 ký tự, không trùng lặp");
            }
        }while (true);
   }
   public Float inputImportPrice(Scanner scanner){
       System.out.println("enter product price");
       do {
         float importPrice = Float.parseFloat(scanner.nextLine());
         if (importPrice > 0){
             return importPrice;
         }else {
             System.err.println("Giá nhập có giá trị lớn hơn 0");
         }
       }while (true);
   }
   public Float inputExportPrice(Scanner scanner){
       System.out.println("nhap gia ban ra cua san pham");
       do {
          float exportPrice = Float.parseFloat(scanner.nextLine());
          if (exportPrice>(importPrice + (importPrice*0.2))){
              return exportPrice;
           }else {
              System.err.println("gia ban phai lon hon gia nhap 20%");
           }
       }while (true);
   }
  public int inputQuantity(Scanner scanner){
      System.out.println("nhap so luong san pham");
      do {
          int quantity = Integer.parseInt(scanner.nextLine());
          if (quantity>0){
              return quantity;
          }else {
              System.err.println("so luong san phan phai lon hon 0");
          }
      }while (true);
  }

  public boolean inputStatus(Scanner scanner){
      System.out.println("enter product status");
      do {
          System.out.println("1. con hang");
          System.out.println("2. het hang");
          System.out.println("su lua chon cua ban");
          int choice = Integer.parseInt(scanner.nextLine());
//          boolean check = false;
          if (choice == 1 ){
//              check = true;
              return true;

          }else if (choice == 2){
              return  false;
          }else {
              System.out.println("trang thai k hop le, vui long nhap lai");
          }
      }while (true);
    }
  public void displayDataFood(){
      System.out.printf("%-15s%-30s%-15f%-15f%-15f", this.productId, this.productName, this.importPrice, this.exportPrice, this.profit);
      System.out.printf("%-10d%-30s%-20s\n",this.quantity,this.descriptions, (this.status )?"dang ban" :"het ban");
  }
}


