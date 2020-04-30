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
import travelnow.Logic.Calculation;
import travelnow.Model.MainModel;
import travelnow.Query.UserQuery;

/**
 *
 * @author user
 */
public class UserController extends BaseController{
	UserQuery query = new UserQuery();
	Helper helper = new Helper();
	
	public String usersID (String username, String password, String usersID) throws SQLException{ //pencarian bedasarkan ID
     String sql = this.query.usersID;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, username);
	 map.put(2, password);
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			usersID = rs.getString("id");
		}

		return usersID;
	}
	
	public String hotelsID (MainModel model, String hotelsID) throws SQLException{ //pencarian bedasarkan ID
     String sql = this.query.hotelsID;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, model.getHotels());
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			hotelsID = rs.getString("id");
		}

		return hotelsID;
	}
	
	
	public String airlinesID (MainModel model, String airlinesID) throws SQLException{ //pencarian bedasarkan ID
     String sql = this.query.airlinesID;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, model.getAirlines());
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			airlinesID = rs.getString("id");
		}

		return airlinesID;
	}
	
	public String packetsID (MainModel model, String packetsID) throws SQLException{ //pencarian bedasarkan ID
     String sql = this.query.packetsID;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, model.getPackets());
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			packetsID = rs.getString("id");
		}

		return packetsID;
	}
	
	public String hotelsPrice (MainModel model, String hotelsPrice) throws SQLException{ //pencarian bedasarkan ID
     String sql = this.query.hotelsID;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, model.getHotels());
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			hotelsPrice = rs.getString("price");
		}

		return hotelsPrice;
	}
	
	
	public String airlinesPrice (MainModel model, String airlinesPrice) throws SQLException{ //pencarian bedasarkan ID
     String sql = this.query.airlinesID;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, model.getAirlines());
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			airlinesPrice = rs.getString("price");
		}

		return airlinesPrice;
	}
	
	public String packetsPrice (MainModel model, String packetsPrice) throws SQLException{ //pencarian bedasarkan ID
     String sql = this.query.packetsID;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, model.getPackets());
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			packetsPrice = rs.getString("price");
		}

		return packetsPrice;
	}
	
	public int totalPrice(MainModel model, String hotelsPrice, String airlinesPrice, String packetsPrice){
		int hotels = Integer.parseInt(hotelsPrice);
		int airlines = Integer.parseInt(airlinesPrice);
		int packets = Integer.parseInt(packetsPrice);
		int estimation = Integer.parseInt(model.getEstimation());
		
		Calculation calculation = new Calculation();
		int totalPrice = calculation.calculate(estimation, hotels, packets, airlines);
		
		return totalPrice;
	}
	
	public Boolean input(MainModel model, String usersID, String hotelsID, String airlinesID, String packetsID, int totalPrice) throws ParseException, SQLException{
		String date = helper.parseDateToString(model.getTransactiondate());
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, usersID);
		map.put(2, hotelsID);
		map.put(3, packetsID);
		map.put(4, airlinesID);
		map.put(5, model.getEstimation());
		map.put(6, totalPrice);
		map.put(7, date);
		
		String sql = this.query.insert;
		
		return this.preparedStatement(map, sql);
	}
	
	public ResultSet Bookings(String usersID) { //mengambil data
		Map<Integer, Object> map = new HashMap<>();
		
		map.put(1, usersID);
		String sql = this.query.get;
		return this.getWithParameter(map, sql);
	}
	
	public Boolean delete(String id) throws ParseException {  //untuk delete
		String deleted_at = "now()";

		Map<Integer, Object> map = new HashMap<>();
		map.put(1, deleted_at);
		map.put(2, id);
		String sql = this.query.delete;

		return this.preparedStatement(map, sql);
	}
}
