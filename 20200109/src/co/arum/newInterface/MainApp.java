package co.arum.newInterface;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		allSelectPrint();
	}

	public static void allSelectPrint() {
		InterfaceServiceImpl service = new InterfaceServiceImpl();
		List<?> list = new ArrayList<CountryDto>();
		
		try {
			list = service.allSelect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(Object dto : list) {
			CountryDto countDto = (CountryDto)dto;
			System.out.print(countDto.getCountry_id() + " ");
			System.out.print(countDto.getCountry_name() + " ");
			System.out.print(countDto.getRegion_id() + "\n");
		}
	}
	public static void select() {
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
