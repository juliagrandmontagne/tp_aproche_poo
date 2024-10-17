package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

import static fr.diginamic.recensement.Departement.*;
import static fr.diginamic.recensement.RechercheVille.rechercheVille;
import static fr.diginamic.recensement.Region.getHabitantsParRegion;
import static fr.diginamic.recensement.Region.get10VillesPlusPeupleesRegion;
import static fr.diginamic.recensement.Region.get10RegionsPlusPeuplees;
import static fr.diginamic.recensement.Ville.get10VillesPlusPeupleesFrance;


public class ApplicationRecensement {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Population d’une ville donnée tapper 1");
        System.out.println("Population d’un département donnée tapper 2");
        System.out.println("Population d’une région donnée tapper 3");
        System.out.println("Afficher les 10 régions les plus peupléestapper 4");
        System.out.println("Afficher les 10 départements les plus peuplés tapper 5");
        System.out.println("Afficher les 10 villes les plus peuplées d’un département tapper 6");
        System.out.println("Afficher les 10 villes les plus peuplées d’une région tapper 7");
        System.out.println("Afficher les 10 villes les plus peuplées de France tapper 8");
        System.out.println("Sortir tapper 9");
        int nb = scanner.nextInt();
       switch (nb){
            case 1:
                rechercheVille();
                break;
           case 2 :
               getHabitantsParDepartement();
               break;
           case 3 :
               getHabitantsParRegion();
               break;
           case 4 :
               get10RegionsPlusPeuplees();
               break;
           case 5 :
               get10DepartementPlusPeuplees();
               break;
           case 6 :
               get10VillesPlusPeupleesDepartement();
               break;
           case 7 :
               get10VillesPlusPeupleesRegion();
               break;
           case 8 :
               get10VillesPlusPeupleesFrance();
               break;
           case 9 :
               break;
       }
    }
}
