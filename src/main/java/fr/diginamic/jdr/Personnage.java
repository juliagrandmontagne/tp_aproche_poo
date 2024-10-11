package fr.diginamic.jdr;

public class Personnage {
    int force;
    int pointDeVie;
    int Score;

    public Personnage() {
        this.force = (int) ((18 * Math.random()) + 12);
        this.pointDeVie = (int) ((50 * Math.random()) + 20);
        this.Score = 0;
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

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public void afficherstat()
    {
        System.out.println("la force du personnage est de "+getForce());
        System.out.println("les point de vie du personnage sont de "+getPointDeVie());
    }
}
