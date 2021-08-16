package application.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CircuitosYTorneosController {
	
	@FXML
	private Scene scene;
	private Stage stage;
	private Parent root;
	private FXMLLoader cargador;
	
public void abrirModal(String ruta) throws IOException {
		cargador = new FXMLLoader(getClass().getResource("/application/views/CircuitosYTorneoView.fxml"));
		root = cargador.load();
		FXMLLoader loader = new FXMLLoader(getClass().getResource(ruta));
		root = loader.load();
		scene = new Scene(root);
		stage = new Stage();
		stage.setScene(scene);
		stage.initStyle(StageStyle.UNDECORATED);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.show();
	}
	
	public void modificarTorneo (ActionEvent evento) throws IOException {
		abrirModal("/application/views/modalModificarTorneoView.fxml");
	}
	
	public void cerrarVentana (ActionEvent evento) throws IOException {
		((Node) (evento.getSource())).getScene().getWindow().hide();
	}
	
	public void modificarCircuito (ActionEvent evento) throws IOException {
		abrirModal("/application/views/modalModificarCircuitoView.fxml");
	}
	
	
		
}
