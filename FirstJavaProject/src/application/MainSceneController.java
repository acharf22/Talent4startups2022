package application;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class MainSceneController {

	// Event Listener on Button.onAction
	@FXML
	public void btnOKClicked(ActionEvent event) {
	 
			Stage mainWindow (Stage) Text.getScene().getWindow();
			String title = tTt.getText();
			mainWindow.getTitle(title);
	}
}
