package SongLibrary;

public class Library{
	
	static Song front;
	static Song selection;
	static int numSongs;
	public Library()
	{
		numSongs = 0;
		selection = front;
		
	}

	//To add song(s)
	public boolean addSong(Song song){
		
		if(Library.selection != null && Library.front != null){
			numSongs++;
			selection = song;
		}
		if (front == null){
			front = song;
		}
		numSongs++;
		return true;
	}
		
	
	//To remove song(s)
	private static void deleteSong(Song song){
		
		numSongs--;

		Library.deleteSong(song);	
		
	}
	
	//To edit song(s)
	private static void editSong(Song song) {
		Library.editSong(song);
		
	}
	public static int getIndex(Song song){
		int index = 0;
		if(song == null){
			return 0;
		}
		Song currentSong = front;
		if(currentSong == null){
			return 0;
		
		}
		
		return index;
	}
}
