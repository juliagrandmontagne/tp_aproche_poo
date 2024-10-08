package fr.diginamic.chaines;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        char premierCaractere = chaine.charAt(0);
        String Nom = chaine.substring(0,chaine.indexOf(';'));
        System.out.println("Premier caractère: " + premierCaractere);
        System.out.println(chaine.length());
        System.out.println(chaine.indexOf(';'));
        System.out.println(chaine.substring(0,chaine.indexOf(';')));
        System.out.println(Nom.toUpperCase());
        System.out.println(Nom.toLowerCase());
        System.out.println(chaine.split(";"));
    }


}
