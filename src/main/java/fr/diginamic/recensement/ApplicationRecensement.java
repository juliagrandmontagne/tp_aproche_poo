package fr.diginamic.recensement;

import java.util.Scanner;

public class ApplicationRecensement {
    public static void main(String[] args) {
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
//                RecherchePopulationVille recherche = new RecherchePopulationVille();
//                recherche.traiter(recensement, scanner);
                System.out.println("Population d’une ville donnée tapper 1");

                break;
           case 2 :
               System.out.println("Population d’un département donnée tapper 2");

               break;
           case 3 :
               System.out.println("Population d’une région donnée tapper 3");
               break;
           case 4 :
               System.out.println(" ");
               break;
           case 5 :
               System.out.println(" ");
               break;
           case 6 :
               System.out.println(" ");
               break;
           case 7 :
               System.out.println(" ");
               break;
           case 8 :
               System.out.println(" ");
               break;
           case 9 :
               break;
       }
    }
}
