package partiel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class Main extends Application{

	public void start(Stage stage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("partiel/Sample.fxml"));
		
		Scene scene = new Scene(root, 800 , 600);
		stage.setTitle("Partiel de Java, Benjamin MAERTEN");
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
