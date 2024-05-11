package coen352.ch4.sort;

import java.util.Comparator;

/**
 All of the code written under the sort package was written in tutorial 4 with the help of the tutorial TA.
 */

public class InsertionSort<T> implements ISort<T> {

    public void insertionSort(int[] donnees, boolean y) {

        for (int i = 1; i < donnees.length; i++) {  // i = index du premier élément non trié

            int cle = donnees[i];  // premier élément non trié -> on va trier maintenant
            int pos = i;

            while (pos > 0 && donnees[pos - 1] > cle) {
                // on déplace les éléments de la partie triée jusqu’à
                // l'emplacement où on doit insérer la clé (élément à trier)
                donnees[pos] = donnees[pos - 1];
                pos--; // on recule d'une position
            }

            // à la sortie du while, on est à l'emplacement où insérer la clé
            donnees[pos] = cle;   // insertion de la clé dans la partie triée

            if (y) {
                System.out.print("i>> ");
                for (int v : donnees) System.out.print(v + " ");
                System.out.println();
            }
        }

    }

    @Override
    public void sort(T[] arr, Comparator<T> comparator, String order) {

    }
}
