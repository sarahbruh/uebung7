/**
 * uebung 7 & 8
 * @author Brunmayr Sarah
 * @version 12.0.1, 19.11.2020
 */
package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML public TextField textField = new TextField();
    @FXML public TextField textField2 = new TextField();

    @FXML public ChoiceBox<String> cb = new ChoiceBox();

    @FXML Button btn = new Button();

    private CurrencyConvert currencyConvert;

    public void doConvertion(){

        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                double eingabe = Double.parseDouble(textField.getText());

                String v = cb.getValue();

                double euroTo = currencyConvert.euroTo(eingabe, v);

                textField2.setText(String.valueOf(euroTo));
            }
        };
        btn.addEventHandler(MouseEvent.MOUSE_CLICKED, handler);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        currencyConvert = new CurrencyConvert();

        for (int i = 0; i < currencyConvert.al.size(); i++){
            cb.getItems().addAll(currencyConvert.getName(i));
        }
    }
}
