package partiel;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.scene.chart.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class Controller {
	public void initialize(URL url, ResourceBundle resourceBundle)
	{
		File myObj = new File("D:\\JavaWorkspace\\Tp6Fx\\src\\partiel\\test.txt");
	    if (myObj.exists()) {
	      System.out.println("File name: " + myObj.getName());
	    } else {
	      System.out.println("The file does not exist.");
	    }
	    try {
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	          String[] datas = data.split(",");
	          Glaciers myGla = new Glaciers(Integer.parseInt(datas[0]),Integer.parseInt(datas[0]),Integer.parseInt(datas[0]));
	          
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
}
