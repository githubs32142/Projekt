package projekt.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;
import jess.JessException;
import jess.Rete;

import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * FXML Controller class
 *
 * @author Andrzej
 */
public class SmokingTestController implements Initializable {

    private FactorWindowController window;
    private boolean end = false;// kiedy klikneliśmy na koniec(wystaw diagnozę)
    private int index;
    @FXML
    private Label question;
    @FXML
    private RadioButton answer1;
    @FXML
    private ToggleGroup tg;
    @FXML
    private RadioButton answer2;
    @FXML
    private RadioButton answer3;
    @FXML
    private RadioButton answer4;
    @FXML
    private Button next;
    List<String> qList = new ArrayList<>();// lista pytań
    List<String> a1List = new ArrayList<>();
    List<String> a2List = new ArrayList<>();
    List<String> a3List = new ArrayList<>();
    List<String> a4List = new ArrayList<>();
    List<String> a5List = new ArrayList<>();// lista odpowiedzi na 5 pytanie
    List<Integer> pList = new ArrayList<>();// ilość punktów przyznanych za każdą odpowiedź

    public SmokingTestController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        index = 0;
        qList.add("1.Jak szybko po przebudzeniu zapala Pani/ Pan pierwszego  papierosa?");
        qList.add("2. Czy ma Pan/i trudności z powstrzymaniem się od palenia w miejscach, gdzie to jest zakazane?");
        qList.add("3. Z którego papierosa jest Pani/u najtrudniej zrezygnować?");
        qList.add("4. Ile papierosów wypala Pan/i w ciągu dnia?");
        qList.add("5. Czy częściej pali Pan/i papierosy w ciągu pierwszych godzin po przebudzeniu niż w pozostałej części dnia?");
        qList.add("6. Czy pali Pan/i papierosy nawet wtedy, gdy jest Pan/i tak chora(y), że musi leżeć w łóżku?");

        a1List.add(" Więcej niż 60 min lub wcale");
        a1List.add(" Nie");
        a1List.add(" Z każdego innego");
        a1List.add(" Mniej niż 10");
        a1List.add(" Nie");
        a1List.add(" Nie");

        a2List.add(" 31-60 minut");
        a2List.add(" Tak");
        a2List.add(" Z pierwszego rano");
        a2List.add(" 11-20");
        a2List.add(" Tak");
        a2List.add(" Tak");

        a3List.add(" 6-30 minut");
        a3List.add(" -");
        a3List.add(" -");
        a3List.add(" 21-30");
        a3List.add(" -");
        a3List.add(" -");

