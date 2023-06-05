package lk.ijse.groupChat.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientLoginFormController {
    @FXML
    private AnchorPane Login;

    @FXML
    private Button btnlogin;

    @FXML
    private TextField txtUserName;

    static String username;

    @FXML
    void btnloginOnAction(ActionEvent event) throws IOException {

        username=txtUserName.getText();
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(ClientLoginFormController.class.getResource("../view/ClientForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();

    }

}
