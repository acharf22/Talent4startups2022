package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args); //A static method that belongs to the application class and inherited from 	
	}

	@Override
	public void start(Stage stage) {
		
/*Stage stage	= new Stage();	*/
		
		Group root = new Group(); //In order tpo construct the scene, we need to add at least a root  node
		//to pass in a root node as an argument to the constructor of the scene class
		
		Scene scene = new Scene(root); //Scene creation
		
		stage.setScene(scene); 
		stage.show();	
	}
		
	
	
}
