package emps.TestCode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import  static org.mockito.Mockito.when;
import org.mockito.Mockito;

import com.mysql.jdbc.Connection;

import emps.Model.DBconnect;

public class DBconnectTest {
	static DBconnect DB;
	Connection conn;
	
	@Before
	public void setUp() throws Exception {
		DB= Mockito.mock(DBconnect.class);
		conn=null;
	}
	

	@Test
	public void test() {
		when(DB.connect()).thenReturn(conn);
	}


}
