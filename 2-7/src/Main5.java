public class Main5 {
    public static void main(String[] args) {
        int notePrice=280;
        int pencilPrice=120;
        int eraserPrice=100;

        int notePcs=3;
        int pencilPcs=5;
        int eraserPcs=2;

        int note=notePrice*notePcs;
        int pencil=pencilPrice*pencilPcs;
        int eraser=eraserPrice*eraserPcs;

        int subtotal=note+pencil+eraser;
        int tax=(int)(subtotal*0.1);
        int total=subtotal+tax;
        int change=2000-total;
        
        System.out.println("小計:"+subtotal+"円");
        System.out.println("消費税:"+tax+"円");
        System.out.println("合計金額:"+total+"円");
        System.out.println("おつり:"+change+"円");
    }
}
