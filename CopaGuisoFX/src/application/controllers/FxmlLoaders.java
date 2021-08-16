package application.controllers;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class FxmlLoaders {

	private Pane view;
	
	public Pane getPage (String nombreArchivo) {
		try {
			URL urlArchivo= MenuPrincipalController.class.getResource("/application/views/"+nombreArchivo+".fxml");			
			if (urlArchivo ==null) {
				throw new java.io.FileNotFoundException("No se ha encontrado el archivo FXML");
			}
			
			view = new FXMLLoader().load(urlArchivo); 
			
		} catch(Exception e){
			System.out.println("No se encontro"+nombreArchivo+"checkear FxmlLoaders");
		}
		return view;
	}
	
	
}
