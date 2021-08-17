package application.controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
	
	private Parent root;
	private Scene scene;
	
	
	@Override
	public void start(Stage stagePrincipal) {
		try {
			root = FXMLLoader.load(getClass().getResource("/application/views/MainView.fxml"));
			scene = new Scene(root);
			scene.getStylesheets().clear();
			scene.getStylesheets().add(getClass().getResource("/application/views/MainCSS.css").toExternalForm());				
			
			Image icono = new Image("file:///C:/Users/Santiago/Documents/GitHub/CopaGuiso/CopaGuisoFX/src/media/guiso.png");
			stagePrincipal.getIcons().add(icono);
			stagePrincipal.setTitle("Copa Guiso");
			
			stagePrincipal.setScene(scene);
			stagePrincipal.setResizable(false);
			stagePrincipal.show();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);		
	}
}
