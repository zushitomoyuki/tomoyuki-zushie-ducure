public class Main4 {
    public static void main(String[] args) {
        int[] prices = {100, 200, 300};
        int[] quantities = {1, 2, 3};

        int[] totals = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            totals[i] = (int)(prices[i] * quantities[i] * 1.08);
        }

        System.out.print("商品価格: ");
        printArray(prices);
        System.out.print(", 数量: ");
        printArray(quantities);
        System.out.println();
        System.out.print("合計金額: ");
        printArray(totals);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
