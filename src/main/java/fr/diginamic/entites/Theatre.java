package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private double recetteTotal;
    private int capaciteMax = 100;
    private int nombreClientInscrit;

    public Theatre(String nom, int nombreClientInscrit) {
        this.nom = nom;
//        this.recetteTotal = recetteTotal;
//        this.capaciteMax = capaciteMax;
        this.nombreClientInscrit = nombreClientInscrit;
    }
    public void inscrire (int nombreClients, double prixParClient )
    {
        int simulationInscription =  nombreClientInscrit + nombreClients;
        int placeRestante = capaciteMax  - nombreClientInscrit;
        if (simulationInscription <= capaciteMax) {
            nombreClientInscrit = simulationInscription;
            recetteTotal = recetteTotal + nombreClients * prixParClient;
            System.out.println("Inscription realiser il reste "+ placeRestante +" place(s)" );
            System.out.println("Recette total "+ recetteTotal );

        }
    else
        {
            System.out.println("le théatre est complet vous ne pouvez pas inscrire tant de monde" );
        }
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
