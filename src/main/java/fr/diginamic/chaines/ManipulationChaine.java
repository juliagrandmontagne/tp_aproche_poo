package fr.diginamic.chaines;

import fr.diginamic.chaines.entites.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        char premierCaractere = chaine.charAt(0);
        String Nom = chaine.substring(0,chaine.indexOf(';'));
        System.out.println("Premier caractère: " + premierCaractere);
        System.out.println(chaine.length());
        System.out.println(chaine.indexOf(';'));
        String nom = chaine.substring(0, chaine.indexOf(';'));
        System.out.println(nom);
        System.out.println(Nom.toUpperCase());
        System.out.println(Nom.toLowerCase());
        // 7) Utilisation de split pour découper la chaîne de caractères en morceaux
        String[] morceaux = chaine.split(";");
        System.out.println("Tableau obtenu avec split:");
        for (String morceau : morceaux) {
            System.out.println(morceau);
        }

        // 8) Création de l'objet Salarie à partir des morceaux de la chaîne
        // Extraction du prénom, du nom et du salaire
        String prenom = morceaux[1];
        String salaireString = morceaux[2].replace(" ", ""); // Suppression de l'espace dans le salaire

        // Conversion de la chaîne en double
        double salaire = Double.parseDouble(salaireString);

        // Création de l'objet Salarie
        Salarie salarie = new Salarie( nom, prenom, salaire);

        // Affichage des informations du salarié
        System.out.println("Informations du salarié : ");
        System.out.println("Nom : " + salarie.getNom());
        System.out.println("Prénom : " + salarie.getPrenom());
        System.out.println("Salaire : " + salarie.getSalaire());

    }


}
