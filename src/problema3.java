/**
 * Created by Mihnea on 26.03.2017.
 */
// Se citesc numere naturale pânã când se introduce numãrul 0.
// Afisati suma obtinutã prin adunarea doar a numerelor mai mari decat 4 si mai mici decat 11.
    import java.util.Scanner;
public class problema3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr ;
        int sum = 0;
        int SUM=0;
        String string ="@#$%*!";
        do {
            System.out.println("Introduceti un numar: ");
            nr = scanner.nextInt();
            if (nr > 4 && nr < 11) {
                sum = sum + nr;
            }
        }
        while (nr != 0);
        if (nr==0) {
            System.out.println("Suma este: "+sum);
        }

    }
}

