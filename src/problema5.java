

/**
 * Created by Mihnea on 26.03.2017.
 */

    //  Se dau doua numere a si n. sa se afiseze numarul a la puterea n

import java.util.Scanner;
    public class problema5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti numarul care va fi inmultit: ");
            int a = scanner.nextInt();
            System.out.println("De cate ori va fi inmultit numarul cu el insusi? Specificati aici: ");
            int n = scanner.nextInt();
            int prod = a;
            for(int i=0;i<n-1;i++) {
                prod = a * prod;
            }
            System.out.println(prod);
        }
    }

