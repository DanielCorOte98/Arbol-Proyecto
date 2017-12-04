package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javax.swing.text.html.ListView;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

 public class Controller implements Initializable {
    @FXML
    Button preBtn, inBtn, postBtn,buscarBtn, contarBtn, minBtn, maxBtn;
    @FXML
    ListView ordenList;
    TextField buscarTXF;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
}