        a4List.add(" do 5 minut");
        a4List.add(" -");
        a4List.add(" -");
        a4List.add(" 31 i więcej");
        a4List.add(" -");
        a4List.add(" -");
        for (int i = 0; i < 6; i++) {
            pList.add(0);
        }
        question.setText(qList.get(0));
        answer1.setText(a1List.get(0));
        answer2.setText(a2List.get(0));
        answer3.setText(a3List.get(0));
        answer4.setText(a4List.get(0));
        answer1.setSelected(true);
    }

    @FXML
    private void answer1Action(ActionEvent event) {
        pList.set(index, 0);
    }

    @FXML
    private void answer2Action(ActionEvent event) {
        pList.set(index, 1);
    }

    @FXML
    private void answer3Action(ActionEvent event) {
        pList.set(index, 2);
    }

    @FXML
    private void answer4Action(ActionEvent event) {
        pList.set(index, 3);
    }

    @FXML
    private void next(ActionEvent event) {
        if (index <= 6) {
            index++;
        }
        if (index == 6) {
            // koniec

            makeAllDiagnose();
            Stage stage;
            stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            stage.close();
            next.setText("Dalej>");
            index = 0;
            for (int i = 0; i < 6; i++) {
                pList.set(i, 0);
            }
        }
        if (index < 6) {
            if (index == 5) {
                next.setText("Zakończ");
            }
            question.setText(qList.get(index));
            answer1.setText(a1List.get(index));
            answer2.setText(a2List.get(index));
            if (a3List.get(index).equals(" -")) {
                answer3.setVisible(false);
                answer4.setVisible(false);
            } else {

                answer3.setVisible(true);
                answer4.setVisible(true);
            }
            answer3.setText(a3List.get(index));
            answer4.setText(a4List.get(index));
            if (pList.get(index) == 0) {
                answer1.setSelected(true);
            }
            if (pList.get(index) == 1) {
                answer2.setSelected(true);
            }
            if (pList.get(index) == 2) {
                answer3.setSelected(true);
            }
            if (pList.get(index) == 3) {
                answer4.setSelected(true);
            }
        }
    }

    @FXML
    private void back(ActionEvent event) {
        if (index > 0) {
            index--;
        }
        if (index >= 0) {
            question.setText(qList.get(index));
            answer1.setText(a1List.get(index));
            answer2.setText(a2List.get(index));
            if (a3List.get(index).equals(" -")) {
                answer3.setVisible(false);
                answer4.setVisible(false);
            } else {

                answer3.setVisible(true);
                answer4.setVisible(true);
            }
            answer3.setText(a3List.get(index));
            answer4.setText(a4List.get(index));
            if (pList.get(index) == 0) {
                answer1.setSelected(true);
            }
            if (pList.get(index) == 1) {
                answer2.setSelected(true);
            }
            if (pList.get(index) == 2) {
                answer3.setSelected(true);
            }
            if (pList.get(index) == 3) {
                answer4.setSelected(true);
            }
        }
    }

    public int getIndex() {
        return index;
    }

    /**
     * * Metoda ktora zwraca w postaci ciągu znaków wyrażenie które będzie
     * potrzebne wykonania wniskowania
     *
     * @rerurn wyrażenie potrzebne do wykonania wniskowania
     */
    @Override
    public String toString() {
        StringBuilder tmp = new StringBuilder("( assert ( Point");
        for (int i = 0; i < pList.size(); i++) {
            tmp.append("( answer").append(i + 1).append(" ").append(pList.get(i)).append(") ");
        }
        tmp.append(") )");
        return tmp.toString();
    }

    /**
     * * wyświetla wyniki diagnozy
     *
     * @param message rezultat diagnozy
     */
    private void showOutputMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Wynik diagnozy");
        alert.setHeaderText("Otrzymane rezulataty");
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * * Wykonyje diagnoze,wyświetla dignoze i czyści wartości zmiennych.
     */
    private void makeAllDiagnose() {
        makeDiagnostic(toString());
        index = 0;
        for (int i = 0; i < pList.size(); i++) {
            pList.set(i, 0);
        }
        index = 0;
        end = false;
        next.setText("Dalej >");
        question.setText(qList.get(getIndex()));
        answer1.setText(a1List.get(getIndex()));
        answer2.setText(a2List.get(getIndex()));
        answer3.setText(a3List.get(getIndex()));
        answer4.setText(a4List.get(getIndex()));

    }

    public void makeDiagnostic(String s) {
        boolean add = false;
        StringBuilder text = new StringBuilder();
        try {
            Rete engine = new Rete();
            engine.reset();
            StringWriter o = new StringWriter();
            engine.addOutputRouter("t", o);
            String result = new String();
            // Load the pricing rules
            engine.batch("projekt/JESS/smoking.clp");
            engine.eval(s);
            engine.run();
            result = o.toString();
            engine.clear();
            if (result == null ? "" == null : result.equals("")) {
                result = "Brak diagnozy";
            }
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) == '1') {
                    add = true;
                } else {
                    text.append(result.charAt(i));
                }
            }
            if (add) {
                window.changeFactToRight("Palenie papierosów");
            }
            showOutputMessage(text.toString());

        } catch (JessException ex) {
            Logger.getLogger(SmokingTestController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setWindow(FactorWindowController window) {
        this.window = window;
    }
}
