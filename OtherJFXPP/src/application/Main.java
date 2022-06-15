package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		
		
		//Group root = new Group();
		Scene scene	= new Scene(root, Color.WHITE);
		
		Image icon = new Image("T4S.PNG");
		stage.getIcons().add(icon);
		stage.setTitle("JavaFx Brief T4S Agadir");
		//stage.setWidth(500);
		//stage.setHeight(500);
		//stage.setFullScreen(true);
		//stage.setFullScreenExitHint("Press z to escape");
		//stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("z"));
		stage.setScene(scene);
		stage.show();
		
	}
	
	
}
