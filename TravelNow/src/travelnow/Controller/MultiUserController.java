/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelnow.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import travelnow.Helper.Helper;
import travelnow.Model.MainModel;
import travelnow.Query.PreQuery;

/**
 *
 * @author user
 */
public class MultiUserController extends BaseController{
	PreQuery query = new PreQuery();
	Helper helper = new Helper();
	
	public Boolean register(MainModel model) throws SQLException{
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, model.getFirst());
		map.put(2, model.getLast());
		map.put(3, model.getAddress());
		map.put(4, model.getEmail());
		map.put(5, model.getPhone());
		map.put(6, model.getUsername());
		map.put(7, model.getPassword());
		
		String sql = this.query.register;
		
		return this.preparedStatement(map, sql);
	}
	
	public String login (MainModel model, String status) throws SQLException{ //pencarian bedasarkan ID
     String sql = this.query.login;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, model.getUsername());
	 map.put(2, model.getPassword());
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			status = rs.getString("status");
			if (status.equals("U")) {
				return "U";
			} else {
				return "A";
			}
		}

		return "salah";
	}
}
