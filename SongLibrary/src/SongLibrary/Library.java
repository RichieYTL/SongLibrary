package SongLibrary;
import java.io.PrintWriter;
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.print.Printer;
import java.io.FileWriter;

public class Library{
	
	static Song top;
	static Song selection;
	static int numSongs;
	ArrayList<Song> library = new ArrayList<Song>();
	
	public Library()
	{
		numSongs = 0;
		selection = top;
		
	}

	//To add song(s)
	public void addSong(Song Title, Song Artist, Song Album, Song Year){

		library.add(Title);
		library.add(Artist);
		library.add(Album);
		library.add(Year);	
		
	}
	
	//To remove song(s)
	public void removeSong(Song Title, Song Artist, Song Album, Song Year){

		library.remove(Title);
		library.remove(Artist);
		library.remove(Album);
		library.remove(Year);	
		
	}
	
	//To edit song(s)
	public static void editSong(Song Title, Song Artist, Song Album, Song Year){
		
	}
	
	static void writeStringToFile(File file, String data){
		
		
	}


}
