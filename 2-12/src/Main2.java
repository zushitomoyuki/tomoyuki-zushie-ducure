public class Main2 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println(i+"の段");

            for(int j=1; j<=9; j++){
                System.out.println(i+"×"+j+"="+(i*j));
            }

            System.out.println();
        }
    }
}