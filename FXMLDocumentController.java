/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uciekajacyprzycisk;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Tallos
 */
public class FXMLDocumentController implements Initializable {
	
	@FXML
	private Button button;
	public double x, y;
	public Random ran = new Random();
	
	@FXML
	private void zamknijOkno(MouseEvent eventClose) {
		Platform.exit();
	}
	
	@FXML
	private void uciekajPrzyciskiem(MouseEvent eventRun) {
		x = (double) ran.nextInt(400);
		y = (double) ran.nextInt(400);
		button.setLayoutX( x );
		button.setLayoutY( y );
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	
	
}
