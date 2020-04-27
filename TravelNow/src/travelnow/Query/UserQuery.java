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
			+ ", airlines_id, estimation, price"
			+ ", departuredate) VALUES (?,?,?,?,?,?,?)";
	
	public String usersID = "SELECT * FROM users WHERE username = ? AND password = ?";
	public String hotelsID = "SELECT * FROM hotels WHERE name = ?";
	public String airlinesID = "SELECT * FROM airlines WHERE name = ?";
	public String packetsID = "SELECT * FROM packets WHERE name = ?";
}
