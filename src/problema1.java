/**
 * Created by Mihnea on 26.03.2017.
 */
// Se da un sir de numere ordonate crescator.
//         Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
//         Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
//         sirul va fi definit asa, numerele sunt de exemplu.
//         int[] a = {1,3,4,6,7,8,10,12,14,23};
public class problema1 {
    public static void main(String[] args) {


        int[] sir = {1, 3, 4, 6, 7, 8, 10, 13, 14, 23};
        int val = 4;
        int x=0;
        int b= -1;
        boolean a=false;
        for (int i = 0; i < sir.length; i++) {
            if (sir[i] == val) {
                x = sir[i];
                a = true;
                b=i;
            }
        }
            if(a){
                System.out.println("Pozitia elementului "+x+" este " + b);
            }
            else {
                System.out.println(b);
            }
    }
}
