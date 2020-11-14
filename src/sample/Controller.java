package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller extends CurrencyConvert{

    @FXML TextField textField = new TextField();
    @FXML TextField textField2 = new TextField();

    @FXML Button btn = new Button();

    public void doConvertion(){

        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                double eingabe = Double.parseDouble(textField.getText());

                textField2.setText(String.valueOf(euroToYen(eingabe)));

            }
        };
        btn.addEventHandler(MouseEvent.MOUSE_CLICKED, handler);
    }

}
