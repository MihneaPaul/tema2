/**
 * Created by Mihnea on 26.03.2017.
 */
//  Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
//  int n = 20; //sau o alta valoare
    import java.util.Scanner;

public class problema2 {
//    public static void SAU(String[] args) {
//        int n = 20;
//        int sum=0;
//        for(int i=0;i<=n;i++) {
//            sum = sum + i;
//        }
//        System.out.println("Suma este " + sum);
//    }


//SAU

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Introduceti un numar: ");
        int nr = scanner.nextInt();
        for(int i=0;i<=nr;i++) {
            sum = sum +i;
        }
        System.out.println("Suma este "+sum);
    }

    }