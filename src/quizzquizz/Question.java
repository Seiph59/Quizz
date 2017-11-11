/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzquizz;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class Question {
    private String titreQuestion;
    private String rep1;
    private String rep2;
    private String rep3;
    private String rep4;
    private int numBonneReponse;

    public String getTitreQuestion() {
        return titreQuestion;
    }

    @Override
    public String toString() {
        return titreQuestion ;
    }
    
    
    public void setTitreQuestion(String titreQuestion) {
        this.titreQuestion = titreQuestion;
    }

    public String getRep1() {
        return rep1;
    }

    public void setRep1(String rep1) {
        this.rep1 = rep1;
    }

    public String getRep2() {
        return rep2;
    }

    public void setRep2(String rep2) {
        this.rep2 = rep2;
    }

    public String getRep3() {
        return rep3;
    }

    public void setRep3(String rep3) {
        this.rep3 = rep3;
    }

    public String getRep4() {
        return rep4;
    }

    public void setRep4(String rep4) {
        this.rep4 = rep4;
    }

    public int getNumBonneReponse() {
        return numBonneReponse;
    }

    public void setNumBonneReponse(int numBonneReponse) {
        this.numBonneReponse = numBonneReponse;
    }
    
    

            
}
    




