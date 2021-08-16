module CopaGuisoFX {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.media;
	requires javafx.base;
	requires javafx.web;
	
	opens application.controllers to javafx.graphics, javafx.fxml;
}
