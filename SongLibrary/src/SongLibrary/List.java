package SongLibrary;

public class List {

	static Object top;
	static Object selection;
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
	
	
	Object current = top;
	
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
