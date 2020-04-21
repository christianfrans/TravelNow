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
		return true; //EDIT NANTI
	}
	
	public Boolean login(MainModel model) throws SQLException {
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, model.getUsername());
		map.put(2, model.getPassword());
		
		String sql = this.query.login;
		
		ResultSet rs = this.getWithParameter(map, sql);
		
		if (rs.next() == false) {
			return false;
		}
		return true;
	}
	
	public Boolean loginadmin(MainModel model) throws SQLException {
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, model.getUsername());
		map.put(2, model.getPassword());
		
		String sql = this.query.loginadmin;
		
		ResultSet rs = this.getWithParameter(map, sql);
		
		if (rs.next() == false) {
			return false;
		}
		return true;
	}
}
