package SongLibrary;

public class Song implements Comparable<Song>{
	 
	  String Title;
	  String Artist;
	  String Album;
	  String Year;

	/**
	 * Constructor for Objects
	 * 
	 * @param Title = Song title
	 * @param Artist = Song artist
	 * @param Album = Song album
	 * @param Year = Song year
	 */
	
	public Song(String Title, String Artist, String Album, String Year) 
	{
		this.Title = Title;
		this.Artist = Artist;
		this.Album = Album;
		this.Year = Year;
		
	}
	
	/**
	 * Constructor for just Title and Artist
	 * @param Title = Song title
	 * @param Artist = Song Artist
	 */
	public Song(String Title, String Artist){
		this(Title, Artist, "","");
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
	public String getYear(){
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
	public void setYear(String Year){
		this.Year = Year;
	}
	
	/**
	 * compareTo compares the string to make sure user is not entering the same song
	 */
	@Override
	public int compareTo(Song obj){
		return Title.toLowerCase().compareTo(obj.Title.toLowerCase());
	}

	/**
	 * equals method checks to see if a songs artist and title are duplicates
	 */
	public boolean equals(Object obj){
		if(this == obj){
			return true;
			}
		if (obj == null){
			return false;
		}
		Song song = (Song) obj;
		return Title.equalsIgnoreCase(song.Title) && Artist.equalsIgnoreCase(song.Artist);
	}
	
}
