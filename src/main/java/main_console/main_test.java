package main_console;

import java.util.List;

import dao.category_building_dao;
import dao.category_deal_dao;
import dao.category_district_dao;
import model.category_building;
import model.category_deal;
import model.category_district;

public class main_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
			List<category_building> danhSachLoaiToaNha = category_building_dao.layDanhSachSach();
			    System.out.println("I.  Danh sách loại tòa nhà");
			for(category_building bd : danhSachLoaiToaNha) {				
				System.out.println("Tên loại tòa nhà: " + bd.getName());
			}
						
	
			List<category_district> danhSachQuan = category_district_dao.layDanhSachSach();
				    System.out.println("II. Danh sách quận");
				for(category_district bd : danhSachQuan) {				
					System.out.println("Tên quận: " + bd.getName());
			}
				
		
			List<category_deal> danhSachGiaoDich = category_deal_dao.layDanhSachSach();
					    System.out.println("III. Danh sách loại giao dịch");
					for(category_deal bd : danhSachGiaoDich) {				
						System.out.println("Tên loại giao dịch: " + bd.getName());
			}				
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fail");
		}
	}
}
