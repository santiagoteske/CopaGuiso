package application.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MenuPrincipalController implements Initializable{

	@FXML
	private BorderPane panelPrincipal;	
	
	@FXML
	public Button botonRegistrar;
	
	@FXML
	public Button botonGestionar;
	
	@FXML
	public Button botonTorneo;
	
	@FXML
	public Button btnCircuitosYTorneos;
	

	@FXML
	private void ventanaPrincipal(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/views/MainView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = new Stage();		
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		FxmlLoaders objeto = new FxmlLoaders();
		Pane vista = objeto.getPage("TorneoActualView");
		panelPrincipal.setCenter(vista);
				
		
	}
	
	
	
	
	@FXML
	private void btnTorneo(ActionEvent evento) {
		FxmlLoaders objeto = new FxmlLoaders();
		Pane vista = objeto.getPage("TorneoActualView");
		panelPrincipal.setCenter(vista);
	}
	
	
	@FXML
	private void btnVisualizador (ActionEvent evento) {
		FxmlLoaders objeto = new FxmlLoaders();
		Pane vista = objeto.getPage("VisualizadorDeDatosView");
		panelPrincipal.setCenter(vista);
	}
	
	@FXML
	private void btnCorredores (ActionEvent evento) {
		FxmlLoaders objeto = new FxmlLoaders();
		Pane vista = objeto.getPage("CorredoresView");
		panelPrincipal.setCenter(vista);
	}
	
	@FXML
	private void btnProximaCarrera (ActionEvent evento) {
		FxmlLoaders objeto = new FxmlLoaders();
		Pane vista = objeto.getPage("ProximaCarreraView");
		panelPrincipal.setCenter(vista);
	}
	
	@FXML
	private void btnInformacion (ActionEvent evento) {
		FxmlLoaders objeto = new FxmlLoaders();
		Pane vista = objeto.getPage("InformacionView");
		panelPrincipal.setCenter(vista);
	}
	
	@FXML
	private void btnGestionarCorredores (ActionEvent evento) {
		FxmlLoaders objeto = new FxmlLoaders();
		Pane vista = objeto.getPage("GestionarCorredoresView");
		panelPrincipal.setCenter(vista);
	}
	
	@FXML
	private void btnRegistrarCarrera (ActionEvent evento) {
		FxmlLoaders objeto = new FxmlLoaders();
		Pane vista = objeto.getPage("RegistrarCarreraView");
		panelPrincipal.setCenter(vista);
	}		
	
	@FXML
	private void btnCircuitosYTorneos (ActionEvent evento) {
		FxmlLoaders objeto = new FxmlLoaders();
		Pane vista = objeto.getPage("CircuitosYTorneoView");
		panelPrincipal.setCenter(vista);
	}
	
	
}
