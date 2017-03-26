/**
 * Created by Mihnea on 26.03.2017.
 */
// Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
// suma = 1+(x la puterea 1) +(x la puterea 2) + (x la puterea 3) + ….+ (x la puterea n) .

    import java.util.Scanner;

public class problema8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int x = scanner.nextInt();
        System.out.println("Introduceti un alt numar 'n': ");
        int n = scanner.nextInt();
        int sum=1 + x;
        int prod = x;

// SE FACE CU FORMULA PROGRESIEI GEOMETRICE!

//        for (int i = 1; i <= n - 1; i++) {
//        prod = prod * x;
//        }
//        System.out.println((1 - prod*x)/(1-x));

// SAU SE POATE FACE ASA:

        for (int j=1; j <=n-1; j++) {
            prod = prod * x;
            sum = sum + prod;
        }
        System.out.println(sum);
    }
}

