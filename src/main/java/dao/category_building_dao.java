package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connection.connection;
import model.category_building;

public class category_building_dao {
	public static List<category_building> layDanhSachSach() {
		List<category_building> lstCatoryBuilding = new ArrayList<category_building>();

		Connection conn = null;

		try {
			conn = connection.layKetNoi();
			String strSQL = "select id,name from category_building";
			Statement comm = conn.createStatement();
			ResultSet rs = comm.executeQuery(strSQL);
			category_building objCatoryBuilding;
			while (rs.next()) {
				objCatoryBuilding = new category_building();
				objCatoryBuilding.setId(rs.getInt("id"));
				objCatoryBuilding.setName(rs.getString("name"));			
				lstCatoryBuilding.add(objCatoryBuilding);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.isClosed();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return lstCatoryBuilding;
	}
}
