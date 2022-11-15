import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        // ebob : en büyük ortak bölen
        // ekok : en küçük ortak kat

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();

        int ebob;
        if (n1 > n2) {
            for (int i = 1; i >= n1; i++) {
                if (n1%i==0 && n2%i==0) {
                    ebob = i;
                }
            }

        }


        int ekok;
        for( int i = 1 ; i <= (n1 * n2); i++) {
            if ( i%n1 == 0 && i%n2==0){
            System.out.print(i);
            break;
            }
        }
    }

}
