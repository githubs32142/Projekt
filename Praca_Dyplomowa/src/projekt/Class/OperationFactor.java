/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.Class;

import java.util.List;


public class OperationFactor {

    public static void initFactor( List<Factor> fact) {
        //AuditTest
        fact.add(new Factor("Spożywanie alkoholu", "/projekt/HTML/alkoholizm.html", true, "/projekt/FXML/AuditTest.fxml"));
        // Samo dodaje
        fact.add(new Factor("Otyłość", "/projekt/HTML/otylosc.html", false, ""));
        // IonizingRadiation
        fact.add(new Factor("Promieniowanie jonizujące", "/projekt/HTML/promieniowanie.html", true, "/projekt/FXML/IonizingRadiation.fxml"));
        //  Radiotherapy
        fact.add(new Factor("Radioterapia", "/projekt/HTML/radioterapia.html", true, "/projekt/FXML/Radiotherapy.fxml"));
        // Solarium
        fact.add(new Factor("Lampy solarium", "/projekt/HTML/solarium.html", true, "/projekt/FXML/Solarium.fxml"));
        // Smoking
        fact.add(new Factor("Palenie papierosów", "/projekt/HTML/papierosy.html", true, "/projekt/FXML/SmokingTest.fxml"));
        //  da się zrobić
        fact.add(new Factor("Brak aktywności fizycznej", "/projekt/HTML/aktywnosc_fizyczna.html", false, ""));
        // Diet bez reguł//
        fact.add(new Factor("Niewłaściwa dieta", "/projekt/HTML/brak_owocow.html", true, "/projekt/FXML/Diet.fxml"));
        //
        fact.add(new Factor("Brak naturalnych antyoksydantów", "/projekt/HTML/brak_naturalnych_antyoksydantow.html", false, ""));
        // Menopause 
        fact.add(new Factor("Menopauza + otyłość", "/projekt/HTML/wzrost_bmi.html", true, "/projekt/FXML/Menopause.fxml"));
        // Fibre
        fact.add(new Factor("Brak błonnika", "/projekt/HTML/brak_naturalnych_antyoksydantow.html", true, "/projekt/FXML/Fibre.fxml"));
        // 
        fact.add(new Factor("Pole elektromagnetyczne", "/projekt/HTML/pole_elektromagnetyczne.html", false, "/projekt/FXML/Fibre.fxml"));
        //
        fact.add(new Factor("Promieniwanie ultrafiloetowe", "/projekt/HTML/promieniowanie_ultrafioletowe.html", false, "/projekt/FXML/Fibre.fxml"));
        // AsbestiosTest
        fact.add(new Factor("Kontakt z azbestem", "/projekt/HTML/promieniowanie_ultrafioletowe.html", true, "/projekt/FXML/AsbestosTest.fxml"));
        //Wczesne współżycie  EarlyChAgeController
        fact.add(new Factor("Wczesne współżycie seksualne", "/projekt/HTML/wczesne_wsolzycie.html", true, "/projekt/FXML/EarlyChildhoodAge.fxml"));
                //Wczesne współżycie  EarlyChAgeController
        fact.add(new Factor("Wczesny wiek rodzenia", "/projekt/HTML/wczesne_dziecko.html", true, "/projekt/FXML/EarlyBabe.fxml"));
    }
    
    
}
