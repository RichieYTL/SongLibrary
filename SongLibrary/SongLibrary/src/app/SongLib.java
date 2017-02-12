package app;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.BufferedReader;
import java.io.PrintWriter;;

public class SongLib extends Application {
	
	//create an observable list of songs;
	public ObservableList<Song> listOfSongs;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		//set the location of the FXML file to be loaded
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/SongLibrary/src/view/Application.fxml"));
		
		//load the FXML file
		Parent root;
	try{
		root = loader.load();
	}
	//report an error if found
	catch (IOException e){
		return;
	}
		
		//create a new stage that is not resizable, set the title to Song Library
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Song Library");
		primaryStage.setResizable(false);  
		primaryStage.show();
		
		
		
	}
	
	/**
	 * Method to write text to a file.
	 * @param listOfSongs is the list of songs from the application
	 * @throws Exception
	 */
	public static void writeToFile(ObservableList<Song> listOfSongs) throws Exception{

		File file = new File("Library.txt");
		String delimiter = " ";
		
		if(!file.exists()){
			file.createNewFile();
		}
		
		PrintWriter writer = new PrintWriter(file);
		for(Song song : listOfSongs){	
			writer.println(song.getTitle() + delimiter + song.getArtist() + delimiter +
					song.getAlbum() + delimiter + song.getYear());
		}
		writer.close();
		
	}
	/**
	 * Method to read text from a file
	 * @param listOfSongs is the library of songs from the application
	 * @throws Exception
	 */
	public static void readFromFile(ObservableList<Song> listOfSongs) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader("Library.txt"));
		
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }  
		} 
		finally {
		    br.close();
		}	
	}
		
	//method for adding songs to the library
	public boolean addSong(String Title, String Artist, String Album, String Year){
		Song newSong = new Song(Title, Artist, Album, Year);
		
		for(Song s : listOfSongs){
			if (s.duplicate(newSong) == 1){
				return false;
			}
		}
		return listOfSongs.add(newSong);
	}
	
	//method for editing songs in the library
	public boolean editSong(){
		
		
	return true;	
	}
	
	//method for deleting songs in the library
	public boolean deleteSong(Song o){
		if(listOfSongs.contains(o)){
			listOfSongs.remove(o);
			return true;
		}
		else
			return false;
	}
		
	//launch the application
	public static void main(String[] args){
		launch(args);
	}

}
