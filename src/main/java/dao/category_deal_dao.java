package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connection.connection;

import model.category_deal;

public class category_deal_dao {

	public static List<category_deal> layDanhSachSach() {
		List<category_deal> lstCatoryDeal = new ArrayList<category_deal>();

		Connection conn = null;

		try {
			conn = connection.layKetNoi();
			String strSQL = "select id,name from category_deal";
			Statement comm = conn.createStatement();
			ResultSet rs = comm.executeQuery(strSQL);
			category_deal objCatoryDeal;
			while (rs.next()) {
				objCatoryDeal = new category_deal();
				objCatoryDeal.setId(rs.getInt("id"));
				objCatoryDeal.setName(rs.getString("name"));			
				lstCatoryDeal.add(objCatoryDeal);
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
		return lstCatoryDeal;
	}
}
