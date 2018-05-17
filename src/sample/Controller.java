package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {

    @FXML
    private TextField spejimasTextField;

    @FXML
    private Label atspejaiLabel;

    @FXML
    private Label skaiciusLabel;

    public void speti(ActionEvent event){
        Random random = new Random();
        int rand = random.nextInt(10)+1;

        int resultNumb = Integer.parseInt(spejimasTextField.getText());

        if(rand==resultNumb) {
            atspejaiLabel.setText("ATSPEJAI");
        }else{
            atspejaiLabel.setText("BANDYK DAR KARTA");
        }
        skaiciusLabel.setText(String.valueOf(rand));
        spejimasTextField.setText("");

    }
}
