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
    protected ArrayList<Question> questions=new ArrayList<>();
    protected int score = 0;
    protected String nomJoueur;

    public void ajoutNomJoueur() {
        System.out.println("Veuillez saisir votre Nom : ");
        Scanner sc = new Scanner(System.in);
        nomJoueur = sc.nextLine().toUpperCase();
    }

    public void menuPrincipal() {

        boolean quitter = false;

        while (quitter == false) {
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

        boolean quitter = false;
        while (quitter == false) {
            System.out.println("Menu d'ajout Quizz");
            System.out.println("------------------");
            System.out.println("Ajouter le nom de la question: ");
            Scanner sc = new Scanner(System.in);
            String titre = sc.nextLine();
            Question q1 = new Question();
            this.questions.add(q1);
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
            System.out.println("Indiquez la bonne réponse entre 1 et 4");
            Scanner sc5 = new Scanner(System.in);
            q1.setNumBonneReponse(sc5.nextInt());
            System.out.println("Souhaitez-vous ajouter une nouvelle question : (oui = 1) (non = 0)");
            Scanner scan = new Scanner(System.in);
            
            int choix = scan.nextInt();
            switch (choix) {

                case 0:
                    quitter = true;
                    break;
                case 1:
                    break;
                default:
                    System.err.println("Erreur de saisie");
                    break;
            }
        }
    }

    public void selectQuizz() {
        System.out.println("Liste des questions : ");
        System.out.println("----------------------");
        
        for (int i = 0; i < questions.size(); i++) {
            
            Question questionAct = questions.get(i);
            
            System.out.println(i+1 + "/  " +questionAct);
            System.out.println("Réponses possibles");
            System.out.println("1. " +questionAct.getRep1());
            System.out.println("2. " +questionAct.getRep2());
            System.out.println("3. " +questionAct.getRep3());
            System.out.println("4. " +questionAct.getRep4());
            
            System.out.println("Choisissez la bonne réponse (Entre 1 et 4): ");
            Scanner sc = new Scanner(System.in);
            int repUtilisateur = sc.nextInt();
                if(repUtilisateur != questionAct.getNumBonneReponse()){
                    score += 0;
                }
                else{
                    score += 1;
                }
        }
        System.out.println("Votre score: " + score + "/"+questions.size());
    }

}
