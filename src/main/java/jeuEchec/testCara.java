package jeuEchec;

import jeuEchec.modele.DAOException;
import jeuEchec.modele.Joueur;
import jeuEchec.modele.JoueurDAO;

public class testCara {
    public static void main(String[] args) {
        System.out.println("\u2659");

        Joueur joueur= new Joueur("Sin-Deny Thorpe");
        JoueurDAO joueurDAO=new JoueurDAO();

        try {
            joueurDAO.supprimer(joueur);

        } catch (DAOException e) {
            e.printStackTrace();
        }


    }
}
