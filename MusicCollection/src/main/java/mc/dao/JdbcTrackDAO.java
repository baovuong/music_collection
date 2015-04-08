package mc.dao;

import java.util.List;

import javax.sql.DataSource;

import mc.dao.mapper.TrackMapper;
import mc.model.Track;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTrackDAO implements TrackDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
		dataSource = ds;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, String artist, String album) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO tracks (name,artist,album) VALUES (?,?,?)";
		jdbcTemplate.update(SQL, name,artist,album);
	}

	@Override
	public Track get(long id) {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM tracks WHERE id=?";
		Track track = jdbcTemplate.queryForObject(SQL,new Object[]{id}, new TrackMapper());
		return track;
	}

	@Override
	public List<Track> list() {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM tracks";
		List<Track> tracks = jdbcTemplate.query(SQL, new TrackMapper());
		return tracks;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM tracks WHERE id = ?";
		jdbcTemplate.update(SQL,id);
	}

	@Override
	public void update(long id, String name, String artist, String album) {
		// TODO Auto-generated method stub
		String SQL = "UPDATE tracks SET name=?,artist=?,album=? WHERE id=?";
		jdbcTemplate.update(SQL,name,artist,album,id);
	}

}
