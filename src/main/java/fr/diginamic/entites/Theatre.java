package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private double recetteTotal;
    private int capaciteMax = 100;
    private int nombreClientInscrit;

    public Theatre(String nom) {
        this.nom = nom;
        this.recetteTotal = 0;
        this.nombreClientInscrit = 0; // Pas de clients inscrits au début
    }
    public void inscrire(int nombreClients, double prixParClient) {
        int simulationInscription = nombreClientInscrit + nombreClients;
        int placesRestantes = capaciteMax - nombreClientInscrit;

        if (simulationInscription <= capaciteMax) {

            nombreClientInscrit += nombreClients;
            recetteTotal += nombreClients * prixParClient;
            placesRestantes = capaciteMax - nombreClientInscrit;
            System.out.println("Inscription réussie il reste " + placesRestantes + " place(s).");
            System.out.println("Recette totale : " + recetteTotal + " euros.");
        } else {
            System.out.println("Erreur : Le théâtre est complet. Impossible d'inscrire autant de clients.");
        }
    }
    public void afficherEtat() {
        System.out.println("Nom du théâtre : " + nom);
        System.out.println("Capacité maximale : " + capaciteMax);
        System.out.println("Clients inscrits : " + nombreClientInscrit);
        System.out.println("Recette totale : " + recetteTotal + " euros.");
        System.out.println("Places restantes : " + (capaciteMax - nombreClientInscrit));
    }

    public double getRecetteTotal() {
        return recetteTotal;
    }

    public void setRecetteTotal(double recetteTotal) {
        this.recetteTotal = recetteTotal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
