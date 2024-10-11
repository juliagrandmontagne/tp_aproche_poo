package fr.diginamic.jdr;

public class Creature {
    int force;
    int pointDeVie;
    String espece;

    public Creature( int NumerEspece) {
        if (NumerEspece == 1) {
            this.force = (int) ((8 * Math.random()) + 3);
            this.pointDeVie = (int) ((10 * Math.random()) + 5);
            this.espece = "loup";
        } else if (NumerEspece == 2) {
            this.force = (int) ((10 * Math.random()) + 5);
            this.pointDeVie = (int) ((15 * Math.random()) + 10);
            this.espece = "gobelin";
        } else if (NumerEspece == 3) {
            this.force = (int) ((15 * Math.random()) + 10);
            this.pointDeVie = (int) ((30 * Math.random()) + 20);
            this.espece = "troll";
        }
    }

    public String getEspece() {
        return espece;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public void afficherstat()
    {

        System.out.println("les point de force de la creature sont de "+getForce());
        System.out.println("les point de Vie de la creature sont de "+getPointDeVie());
        System.out.println("l'espece de la créature est "+getEspece());
    }
}
