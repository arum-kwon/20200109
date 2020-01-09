package co.arum.newInterface;

import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		InterfaceServiceImpl service = new InterfaceServiceImpl();
		CountryDto dto = new CountryDto();
		
		try {
			dto = (CountryDto)service.select("CA");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.print(dto.getCountry_id() + " | ");
		System.out.print(dto.getCountry_name() + " | ");
		System.out.print(dto.getRegion_id() + "\n");
	}

}
