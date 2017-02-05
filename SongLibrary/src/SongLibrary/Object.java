package SongLibrary;

public class Object {
	 String Title;
	 String Artist;
	 String Album;
	 String Year;

	/**
	 * Constructor for Song
	 * 
	 * @param Title = Song title
	 * @param Artist = Song artist
	 * @param Album = Song album
	 * @param Year = Song year
	 */
	
	public Object(String Title, String Artist, String Album, String Year) 
	{
		this.Title = Title;
		this.Artist = Artist;
		this.Album = Album;
		this.Year = Year;
		
	}
	
	/**
	 * Song Title Getter
	 * @return the title of the song
	 */
	public String getTitle(){
		return this.Title;
		
	}
	
	/**
	 * Song Artist Getter
	 * @return the Artist of the song
	 */
	public String getArtist(){
		return this.Artist;
	}
	
	/**
	 * Song Album Getter
	 * @return the Album of the song
	 */
	public String getAlbum(){
		return this.Album;
	}

	/**
	 * Song Year Getter
	 * @return the Year of the Song
	 */
	public String getYear(){
		return this.Year;
	}
	
	/**
	 * Song Title Setter
	 * @param set the Title of the Song
	 */
	public void setTitle(String Title){
		this.Title = Title;
	}
	
	/**
	 * Song Artist Setter
	 * @param set the Artist of the Song
	 */
	public void setArtist(String Artist){
		this.Artist = Artist;
	}
	
	/**
	 * Song Album Setter
	 * @param set the Album of the Song
	 */
	public void setAlbum(String Album){
		this.Album = Album;
	}
	
	/**
	 * Song Year Setter
	 * @param set the Year of the Song
	 */
	public void setYear(String Year){
		this.Year = Year;
	}
}
