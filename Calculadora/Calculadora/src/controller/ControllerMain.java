package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerMain {

    @FXML
    private Button btDividir;

    @FXML
    private Button btMulti;

    @FXML
    private Button btSomar;

    @FXML
    private Button btSubtrair;

    @FXML
    private Label txtResultado;

    @FXML
    private TextField txtn1;

    @FXML
    private TextField txtn2;
    
    Double n1;
    Double n2;
    Double resultado;
    
    @FXML
    void actionDividir(ActionEvent event) {
    	n1 = Double.parseDouble(txtn1.getText());
    	n2 = Double.parseDouble(txtn1.getText());
    	resultado = n1/n2;
    	txtResultado.setText(""+ resultado);
    }

    @FXML
    void actionMulti(ActionEvent event) {
    	n1 = Double.parseDouble(txtn1.getText());
    	n2 = Double.parseDouble(txtn1.getText());
    	resultado = n1*n2;
    	txtResultado.setText(""+ resultado);
    }
    


    @FXML
    void actionSomar(ActionEvent event) {
    	n1 = Double.parseDouble(txtn1.getText());
    	n2 = Double.parseDouble(txtn1.getText());
    	resultado = n1+n2;
    	txtResultado.setText(""+ resultado);
    }

    @FXML
    void actionSubtrair(ActionEvent event) {
    	n1 = Double.parseDouble(txtn1.getText());
    	n2 = Double.parseDouble(txtn1.getText());
    	resultado = n1-n2;
    	txtResultado.setText(""+ resultado);
    }


}
