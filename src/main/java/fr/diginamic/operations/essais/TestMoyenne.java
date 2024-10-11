package fr.diginamic.operations.essais;
import fr.diginamic.operations.CalculMoyenne;
public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne cm = new CalculMoyenne();

        cm.ajout(10.0);  // Ajoute 10.0 au tableau
        cm.ajout(20.0);  // Ajoute 20.0 au tableau
        cm.ajout(30.0);  // Ajoute 30.0 au tableau

        cm.afficherTableau();  // Affiche le tableau : 10.0 20.0 30.0

        double moyenne = cm.calcul();  // Calcule la moyenne
        System.out.println("Moyenne : " + moyenne);  // Affiche la moyenne
    }

}
