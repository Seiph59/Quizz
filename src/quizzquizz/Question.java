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
    protected String titreQuestion;
    protected String rep1;
    protected String rep2;
    protected String rep3;
    protected String rep4;
    protected int numBonneReponse;

    public String getTitreQuestion() {
        return titreQuestion;
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
    




