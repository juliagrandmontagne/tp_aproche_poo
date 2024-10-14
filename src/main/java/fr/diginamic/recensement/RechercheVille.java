package fr.diginamic.recensement;
import fr.diginamic.recensement.Recensement;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static fr.diginamic.recensement.Recensement.recuperationVille;

public class RechercheVille {
    public static void rechercheVille () throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tapper le nom de la ville");
        String ville_demander = scanner.nextLine();
        List<Ville> V1= recuperationVille();
        int indexdemander = -1;
        for (int i = 0; i < V1.size(); i++) {
            if (V1.get(i).nomDeLaCommune.equals(ville_demander)) {
                indexdemander = i;
            }
        }

//       Optimisation à faire
//        while (indexdemander < 0 || i<V1.size()){
//            System.out.println(i);
//            System.out.println(indexdemander);
//            if (V1.get(i).nomDeLaCommune.equals(ville_demander)){
//                System.out.println("trouver");
//                indexdemander = i;
//            }
//            i=i+1;
//        }
        if (indexdemander == -1) {
            System.out.println("La ville demmandé n'est pas dans la liste");
        }
        else {
            System.out.println(V1.get(indexdemander).populationTotale);
        }

    }
    public static void main(String[] args) throws IOException  {
        rechercheVille ();
    }

}
