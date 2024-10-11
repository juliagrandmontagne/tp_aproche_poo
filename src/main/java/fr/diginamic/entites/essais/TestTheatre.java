package fr.diginamic.entites.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("Théâtre National");

        theatre.inscrire(50, 20);  // Inscrit 50 clients à 20 euros chacun
        theatre.inscrire(40, 20);  // Inscrit 40 autres clients à 20 euros chacun
        theatre.inscrire(20, 20);  // Essaye d'inscrire encore 20 clients (le maximum est atteint)

        // Afficher l'état final du théâtre
        theatre.afficherEtat();
    }
}
