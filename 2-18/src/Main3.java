public class Main3 {
    public static void main(String[] args) {
        String input = "Hello"; 
        String reversed=new StringBuilder(input).reverse().toString();

        System.out.println("入力:\""+input+"\"");
        System.out.println("出力:\""+reversed+"\"");
    }
}
