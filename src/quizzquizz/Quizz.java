/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzquizz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class Quizz {

    protected String nom;
    protected ArrayList<Question> questions;
    protected int score = 0;
    protected String nomJoueur;

    public void ajoutNomJoueur() {
        System.out.println("Veuillez saisir votre Nom : ");
        Scanner sc = new Scanner(System.in);
        nomJoueur = sc.nextLine();
    }

    public void menuPrincipal() {

        System.out.println("Bonjour " + nomJoueur + " !");
        System.out.println("Menu Principal QUIZZ");
        System.out.println("---------------------");
        System.out.println("1. Ajouter nouveau quizz");
        System.out.println("---------------------");
        System.out.println("2. Sélectionner votre quizz");
        System.out.println("---------------------");
        System.out.println("3. Quitter");
        System.out.println("Veuillez saisir votre choix s'il vous plait :  ");
        Scanner sc = new Scanner(System.in);
        int choixMenu = sc.nextInt();

        boolean quitter = false;

        while (quitter == false) {
            switch (choixMenu) {

                case 1:
                    ajouterQuizz();
                    break;
                case 2:
                    selectQuizz();
                    break;
                case 3:
                    quitter = true;
                    break;
                default:
                    System.err.println("Choix incorrect, merci de choisir parmis les choix du menu");
                    return;

            }
        }
    }

    public void ajouterQuizz() {
        System.out.println("Menu d'ajout Quizz");
        System.out.println("------------------");
        System.out.println("Ajouter le nom de la question: ");
        Scanner sc = new Scanner(System.in);
        String titre = sc.nextLine();
        Question q1 = new Question();
        q1.setTitreQuestion(titre);
        System.out.println("Vous allez désormais devoir ajouter les 4 possibilités de réponses: ");
        System.out.println("possibilité de réponse 1 : ");
        Scanner sc1 = new Scanner(System.in);
        q1.setRep1(sc1.nextLine());
        System.out.println("possibilité de réponse 2 : ");
        Scanner sc2 = new Scanner(System.in);
        q1.setRep2(sc2.nextLine());
        System.out.println("possibilité de réponse 3");
        Scanner sc3 = new Scanner(System.in);
        q1.setRep3(sc3.nextLine());
        System.out.println("possibilité de réponse 4");
        Scanner sc4 = new Scanner(System.in);
        q1.setRep4(sc4.nextLine());

    }

    public void selectQuizz() {

    }

}
