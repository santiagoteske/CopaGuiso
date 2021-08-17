package application.controllers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainController implements Initializable {

	@FXML
	private MediaView visorVideo;

	@FXML
	private Button btnIngresar;

	@FXML
	private ChoiceBox<String> ingresarComo;

	@FXML
	private TextField campoUsuario;

	@FXML
	private PasswordField campoContraseña;

	@FXML
	private CheckBox campoRecordar;

	@FXML
	private Button campoResetearContraseña;

	private String[] opciones = { "Corredor", "Host" };

	@FXML
	private File archivo;
	private Media video;
	private MediaPlayer reproductor;

	private Boolean habilitaHost;

	private Stage stage;
	private Scene scene;
	private Parent root;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ingresarComo.setValue("Corredor"); // Setea el valor por default del choicebox
		habilitaHost = false;
		ingresarComo.getItems().addAll(opciones);
		ingresarComo.setOnAction(this::tipoIngreso); // Linkea las opciones al metodo tipoIngreso

		deshabilitarCampos();

		archivo = new File("C:\\Users\\Santiago\\Documents\\GitHub\\CopaGuiso\\CopaGuisoFX\\src\\media\\video.mp4");
		video = new Media(archivo.toURI().toString());
		reproductor = new MediaPlayer(video);
		visorVideo.setMediaPlayer(reproductor);
		reproductor.setAutoPlay(true);
		reproductor.setCycleCount(MediaPlayer.INDEFINITE);
		reproductor.setVolume(0);

		reproductor.setOnEndOfMedia(new Runnable() {
			@Override
			public void run() {
				reproductor.seek(Duration.ZERO);
				reproductor.setAutoPlay(true);
			}
		});

	}

	public void habilitarCampos() {
		campoUsuario.setOpacity(0.96);
		campoContraseña.setOpacity(0.96);
		campoUsuario.setEditable(true);
		campoContraseña.setEditable(true);
		campoRecordar.setDisable(false);
		campoResetearContraseña.setDisable(false);
		habilitaHost = true;
	}

	public void deshabilitarCampos() {
		campoUsuario.setOpacity(0.2);
		campoContraseña.setOpacity(0.2);
		campoUsuario.setEditable(false);
		campoContraseña.setEditable(false);
		campoRecordar.setDisable(true);
		campoResetearContraseña.setDisable(true);
		campoUsuario.clear();
		campoContraseña.clear();
		habilitaHost = false;
	}

	public void tipoIngreso(ActionEvent event) {
		String opcion = ingresarComo.getValue();
		if (opcion == "Host") {
			habilitarCampos();
		} else {
			deshabilitarCampos();
		}

	}

	@FXML
	private void botonIngresar(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/views/MenuPrincipalView.fxml"));
			root = loader.load();

			MenuPrincipalController controlador = loader.getController(); // Siguientes 3 lineas para el tipo de acceso
			if (!habilitaHost) {
				controlador.botonGestionar.setDisable(true);
				controlador.botonRegistrar.setDisable(true);
				controlador.btnCircuitosYTorneos.setDisable(true);
			}

			scene = new Scene(root);
			stage = new Stage();
			Image icono = new Image("file:///C:/Users/Santiago/Documents/GitHub/CopaGuiso/CopaGuisoFX/src/media/guiso.png");
			stage.getIcons().add(icono);
			stage.setTitle("Copa Guiso");
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();

			((Node) (event.getSource())).getScene().getWindow().hide(); // Cierra la ventana actual antes de abrir la
																		// nueva

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
