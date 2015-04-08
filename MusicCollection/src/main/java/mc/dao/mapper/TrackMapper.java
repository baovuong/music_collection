package mc.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mc.model.Track;

public class TrackMapper implements RowMapper<Track> {

	@Override
	public Track mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		long id = rs.getLong("id");
		String name = rs.getString("name");
		String artist = rs.getString("artist");
		String album = rs.getString("album");
		
		return new Track(id,name,artist,album);
	}

}
