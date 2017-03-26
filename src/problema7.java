/**
 * Created by Mihnea on 26.03.2017.
 */
//Sa se calculeze factorialul unui numar a
    import java.util.Scanner;
public class problema7 {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int n= scanner.nextInt();
        for(int i=2; i<=n;i++) {
            factorial = i*factorial;
        }
        System.out.println(factorial);
    }
}
