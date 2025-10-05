import java.util.Date;

public class Main3 {
    public static void showCurrentTime() {
        Date currentDate=new Date();
        System.out.println("現在の日時:"+currentDate);
    }
    public static void main(String[] args){
        showCurrentTime();
    }
}