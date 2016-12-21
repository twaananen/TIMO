/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Toivo
 */
public class LogWindowController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextArea logTextArea;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    public void initData(String log){
        logTextArea.setText(log);
    }
}
