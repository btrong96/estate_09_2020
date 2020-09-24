package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connection.connection;
import model.category_district;

public class category_district_dao {

	public static List<category_district> layDanhSachSach() {
		List<category_district> lstCatoryDistrict = new ArrayList<category_district>();

		Connection conn = null;

		try {
			conn = connection.layKetNoi();
			String strSQL = "select id,name from category_district";
			Statement comm = conn.createStatement();
			ResultSet rs = comm.executeQuery(strSQL);
			category_district objCatoryDistrict;
			while (rs.next()) {
				objCatoryDistrict = new category_district();
				objCatoryDistrict.setId(rs.getInt("id"));
				objCatoryDistrict.setName(rs.getString("name"));			
				lstCatoryDistrict.add(objCatoryDistrict);
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
		return lstCatoryDistrict;
	}
}
