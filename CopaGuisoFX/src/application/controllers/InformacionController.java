package application.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class InformacionController implements Initializable {
	
	@FXML
	WebView panelWeb;
	
	@FXML
	WebEngine motor;	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
		cargarPaginaInformacion();	
		
	}
	
	public void cargarPaginaInformacion() {
		motor = panelWeb.getEngine();
		//motor.load("https://drive.google.com/file/d/1t1UO1e_BDN_ehbdcYYTcuAC5tBDG-BOi/view");
		motor.load("https://sites.google.com/view/obligatoriofsi-perez-teske/inicio");
	}
	
}
