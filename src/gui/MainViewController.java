package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Progam;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.entities.Mainview;

public class MainViewController implements Initializable{
	
	@FXML
	private Button add;
	
	@FXML
	private TableView<Integer> maria;
	
	@FXML
	private TableColumn<Mainview, Integer> jogo;
	
	@FXML
	private TableColumn<Mainview, Integer> placar;
	
	@FXML
	private TableColumn<Mainview, Integer> minimoTemporada;
	
	@FXML
	private TableColumn<Mainview, Integer> maximoTmporada;
	
	@FXML
	private TableColumn<Mainview, Integer> minimoRecord;
	
	@FXML
	private TableColumn<Mainview, Integer> maximoRecord;

	@FXML
	public void onAddAction() {
		
	}
	
	
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNode();
	
	}
	
	private void initializeNode() {
		
	}
	
	
	
	
	
	
	
	
	
	

}
