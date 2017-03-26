/**
 * Created by Mihnea on 26.03.2017.
 */
// Se da un sir. Sa se extraga toate numerele intre doua valori si sa se puna intr-un alt sir care apoi sa se afiseze.
//deci sirul 1 2 3 4 5 6:
 //aveam caps..ideea e ca nu imi iese cum vreau fiindca daca el introduce 5 apoi 3..? tot tre sa iau 4, ca si cand ar introduce 3 si apoi 5.
// let me look at the code
    import java.util.Scanner;
    import java.util.Arrays;
public class problema11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente ale sirului: ");
        int x = scanner.nextInt();

        System.out.println("Introduceti numerele sirului: ");
        int sir[]= new int[x];
        int sir2[]= new int[x];


//        int sir
        for(int i=0; i<sir.length;i++) {
            sir[i] = scanner.nextInt();
        }
        System.out.println("Sirul introdus este "+Arrays.toString(sir));


        System.out.println("Introduceti min of interval: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti max of interval: ");
        int b= scanner.nextInt();
        int k=0;
        for(int j=0;j<sir.length;j++) {
            if (sir[j] > a && sir[j] < b) {
//                System.out.println(sir[j]);
                sir2[k]=sir[j];
                k++;

            }
        }
//        System.out.println("Length sir 2= "+k);
        System.out.println("");
        System.out.println("Noul sir este: ");
        for(int q=0;q<sir2.length;q++) {
            if(sir2[q] != 0) System.out.print(+sir2[q]+" ");
        }




    }
}
//pai daca tu ai de ex 1 2 3 4 5 atunci maximul sirului 2 o sa fie intre 1 si 5 deci 3 elemente= sir.length-2
//deci eu chiar nu pot sa-mi dau seama cum gandesti ...

//daca ai 1 2 3 4 5
//si intervalul 3,5
//iti baga in siru 2 numarul 4
//si ala trebe sa-l afisezi
//asta e un exemplu
//poti sa ai 11 23 43 42 123 54 7 23
//si intervalu 14,66
//si siru construit trebe sa fie 23 43 42 54 si 23 again ma rog
//you get the point
//stiu ca ma exprim prost