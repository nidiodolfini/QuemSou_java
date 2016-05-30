/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quemsou;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author nidio
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label hostName;
    @FXML
    private Label hostIP;
    @FXML
    private Label hostUser;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        try {
            hostName.setText("Nome do computador: " + InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            hostIP.setText("IP: " + InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        hostUser.setText("Usuário: " + System.getProperty("user.name"));
    }

}
