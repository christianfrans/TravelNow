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
			+ ", departuredate) VALUES (?,?,?,?,?,?,?,?)";//INPUT
	
	public String usersID = "SELECT * FROM users WHERE username = ? AND password = ?";//GETTING VALUES
	public String hotels = "SELECT * FROM hotels WHERE name = ?";
	public String airlines = "SELECT * FROM airlines WHERE name = ?";
	public String packets = "SELECT * FROM packets WHERE name = ?";
	
	public String get = "SELECT * FROM bookings WHERE users_id = ? AND deleted_at IS NULL"; //GETTING UNDELETED VALUE FROM USER BOOKINGS
	public String delete = "UPDATE bookings SET deleted_at = ? WHERE id = ?"; //SOFT DELETE
	
	public String cb_hotels = "SELECT * FROM hotels WHERE deleted_at IS NULL"; //DISPLAYING VARIANT IN COMBOBOX
	public String cb_airlines = "SELECT * FROM airlines WHERE deleted_at IS NULL";
	public String cb_packets = "SELECT * FROM packets WHERE deleted_at IS NULL";
	
	public String bookings = "SELECT * FROM bookings WHERE price = ? AND departuredate = ?"; //GO TO THE PASSENGERS FRAME
	
	public String inputPassengers = "INSERT INTO passenger (bookings_id, first_name, last_name, email, phone) VALUES (?,?,?,?,?)";//INPUTTING PASSENGERS DATA
	public String count = "SELECT COUNT(id) AS passenger_count FROM passenger WHERE bookings_id = ?";//COUNTING INPUTED PASSENGERS DATA
	
	public String username = "SELECT * FROM users WHERE id = ?";//GET VALUES
	public String password = "SELECT * FROM users WHERE id = ?";
}
