package sk.upjs.ics.ets.evidencia;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;

public class PridanieTovaruController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> tovaryTableView;

    @FXML
    private Button ulozButton;

    @FXML
    private ChoiceBox<?> skupinaChoiceBox;

    @FXML
    private TextField tovarTextField;

    @FXML
    void vyber(MouseDragEvent event) {

    }

    @FXML
    void initialize() {
        assert tovaryTableView != null : "fx:id=\"tovaryTableView\" was not injected: check your FXML file 'Untitled'.";
        assert ulozButton != null : "fx:id=\"ulozButton\" was not injected: check your FXML file 'Untitled'.";
        assert skupinaChoiceBox != null : "fx:id=\"skupinaChoiceBox\" was not injected: check your FXML file 'Untitled'.";
        assert tovarTextField != null : "fx:id=\"tovarTextField\" was not injected: check your FXML file 'Untitled'.";

    }
}
