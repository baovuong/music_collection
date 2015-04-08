package mc.dao;

import java.util.List;

import javax.sql.DataSource;

import mc.model.Track;

public interface TrackDAO {
	
	public void setDataSource(DataSource ds);
	
	public void create(String name, String artist, String album);
	
	public Track get(long id);
	
	public List<Track> list();
	
	public void delete(long id);
	
	public void update(long id, String name, String artist, String album);
}
