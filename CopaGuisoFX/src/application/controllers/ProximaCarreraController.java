package application.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.BlendMode;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class ProximaCarreraController implements Initializable {
	
	@FXML
	private WebView webImagen;
	
	@FXML
	WebEngine motor;	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
		cargarImagenProximaCarrera("https://media.discordapp.net/attachments/814585114884571189/872144843709771817/04_AZERBAIJAN.png");	
		//cargarImagenProximaCarrera("https://media.discordapp.net/attachments/651950020999774214/874102933799723018/04_AZERBAIJAN.jpg");
	}
	
	public void cargarImagenProximaCarrera(String ruta) {
		
		motor = webImagen.getEngine();		
		motor.load(ruta);
		//webImagen.setBlendMode(BlendMode.DARKEN); //Modifica el fondo del WebView
		
	}
	
	
	
}
