/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author lkies
 */
public class HolaFXController implements Initializable {
    
    @FXML
    private Label theLabel;
    @FXML
    private Label nombreBoton;
    @FXML
    private Rectangle rectangulo;
    @FXML
    private Slider slider;
    @FXML
    private ColorPicker selectColorRec;
    @FXML
    private Line linea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleButton(ActionEvent event) {
        theLabel.setText("Hola Mundo!");
        
    }
    @FXML
    private void botonNombre(ActionEvent event) {
        nombreBoton.setText("Borja, Darío y Ángel");
    }

    @FXML
    private void rotar(MouseEvent event) {
        rectangulo.setRotate(slider.getValue());
    }

    @FXML
    private void CambiarColorRec(ActionEvent event) {
        linea.setStroke(selectColorRec.getValue());
        
    }
    
}
