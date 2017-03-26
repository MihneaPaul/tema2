/**
 * Created by Mihnea on 26.03.2017.
 */
import java.util.Scanner;
import java.util.Arrays;
public class problema6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul elementelor din sir: ");
        int nrel = scanner.nextInt();
        int[] sir = new int[nrel];
        System.out.println("Introduceti numerele din sir: ");
        for (int i = 0; i < sir.length; i++) {
            sir[i] = scanner.nextInt();
        }
        System.out.println("Sirul introdus este: " + Arrays.toString(sir));
//        int x=sir[0];
        for (int i=1; i <sir.length; i++) {
            if (sir[i-1]>sir[i]) {
                System.out.println("Perechile sunt "+sir[i-1] +" si "+ sir[i]);
            }
            else {
                continue;
            }
//            x=sir[i];
        }
    }
}
//    Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.
//        de ex pt 11 13 9 8 16 se va afisa   13 9 , 9 8
