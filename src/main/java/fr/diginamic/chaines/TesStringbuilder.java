package fr.diginamic.chaines;

public class TesStringbuilder {
    public static void main(String[] args) {
        int age = 15;
        String nom ="lee";
        String resultat = StringUtils.append("Bonjour ",nom," vous avez ",age, "ans");
        System.out.println(resultat);
    }
}
