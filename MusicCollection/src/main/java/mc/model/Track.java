package mc.model;

public class Track {
	private final long id;
	private final String name;
	private final String artist;
	private final String album;
	

	public Track(long id, String name, String artist, String album) {
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.album = album;
	}
	
	public Track(long id, String name, String artist) {
		this(id, name,artist,null);
	}
	
	public Track(long id,String name) {
		this(id,name,null);
	}
	
	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public String getAlbum() {
		return album;
	}

	public long getId() {
		return id;
	}
}
