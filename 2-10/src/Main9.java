public class Main9 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        char operator = '+';

        switch(operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                if(num2==0){
                    System.out.println("エラー:０で割ることはできません");
                }else{
                    System.out.println(num1/num2);
                }
                break;
            default:
                System.out.println("無効な演算子です");
        }
    }
}