import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main4 {
    public static void processNumbers(int[] numbers) {
        List<Integer> numberList = new ArrayList<>();
        for (int num : numbers) {
            numberList.add(num);
        }
        System.out.println("元のリスト: " + numberList);
        Collections.sort(numberList);
        System.out.println("ソート後: " + numberList);
        int maxValue = Collections.max(numberList);
        int minValue = Collections.min(numberList);
        System.out.println("最大値: " + maxValue);
        System.out.println("最小値: " + minValue);
    }
    public static void main(String[] args) {
        int[] inputNumbers = {5, 2, 8, 1, 9};
        processNumbers(inputNumbers);
    }
}


