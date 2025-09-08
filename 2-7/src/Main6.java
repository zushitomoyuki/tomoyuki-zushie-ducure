import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("現在の経験値を入力してください:");
        String input=scanner.nextLine();
        int experience=Integer.parseInt(input);
        int bonusExperience=(int)(experience*1.25);
        System.out.println("ボーナス後の経験値:"+bonusExperience);
        scanner.close();
    }
}
