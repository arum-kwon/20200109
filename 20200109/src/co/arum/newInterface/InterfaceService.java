package co.arum.newInterface;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface InterfaceService {
	default void run() {  //인터페이스가 갖고 있는 메서드
	}
	
	List<?> allSelect() throws SQLException; //인터페이스는 기본이 public
	Object select(Object o) throws SQLException;
	int insert(Object o) throws SQLException;
	int update(Object o) throws SQLException;
	int delete(Object o) throws SQLException;
}
