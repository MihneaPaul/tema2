/**
 * Created by Mihnea on 26.03.2017.
 */
// Se da un sir. Sa se verifice daca sirul este ordonat crescator , iar daca nu este sa se ordoneze si sa se afiseze in ordine crescatoare
//de ex pt sirul {2,3,4} se va afisa “crescator” iar pt sirul {3,2,4}  si va ordina si afisa {2,3,4}

    import java.util.Arrays;

public class problema9 {
    public static void main(String[] args) {
        int[] sir = {34, 28, 21, 18, 16, 9, 5, 3, 1};
//        int[] sir = {1,2,4,5,6,7,8}; // verificare pt un sir deja ordonat crescator.

        int var;
        boolean sort = true;
        for (int k = 0; k < sir.length - 1; k++) {
            if (sir[k] > sir[k + 1]) {
                sort = false;
            }
        }
            if (sort) {
                System.out.println("Sirul este deja ordonat crescator.");

            } else {
                System.out.println("Sirul nu este ordonat crescator.");
                System.out.println("");
                for (int j = 0; j < sir.length; j++) {
                    for (int i = 0; i < sir.length - 1; i++) {
                        do {
                            if (sir[i + 1] < sir[i]) {
                                var = sir[i + 1];
                                sir[i + 1] = sir[i];
                                sir[i] = var;
                            } else {
                                continue;
                            }

                        }
                        while (sir[i + 1] < sir[i]);

                    }

//        System.out.println(sir[3]);
                    System.out.println(Arrays.toString(sir)); //a pus println in "for" ca sa vad succesiunea inter-schimbarilor numerelor

                }
            }
        }
    }





