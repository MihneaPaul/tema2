/**
 * Created by Mihnea on 26.03.2017.
 */
//Se da un sir. Pentru prima jumatate a sirului sa se afiseze numerele dublate,
// iar pentru a doua jumatate sa se afseze numerele triplate daca sunt impare si
// numerele asa cum sunt in sir daca sunt pare.

    import java.util.Scanner;

public class problema10 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti 8 numere care formeaza un sir: ");
//        int[] array = new int[];
        int[] array = {};

        for (int i = 0; i < 9; i++) {
            System.out.println(array[i]);
            array[i] = scanner.nextInt();

        }
        System.out.println("passes the reading phase");

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

//        for (int i = 0; i < array.length; i++) {
//                checker++;

//                if (checker >= 10) {
//                    System.out.println("Nunu");
////                    break;
//                    checker = 11;
//                }
//        }
//
//        System.out.print("Pentru prima jumatate a sirului: ");
//        for (int j = 0; j < array.length / 2; j++) {
//            array[j] = array[j] * 2;
//            System.out.print(array[j] + " ");
//        }
//
//        System.out.println("");
//        System.out.print("Pentru a doua jumatate a sirului: ");
//        for (int k = array.length / 2; k < array.length; k++) {
//            if (array[k] % 2 == 1) {
//                System.out.print(array[k] * 3 + " ");
//            } else {
//                System.out.print(array[k] + " ");
//            }
//        }




    }
}


