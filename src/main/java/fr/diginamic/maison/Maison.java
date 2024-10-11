package fr.diginamic.maison;

public class Maison {
    Piece[] maison = new Piece[0];

    public Maison() {
        Piece[] maison = new Piece[0];

    }

    public Piece[] ajouterPiece (Piece piece) {
        Piece[] nouvellemaison = new Piece[this.maison.length+1];
        for (int i = 0; i < this.maison.length; i++) {
            nouvellemaison[i] = this.maison [i];
        }
        nouvellemaison[this.maison.length] = piece;
        return nouvellemaison;
    }

    public void affichersSuperficie () {
        double superficieTotal = 0;
        for (int i = 0; i < this.maison.length; i++) {
            superficieTotal = this.maison[i].getSuperficie() + superficieTotal;
        }
        System.out.println(superficieTotal);

    }

    public void affichersSuperficieEtage (int etage) {
        double superficieTotal = 0;
        for (int i = 0; i < this.maison.length; i++) {
            if (etage == this.maison[i].getNumeroEtage()){
                superficieTotal = this.maison[i].getSuperficie() + superficieTotal;
            }
        }
        System.out.println(superficieTotal);


    }

}
