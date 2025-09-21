public class Main2 {
    public static void main(String[] args) {
        for(int dan=1; dan<=5; dan++){
            System.out.println(dan+"の段");

            for(int i=1; i<=9; i++){
                System.out.println(dan+"×"+i+"="+(dan*i));
            }

            System.out.println();
        }
    }
}