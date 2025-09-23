public class Main4 {
    public static void main(String[] args) {
        int[][] seats = new int[5][6]; 

        int[][] reserved = {{0,2},{1,1},{1,4},{3,0},{3,5},{4,2}};
        for (int[] r : reserved) seats[r[0]][r[1]] = 1;

        System.out.println("予約前の座席状況:");
        printSeats(seats);

        reserveSeat(seats,2, 3);

        System.out.println("予約後の座席状況:");
        printSeats(seats);
    }

    static void printSeats(int[][] seats) {
        for (int[] row : seats) {
            for (int s : row)
            System.out.print("[" + s + "]");
            System.out.println();
        }
    }

    static void reserveSeat(int[][] seats, int row, int col) {
        if (row<0 || row>=seats.length || col<0 || col>=seats[0].length) {
            System.out.println("無効な座席番号です。"); return;
        }
        if (seats[row][col]==1) {
            System.out.println("指定された座席はすでに予約済みです。");
        } else {
            seats[row][col]=1;
            System.out.println((row+1)+"行"+(col+1)+"列の座席を予約しました");
        }
    }
}
