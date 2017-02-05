package SongLibrary;

public class List {

	static Song top;
	static Song selection;
	static int numSongs;
	
	public List(){
		numSongs = 0;
		selection = top;
	}
	
	public static boolean searchList(String Song, String Artist)
	{
	if (top == null){
		return false;
	}	
	
	
	Song current = top;
	
	for (int i = 0; i <numSongs; i++)
	{
		if (current.Title.equals(Song) && current.Artist.equals(Artist))
		{
			return true;
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
}
