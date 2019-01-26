/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendecoreano;

/**
 *
 * @author Laura M
 */
public class Palabra {
    private String espanol;
    private String coreano;
    //Para los siguientes arreglos: 0 presente, 1 pasado, 2 futuro
    private String[] conjKR; 
    
    public Palabra(String espanol, String coreano, String[] conjKR){
        this.espanol=espanol;
        this.coreano=coreano;
        this.conjKR=conjKR;
    }

    public String getEspanol() {
        return espanol;
    }

    public void setEspanol(String espanol) {
        this.espanol = espanol;
    }

    public String getCoreano() {
        return coreano;
    }

    public void setCoreano(String coreano) {
        this.coreano = coreano;
    }

    public String[] getConjKR() {
        return conjKR;
    }

    public void setConjKR(String[] conjKR) {
        this.conjKR = conjKR;
    }
    
}
