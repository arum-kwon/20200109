package co.arum.newInterface;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InterfaceServiceImpl implements InterfaceService {
	
	public PreparedStatement psmt;
	public ResultSet rs;

	private String ALL_SELET= "SELECT * FROM countries";
	private String SELET= "SELECT * FROM countries WHERE country_id = ?";
	
	@Override
	public List<?> allSelect() throws SQLException {
		CountryDao dao = new CountryDao();
		CountryDto dto;
		List<CountryDto> list = new ArrayList<CountryDto>();
		
		psmt = dao.conn.prepareStatement(ALL_SELET);
		rs = psmt.executeQuery();
		while(rs.next()) {
			dto = new CountryDto();
			dto.setCountry_id(rs.getString("country_id"));
			dto.setCountry_name(rs.getString("country_name"));
			dto.setRegion_id(rs.getInt("region_id"));
			list.add(dto);
		}
		return list;
	}

	@Override
	public Object select(Object o) throws SQLException {
		CountryDao dao = new CountryDao();
		CountryDto dto = new CountryDto();
		
		psmt = dao.conn.prepareStatement(SELET);
		psmt.setString(1, (String)o);
		rs = psmt.executeQuery();
		if(rs.next()) {
			dto.setCountry_id(rs.getString("country_id"));
			dto.setCountry_name(rs.getString("country_name"));
			dto.setRegion_id(rs.getInt("region_id"));
		}
		return dto;
	}

	@Override
	public int insert(Object o) throws SQLException {
		return 0;
	}

	@Override
	public int update(Object o) throws SQLException {
		return 0;
	}

	@Override
	public int delete(Object o) throws SQLException {
		return 0;
	}

}
