package mc.model;

public class Track {
	private long id;
	private String name;
	private String artist;
	private String album;
	

	public Track(long id, String name, String artist, String album) {
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.album = album;
	}

	public Track(long id, String name, String artist) {
		this(id, name,artist,"<Unknown>");
	}
	
	public Track(long id,String name) {
		this(id,name,"<Unknown>");
	}
	
	public Track(long id) {
		this(id,"<Unknown>");
	}
	
	public Track() {
		this(0);
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setAlbum(String album) {
		this.album = album;
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
