package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField hightField;
    @FXML
    private TextField weightField;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("kliknięto przycisk");
        double weight = Integer.parseInt(weightField.getText());
        double hight = Double.parseDouble(hightField.getText());
        double score = weight / (hight * hight);

        scoreLabel.setText(Double.toString(score));

        if (score < 18.5) {
            ratingLabel.setText("niedowaga");
        }  if (18.5 <= score && score <= 24.9) {
            ratingLabel.setText("waga prawidłowa");
        } if (25 <= score && score <= 29.9) {
            ratingLabel.setText("nadwaga");
        } if (score > 30) {
            ratingLabel.setText("otyłość");
        }

    }

    @FXML
    private Label scoreLabel;
    @FXML
    private Label ratingLabel;


}
