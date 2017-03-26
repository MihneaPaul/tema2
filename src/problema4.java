/**
 * Created by Mihnea on 26.03.2017.
 */
//Se da un numar. Sa se afiseze ‘true' daca numarul apartine intervalului [9,24]. Altfel sa se afiseze ‘false'.
    import java.util.Scanner;
public class problema4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean a=true;
        System.out.println("Introduceti un numar: ");
        int n=scanner.nextInt();
        if(n>=9 && n<=24) {
            System.out.println(a);
        }
        else {
            a=false;
            System.out.println(a);
        }
    }
}
