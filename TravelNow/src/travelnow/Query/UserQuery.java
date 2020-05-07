/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelnow.Query;

/**
 *
 * @author user
 */
public class UserQuery {
	public String insert = "INSERT INTO bookings (users_id, hotels_id, packets_id"
			+ ", airlines_id, estimation, passengers, price"
			+ ", departuredate) VALUES (?,?,?,?,?,?,?,?)";
	
	public String usersID = "SELECT * FROM users WHERE username = ? AND password = ?";
	public String hotels = "SELECT * FROM hotels WHERE name = ?";
	public String airlines = "SELECT * FROM airlines WHERE name = ?";
	public String packets = "SELECT * FROM packets WHERE name = ?";
	
	public String get = "SELECT * FROM bookings WHERE users_id = ? AND deleted_at IS NULL";
	public String delete = "UPDATE bookings SET deleted_at = ? WHERE id = ?";
	
	public String cb_hotels = "SELECT * FROM hotels";
	public String cb_airlines = "SELECT * FROM airlines";
	public String cb_packets = "SELECT * FROM packets";
	
	public String bookings = "SELECT * FROM bookings WHERE price = ? AND departuredate = ?";
	
	
	public String passenger = "SELECT * FROM passenger WHERE bookings_id = ?";
	
	public String inputPassengers = "INSERT INTO passenger (bookings_id, first_name, last_name, email, phone) VALUES (?,?,?,?,?)";
	public String count = "SELECT COUNT FROM passenger WHERE bookings_id = ?";
	
	public String username = "SELECT * FROM users WHERE id = ?";
	public String password = "SELECT * FROM users WHERE id = ?";
}
