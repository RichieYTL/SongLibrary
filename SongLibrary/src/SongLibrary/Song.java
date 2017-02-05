package SongLibrary;

public class Song {
	 
	 private String Title;
	 private String Artist;
	 private String Album;
	 private int Year;

	/**
	 * Constructor for Objects
	 * 
	 * @param Title = Song title
	 * @param Artist = Song artist
	 * @param Album = Song album
	 * @param Year = Song year
	 */
	
	public Song(String Title, String Artist, String Album, int Year) 
	{
		this.Title = Title;
		this.Artist = Artist;
		this.Album = Album;
		this.Year = Year;
		
	}
	
	/**
	 * Title Getter
	 * @return the title of the song
	 */
	public String getTitle(){
		return this.Title;
		
	}
	
	/**
	 * Artist Getter
	 * @return the Artist of the song
	 */
	public String getArtist(){
		return this.Artist;
	}
	
	/**
	 * Album Getter
	 * @return the Album of the song
	 */
	public String getAlbum(){
		return this.Album;
	}

	/**
	 * Year Getter
	 * @return the Year of the Song
	 */
	public int getYear(){
		return this.Year;
	}
	
	/**
	 * Title Setter
	 * @param set the Title of the Song
	 */
	public void setTitle(String Title){
		this.Title = Title;
	}
	
	/**
	 * Artist Setter
	 * @param set the Artist of the Song
	 */
	public void setArtist(String Artist){
		this.Artist = Artist;
	}
	
	/**
	 * Album Setter
	 * @param set the Album of the Song
	 */
	public void setAlbum(String Album){
		this.Album = Album;
	}
	
	/**
	 * Year Setter
	 * @param set the Year of the Song
	 */
	public void setYear(int Year){
		this.Year = Year;
	}
	
	//toString to return the string with the song information
	public String toString(){
		return Title + "by" + Artist + "from the album" + Album + "released in" + Year;
	}
	
}
