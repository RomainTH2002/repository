package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

public class EntrerController {

	  @FXML
	    private Button entrerbtn;
	    @FXML
	    private ColorPicker color;

	    @FXML
	    private TextField user;
	    
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
				
		}
		
		
		
		public void BoutonEntrer(ActionEvent event) throws IOException {
			System.out.println("marche");
			PauseTransition p = new PauseTransition();
			p.setDuration(Duration.seconds(2));
			p.setOnFinished(ev -> {
				System.err.print("Logined");
				entrerbtn.getScene().getWindow().hide();
				Stage Accueil = new Stage();
				
				Parent root = null;
				try {
					root = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Scene scene = new Scene(root);
				Accueil.setScene(scene);
				Accueil.setTitle("Bienvenue");
				Accueil.show();
			
			});
			p.play();
			
		
	}
		public void BoutonEntrerOver(ActionEvent events) throws IOException {
			entrerbtn.setText(null);
}
}
