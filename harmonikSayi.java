package patikadev;
import java.util.Scanner;
public class harmonikSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        double sonuc=0;
        System.out.print("bir sayı giriniz:");
        a = inp.nextInt();
        for (double i=1;i<=a;i++){
            sonuc += 1/i;
        }
    }
}
