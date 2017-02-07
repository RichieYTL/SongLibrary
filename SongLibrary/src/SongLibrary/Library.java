package SongLibrary;
import java.io.PrintWriter;
import javafx.collections.ObservableList;
import javafx.print.Printer;
import java.io.FileWriter;

public class Library implements Comparable<Song>{

	//To add song(s)
	public boolean addSong(String Title, String Artist, String Album, int Year){
		Song newSong = new Song(Title, Artist, Album, Year);
		
		return
	}
	
	//To remove song(s)
	public boolean removeSong(String Title, String Artist, String Album, int Year){
		
		return
	}
	
	//To edit song(s)
	public boolean editSong(String Title, String Artist, String Album, int Year){
		return
	}
	
	//To check for duplicate entries
	public boolean equals(Object obj){
        if (!(obj instanceof Song))
            throw new ClassCastException("A song expected.");

        Song newSong = (Song) obj;

        if (obj.equalsIgnoreCase(newSong.getTitle() && (obj.equalsIgnoreCase(newSong.getArtist()){
           
            return true;
        	}
        	
        else{
            return false;
        }
        
    }
	
	public boolean isEmpty(){
		return
	}
	
	public 
	
	static void writeStringToFile(File file, String data){
		
		
	}

	@Override
	public String compareTo(Song newSong)
		    throws ClassCastException
		    {
		        if (!(newBeer instanceof Song))
		            throw new ClassCastException("A Beer object expected.");

		        if (song.getTitle() < newSong.getTitle())
		            return -1;
		        else if (getPrice() > newSong.getArtist())
		            return 1;
		        else
		            return Song.compareToIgnoreCase(newSong.getTitle());
		    }
	
}
