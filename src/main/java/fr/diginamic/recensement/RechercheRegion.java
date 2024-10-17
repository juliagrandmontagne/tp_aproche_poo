package fr.diginamic.recensement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static fr.diginamic.recensement.Recensement.recuperationVille;
import static javax.swing.UIManager.get;

public class RechercheRegion {
    public static void rechercheRegion () throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Tapper le nom de la région");
//        String regionDemander = scanner.nextLine();
//        List<Ville> V1= recuperationVille();
//        System.out.println(V1.get(1).populationTotale);
//        int nombretotaldhabitant = 0;
//        for (int i = 0; i < V1.size(); i++) {
//            if (V1.get(i).nomDeLaRegion.equals(regionDemander)) {
//                System.out.println(V1.get(i).populationTotale);
//                nombretotaldhabitant = nombretotaldhabitant + V1.get(i).populationTotale;
//            }
//        }
//        System.out.println("nombretotaldhabitant");
//        System.out.println(nombretotaldhabitant);



//        List<Ville> villeParRegion= new ArrayList<Ville>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Tapper le nom de la région");
//        String regionDemander = scanner.nextLine();
//        List<Ville> V1= recuperationVille();
//        for (Ville ville : V1) {
//            // Vérifie si la région demandée correspond à la région de la ville
//            if (ville.nomDeLaRegion.equalsIgnoreCase(regionDemander)) {
//                villeParRegion.add(ville);
//
//            }
//        }
//        int calclculHabitant = 0;
//        //this.villeParRegion= villeParRegion;
//
//        for (Ville ville : villeParRegion) {
//
//            calclculHabitant = calclculHabitant+ ville.populationTotale;
//
//        }


    }
    public static void main(String[] args) throws IOException {
        rechercheRegion();
    }
}
