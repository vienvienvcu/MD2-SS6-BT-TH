public class BT2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        String str1 = "abc";
        str.append(str1);
        System.out.println(str);
        str.insert(5, "Vien");
        System.out.println(str.toString());
        str.delete(5,9);
        System.out.println(str.toString());
        System.out.println(str.length());
        System.out.println(str.reverse());
    }
}
