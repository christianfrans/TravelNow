/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelnow.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import travelnow.Helper.Helper;
import travelnow.Model.MainModel;
import travelnow.Query.UserQuery;

/**
 *
 * @author user
 */
public class UserController extends BaseController{
	UserQuery query = new UserQuery();
	Helper helper = new Helper();
	
	public ResultSet id(String name, MainModel model){
		String sql = this.query.users;
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, model.getUsers_id());
		
		return this.getWithParameter(map, sql);
	}
	
	public Boolean input(MainModel model) throws ParseException{
		String date = helper.parseDateToString(model.getTransactiondate());
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, model.getUsers_id());
		map.put(2, model.getHotels());
		map.put(3, model.getPackets());
		map.put(4, model.getAirlines());
		map.put(5, model.getEstimation());
		map.put(6, model.getPrice());
		map.put(7, date);
		
		String sql = this.query.insert;
		
		return this.preparedStatement(map, sql);
	}
	
	
//	public Boolean hargahotel(MainModel model) throws SQLException {
//
//		Map<Integer, Object> map = new HashMap<>();
//		map.put(1, model.getHotels());
//
//		String sql = this.query.pilihhotel;
//
//		ResultSet rs = this.getWithParameter(map, sql);
//
//		if (rs.next() == false) {
//			return false;
//		}
//		return true;
//	}
//	
//	public Boolean hargamaspakai(MainModel model) throws SQLException {
//
//		Map<Integer, Object> map = new HashMap<>();
//		map.put(1, model.getAirlines());
//
//		String sql = this.query.pilihmaskapai;
//
//		ResultSet rs = this.getWithParameter(map, sql);
//
//		if (rs.next() == false) {
//			return false;
//		}
//		return true;
//	}
//	
//	public Boolean hargapaket(MainModel model) throws SQLException {
//
//		Map<Integer, Object> map = new HashMap<>();
//		map.put(1, model.getPackets());
//
//		String sql = this.query.pilihpaket;
//
//		ResultSet rs = this.getWithParameter(map, sql);
//
//		if (rs.next() == false) {
//			return false;
//		}
//		return true;
//	}
	
	
}
