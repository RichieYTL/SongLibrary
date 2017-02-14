package view;

//added SelectionMode
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.ResourceBundle;

import app.Song;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.SingleSelectionModel;
import java.lang.Object;




public class SongLibraryController {
	
	//
	@FXML ListView<Song> songListView;
	ObservableList<String> listViewData =FXCollections.observableArrayList();

	@FXML Button add;
	@FXML Button edit;
	@FXML Button delete;
	@FXML TextField title;
	@FXML TextField artist;
	@FXML TextField album;
	@FXML TextField year;
	@FXML MenuItem save;
	
	//
	String titletext;
	String artisttext;
	String albumtext;
	String yeartext;

	public void addButtonAction(ActionEvent e, String titletext, String artisttext, 
			String albumtext, String yeartext ){
		titletext = title.getText();
		artisttext = artist.getText();
		albumtext = album.getText();
		yeartext = year.getText();
		//addSong(titletext, artisttext, albumtext, yeartext, listViewData);
		return;
	}

	public void editButtonAction(ActionEvent e, String titletext, String artisttext, 
			String albumtext, String yeartext){
		titletext = title.getText();
		artisttext = artist.getText();
		/*nullcheck?
		if(titletext == null || artisttext == null){

		}
		*/
		albumtext = album.getText();
		yeartext = year.getText();
		Song editedSong = new Song(titletext, artisttext, albumtext, yeartext);

		//setSelectedItem(T value)-Sets the value of the property selectedItem.
		//listViewData.setSelectedItem(editedSong);
		return;
	}

//
	public void deleteButtonAction(ActionEvent e){
		int songToDel = songListView.getSelectionModel().getSelectedIndex();
		listViewData.remove(songToDel);
		return;
	}

	public void changeDetails(ActionEvent e){
		//Song selectedSong = listViewData.getSelectionModel().getSelectedItem();
		//title = selectedSong.getTitle();
		//artist = selectedSong.getArtist();
		//album = selectedSong.getAlbum();
		//year = selectedSong.getYear();
		return;
	}

}
