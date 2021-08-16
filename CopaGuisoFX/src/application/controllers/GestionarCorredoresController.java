package application.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GestionarCorredoresController {

	@FXML
	private Scene scene;
	private Stage stage;
	private Parent root;
	private FXMLLoader cargador;

	@FXML
	private Button btnNuevoCorredor;

	@FXML
	private Button btnModificarCorredor;

	@FXML
	private Button btnEliminarCorredor;

	@FXML
	private Button btnNuevoHost;

	@FXML
	private Button btnActivarHost;

	@FXML
	private Button btnDesactivarHost;

	@FXML
	private Button btnVerProtocolo;

	@FXML
	private Button btnNuevaCategoria;

	@FXML
	private Button btnModificarReglas;

	@FXML
	private Button btnVolverNuevoCorredor;

	@FXML
	private Button btnGuardarNuevoCorredor;

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

	public void nuevoCorredor(ActionEvent evento) throws IOException {
		abrirModal("/application/views/modalNuevoCorredorView.fxml");
	}
	
	public void modificarCorredor (ActionEvent evento) throws IOException {
		abrirModal("/application/views/modalModificarCorredorView.fxml");
	}
	
	public void eliminarCorredor (ActionEvent evento) throws IOException {
		abrirModal("/application/views/modalEliminarCorredorView.fxml");
	}
	
	
	public void botonCerrarModal(ActionEvent evento) {
		((Node) (evento.getSource())).getScene().getWindow().hide();
	}

	public void nuevaCategoria(ActionEvent evento) throws IOException {
		abrirModal("/application/views/modalNuevaCategoriaView.fxml");
	}
	
	public void modificarReglas (ActionEvent evento) throws IOException {
		abrirModal("/application/views/modalModificarReglasView.fxml");
	}
	
	public void nuevoHost (ActionEvent evento) throws IOException {
		abrirModal("/application/views/modalNuevoHostView.fxml");
	}
	
	public void nuevaContraseña (ActionEvent evento) throws IOException {
		abrirModal("/application/views/modalNuevaContraseñaView.fxml");
	}
	
	public void verProtocolo (ActionEvent evento) throws IOException {
		abrirModal("/application/views/modalInformacionView.fxml");
	}

}
