import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("攻撃力を入力してください: ");
        int attack=scanner.nextInt();
        System.out.print("防御力を入力してください:" );
        int defence=scanner.nextInt();
        int normalDamage=attack-defence;
        int criticalDamage=(int)(normalDamage*1.5);
        System.out.println("通常ダメージ:"+normalDamage);
        System.out.println("クリティカルダメージ:"+criticalDamage);
        scanner.close();
    }
}
