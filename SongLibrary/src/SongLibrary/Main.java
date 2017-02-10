package SongLibrary;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Main extends Application {
	
	Stage window;
	TableView<Song> table;
	TextField title, artist, album, year;
	
	public static void main(String[] args){
		launch(args);
	}


	@Override
	public void start(Stage primaryStage){
		window = primaryStage;
		window.setTitle("Song Library");
		primaryStage.setResizable(false);
		primaryStage.show();
		TableView<Song> table;
			
		//Column for Titles
		TableColumn<Song, String> titleColumn = new TableColumn<>("Title");
		titleColumn.setMinWidth(200);
		titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
		
		//Column for Artists
		TableColumn<Song, String> artistColumn = new TableColumn<>("Artist");
		artistColumn.setMinWidth(100);
		artistColumn.setCellValueFactory(new PropertyValueFactory<>("artist"));
		
		//Column for Albums
		TableColumn<Song, String> albumColumn = new TableColumn<>("Album");
		albumColumn.setMinWidth(100);
		albumColumn.setCellValueFactory(new PropertyValueFactory<>("album"));
		
		//Column for Years
		TableColumn<Song, String> yearColumn = new TableColumn<>("Year");
		yearColumn.setMinWidth(75);
		yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));

		/**
		 * Text boxes:
		 * Title: text field to input title
		 * Artist: text field to input artist
		 * Album: text field to input album
		 * Year: text field to input year
		 */
		title = new TextField();
		title.setPromptText("Title");
		title.setMinWidth(75);
		
		artist = new TextField();
		artist.setPromptText("Artist");
		artist.setMinWidth(75);
		
		album = new TextField();
		album.setPromptText("Album");
		album.setMinWidth(75);
		
		year = new TextField();
		year.setPromptText("Year");
		year.setMinWidth(75);
	
		
		/**
		 * Buttons:
		 * Add: adds the fields in the text input
		 * Edit: edits the current song with the information in the fields
		 * Delete: deletes the current song that is selected
		 */
		Button addButton = new Button("Add");
		addButton.setOnAction(e -> addButton());
		
		Button editButton = new Button("Edit");
		editButton.setOnAction(e -> editButton());
		
		Button deleteButton = new Button("Delete");
		deleteButton.setOnAction(e -> deleteButton());
		
		table = new TableView<>();
		table.setItems(getTitle());
		table.getColumns().addAll(titleColumn, artistColumn, albumColumn, yearColumn);	
		
		
		
		HBox horizontalBox = new HBox();
		horizontalBox.getChildren().addAll(title, artist, album, year);
		horizontalBox.setPadding(new Insets(10,10,10,10));
		
		VBox verticalBox = new VBox();
		verticalBox.getChildren().addAll(table, horizontalBox);
		Scene scene = new Scene(verticalBox);
		window.setScene(scene);
		
	}
	
	 private ObservableList<Song> getTitle() {
		// TODO Auto-generated method stub
		return null;
	}


	//Action handler for add button
	public void addButton(){
		Library song = new Library();
		song.setTitle(title.getText());
		song.setArtist(artist.getText());
		song.setAlbum(album.getText());
		song.setYear(year.getText());
		table.getItems().add(song);
		title.clear();
		artist.clear();
		album.clear();
		year.clear();
		
	}
	
	//Action handler for edit button
	public void editButton(){
		
	}
	//action handler for edit button
	public void deleteButton(){
		ObservableList<TablePosition> songCurrSelected;
		ObservableList<Library> allSongs;
		songCurrSelected = table.getSelectionModel().getSelectedCells();
		allSongs = table.getItems();
		
		songCurrSelected.forEach(allSongs::remove);

	}
	
	
	public ObservableList<Song> getSong(){
		ObservableList<Song> songs = FXCollections.observableArrayList();
		return songs;
	}
}
