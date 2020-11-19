/**
 * uebung 7 & 8
 * @author Brunmayr Sarah
 * @version 12.0.1, 19.11.2020
 */
package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller extends CurrencyConvert{

    @FXML public TextField textField = new TextField();
    @FXML public TextField textField2 = new TextField();

    @FXML public ChoiceBox cb = new ChoiceBox();

    @FXML Button btn = new Button();

    public void doConvertion(){

        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                double eingabe = Double.parseDouble(textField.getText());

                textField2.setText(String.valueOf(euroToYen(eingabe)));

            }
        };
    }
    public void ChoiceBox(){

        EventHandler<MouseEvent> handler_choicebox = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                cb.getItems().add("USD");
                cb.getItems().add("Yen");
                String value = (String) cb.getValue(); //lesen, was in da choicebox ausgewählt is
            }
        };
        cb.addEventHandler(MouseEvent.MOUSE_CLICKED, handler_choicebox);
    }
}
