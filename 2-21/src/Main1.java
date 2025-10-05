public class Main1 {
    public static void processString(String input) {
        String upperCaseString = input.toUpperCase();
        System.out.println("出力: \"" + upperCaseString + "\"");
        int length = upperCaseString.length();
        System.out.println("文字数: " + length);
        }
    public static void main(String[] args) {
        String testInput = "Hello World";
        System.out.println("入力: \"" + testInput + "\"");
        processString(testInput);
    }
}





