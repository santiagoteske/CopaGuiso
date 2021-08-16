package application.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RegistrarCarreraController {
	@FXML
	private Scene scene;
	private Stage stage;
	private Parent root;
	private FXMLLoader cargador;
	
	
	public void abrirModal(String ruta) throws IOException {
		cargador = new FXMLLoader(getClass().getResource("/application/views/MenuPrincipalView.fxml"));
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
	
	public void btnSancionar (ActionEvent evento) throws IOException {
		abrirModal("/application/views/modalSancionarView.fxml");
	}
	
}
