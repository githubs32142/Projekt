/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.Class;
public class Factor {
    private String factor;
    private String symptom;
    private boolean test;
    private String urlTest;
    public Factor(String factor, String symptom, boolean test,String urlTest) {
        this.factor = factor;
        this.symptom = symptom;
        this.test = test;
        this.urlTest=urlTest;
    }
    /**
     ** Metoda która sprwdza, czy podany objaw już jest 
     * @param factor
     * @return 
     */
    public boolean contains(String factor ){
        return this.factor.equals(factor);
    }

    public String getFactor() {
        return factor;
    }

    public String getSymptom() {
        return symptom;
    }

    public boolean isTest() {
        return test;
    }

    public String getUrlTest() {
        return urlTest;
    }
    
}
