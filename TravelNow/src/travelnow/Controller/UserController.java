/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelnow.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
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
     String sql = this.query.hotels;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, model.getHotels());
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			hotelsID = rs.getString("id");
		}

		return hotelsID;
	}
	
	
	public String airlinesID (MainModel model, String airlinesID) throws SQLException{ //pencarian bedasarkan ID
     String sql = this.query.airlines;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, model.getAirlines());
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			airlinesID = rs.getString("id");
		}

		return airlinesID;
	}
	
	public String packetsID (MainModel model, String packetsID) throws SQLException{ //pencarian bedasarkan ID
     String sql = this.query.packets;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, model.getPackets());
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			packetsID = rs.getString("id");
		}

		return packetsID;
	}
	
	public String hotelsPrice (MainModel model, String hotelsPrice) throws SQLException{ //pencarian bedasarkan ID
     String sql = this.query.hotels;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, model.getHotels());
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			hotelsPrice = rs.getString("price");
		}

		return hotelsPrice;
	}
	
	
	public String airlinesPrice (MainModel model, String airlinesPrice) throws SQLException{ //pencarian bedasarkan ID
     String sql = this.query.airlines;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, model.getAirlines());
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			airlinesPrice = rs.getString("price");
		}

		return airlinesPrice;
	}
	
	public String packetsPrice (MainModel model, String packetsPrice) throws SQLException{ //pencarian bedasarkan ID
     String sql = this.query.packets;
     
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
		int passengers = Integer.parseInt(model.getPassengers());
		
		Calculation calculation = new Calculation();
		int totalPrice = calculation.calculate(estimation, hotels, packets, airlines, passengers);
		
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
		map.put(6, model.getPassengers());
		map.put(7, totalPrice);
		map.put(8, date);
		
		String sql = this.query.insert;
		
		return this.preparedStatement(map, sql);
	}
	
	public ResultSet Bookings(String usersID) { //mengambil data
		Map<Integer, Object> map = new HashMap<>();
		
		map.put(1, usersID);
		String sql = this.query.get;
		return this.getWithParameter(map, sql);
	}
	
	public Boolean delete(LocalDateTime deleted_at, String usersID) throws ParseException {  //untuk delete
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, deleted_at);
		map.put(2, usersID);
		String sql = this.query.delete;

		return this.preparedStatement(map, sql);
	}
	
	//untuk melempar balik dari bookings ke user
	public String username (String username, String usersID) throws SQLException{
     String sql = this.query.username;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, usersID);
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			username = rs.getString("username");
		}

		return username;
	}
	
	//untuk melempar balik dari bookings ke user
	public String password (String password, String usersID) throws SQLException{
     String sql = this.query.username;
     
     Map<Integer, Object>map = new HashMap<>();
     map.put(1, usersID);
	 
	 ResultSet rs = this.getWithParameter(map, sql);
	 
	 if (rs.next()) {
			password = rs.getString("password");
		}

		return password;
	}
	
	public String getHotels(String combo, JComboBox combobox) throws SQLException { //mengambil data
		String sql = this.query.cb_hotels;
		ResultSet rs = this.get(sql);

		while (rs.next()) {
			combo = rs.getString("name");
			combobox.addItem(combo);
		}
		return combo;
	}
	
	public String getAirlines(String combo, JComboBox combobox) throws SQLException { //mengambil data
		String sql = this.query.cb_airlines;
		ResultSet rs = this.get(sql);

		while (rs.next()) {
			combo = rs.getString("name");
			combobox.addItem(combo);
		}
		return combo;
	}
	
	public String getPackets(String combo, JComboBox combobox) throws SQLException { //mengambil data
		String sql = this.query.cb_packets;
		ResultSet rs = this.get(sql);

		while (rs.next()) {
			combo = rs.getString("name");
			combobox.addItem(combo);
		}
		return combo;
	}
	
	public String bookingsID(MainModel model, int totalPrice, String bookingsID) throws SQLException, ParseException { //pencarian bedasarkan ID
		String date = helper.parseDateToString(model.getTransactiondate());
		String sql = this.query.bookings;

		Map<Integer, Object> map = new HashMap<>();
		map.put(1, totalPrice);
		map.put(2, date);

		ResultSet rs = this.getWithParameter(map, sql);

		if (rs.next()) {
			bookingsID = rs.getString("id");
		}

		return bookingsID;
	}
	
	public ResultSet passenger(String usersID) { //mengambil data
		Map<Integer, Object> map = new HashMap<>();
		
		map.put(1, usersID);
		String sql = this.query.passenger;
		return this.getWithParameter(map, sql);
	}
	
	public Boolean inputPassengers(MainModel model) throws SQLException{
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, model.getBookingsID());
		map.put(2, model.getFirst());
		map.put(3, model.getLast());
		map.put(4, model.getEmail());
		map.put(5, model.getPhone());
		
		String sql = this.query.inputPassengers;
		
		return this.preparedStatement(map, sql);
	}
	
	public String countPassengers(MainModel model, String countPassengers) throws SQLException {

		Map<Integer, Object> map = new HashMap<>();
		map.put(1, model.getBookingsID());

		String sql = this.query.count;
		ResultSet rs = this.getWithParameter(map, sql);
		
		if (rs.next()) {
			countPassengers = rs.getString("bookings_id");
		}
		
		return countPassengers;
	}
}
