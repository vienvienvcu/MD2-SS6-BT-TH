public class BT1 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("kiem tra chuoi co rong hay k: " + str.isEmpty());
        str = "  Hello World   ";
        System.out.println("str:" + str);
        System.out.println("dùng để loại bỏ khoảng trắng ở 2 đầu:"+ str.trim());
        String str2 = "Hello World,";
        String str1 = "Hello World";
        String str3 = "HELLO WORLD";
        System.out.println(" để kiểm tra xem hai chuỗi có giống nhau phan biet hoa va thuong :" + str1.equals(str2));
        System.out.println("ng để kiểm tra xem hai chuỗi có giống nhau ko phan biet hoa va thuong "+ str3.equalsIgnoreCase(str1));
        String myString = "Hello,World";
        String regex ="[,]" ;
        String [] arr = myString.split(regex);
        for (String s : arr) {
            System.out.println(s);
        }
        String str4 = "really great";
        String str5 = "Hello";
        System.out.println("dùng để kiểm tra chuỗi s1 chứa chuỗi s2 không : " + str2.concat(str4) );
        System.out.println("dùng để kiểm tra chuỗi s1 chứa chuỗi s2 không :" + str2.contains(str5));
        System.out.println("dùng để chuyển chữ thường trong chuỗi thành chữ hoa:" +str3.toLowerCase());
        System.out.println("dùng để chuyển chữ hoa trong chuỗi thành chữ thường:" + str1.toUpperCase());
        System.out.println("dùng để thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới:" + str1.replace('l','p'));
        System.out.println("dùng để lấy được độ dài của chuỗi:" + str1.length());
    }
}
