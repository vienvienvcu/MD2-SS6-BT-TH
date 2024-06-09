import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Product {

    private String productId;
    private String productName;
    private float price;
    private Date created;
    private String catalogName;
    private int productStatus;
   public Product(){
   }
   public Product(String productId, String productName, float price, Date created, String catalogName, int productStatus) {
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData(Scanner scanner){
//        1.gồm 4 ký tự bắt đầu là một trong 3 ký tự (C: café, S: sinh tố, A: đồ ăn nhanh).
        this.productId = InputProductId(scanner);
//        2.tên sản phẩm đồ uống, có từ 10-50 ký tự.
        this.productName = inputProductName(scanner);
//        3.giá sản phẩm có giá trị lớn hơn 0.
        this.price = inputPrice(scanner);
//        4.ngày nhập sản phẩm có định dạng dd/mm/yyyy.
        this.created = inputCreated(scanner);
//        5.Tên danh mục mà sản phẩm thuộc về.
        System.out.println("nhap vao danh sach san pham");
        this.catalogName = scanner.nextLine();
//        6. (0: Đang bán – 1: Hết hàng – 2: Không bán).
        this.productStatus = inputProductStatus(scanner);
    }


public String InputProductId(Scanner scanner){
    System.out.println("enter product id");
    String productIdRegex = "[CSA]\\w{3}";
    do {
       String productId = scanner.nextLine();
       if (Pattern.matches(productIdRegex, productId)){
           return productId;
       }else {
           System.err.println("Invalid product id, please try again");
       }
    }while (true);
}
public String inputProductName(Scanner scanner){
       System.out.println("enter product name");
       do {
          String productName = scanner.nextLine();
          if (productName.length()>=10 && productName.length()<=50){
              return productName;
          }else {
              System.err.println("Invalid product name, please try again");
          }
       }while (true);
}
public Float inputPrice(Scanner scanner){
       System.out.println("enter product price");
       do {
          float price = Float.parseFloat(scanner.nextLine());
          if (price > 0){
              return price;
          }else {
              System.err.println("Invalid product price, please try again");
          }
       }while (true);
}

public int inputProductStatus(Scanner scanner){
    System.out.println("enter product status");
    do {
        System.out.println("1.dang ban");
        System.out.println("2. hat hang");
        System.out.println("3. khong ban");
        System.out.println("lua chon trang thai");
        int choice = scanner.nextInt();
         if (choice > 0 && choice <4){
             return choice - 1;
         }else {
             System.err.println("ban chon chua dung trang thai san pham, vui long nhap lai");
         }
    }while (true);
}
public Date inputCreated(Scanner scanner){
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("nhap vao ngay thang:");
    do {
        try{
            Date created = sdf.parse(scanner.nextLine());
            return created;
        }catch (Exception ex){
            System.err.println("Định dạng ngày nhập là dd/MM/yyyy, vui lòng nhập lại");
        }
    }while (true);
}
public void displayData(){
    System.out.println("product ID: " + this.productId);
    System.out.println("product Name: " + this.productName);
    System.out.println("product price: " + this.price);
    System.out.println("product created:  " + this.created);
    System.out.println("product status product: " + ((this.productStatus ==0)? "dang ban": (this.productStatus==1)?"het ban" : "khong ban"));
}
}

